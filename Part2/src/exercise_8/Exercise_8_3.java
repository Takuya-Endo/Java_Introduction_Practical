package exercise_8;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Exercise_8_3 {
	
	public static void main(String[] args) {
		
		try {
			
			HttpClient client = HttpClient.newBuilder().version(Version.HTTP_1_1).followRedirects(Redirect.NORMAL).build();
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com/users/miyabilink")).GET().build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String body = response.body();
			int status = response.statusCode();
			
			String[] bodies = body.split(",");
			for (String value : bodies) {
				System.out.println(value);
			}
			System.out.println("\n" + status + "\n");
			
			ObjectMapper mapper = new ObjectMapper();
			JsonNode jsonFile = mapper.readTree(body);
			JsonNode blogUrl = jsonFile.get("blog");
			System.out.println("ブログURL\n" + blogUrl);
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
