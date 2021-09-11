package exercise_8;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exercise_8_3 {
	
	public static void main(String[] args) {
		
		try {
			
			HttpClient client = HttpClient.newBuilder().version(Version.HTTP_1_1).followRedirects(Redirect.NORMAL).build();
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://api.github.com/users/miyabilink")).GET().build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			String body = response.body();
			int status = response.statusCode();
			System.out.println(body);
			System.out.println(status);
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
