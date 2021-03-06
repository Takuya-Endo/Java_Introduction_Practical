package exercise_8;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Exercise_8_2 {
	
	public static void main(String[] args) {
		
		try (Socket socket = new Socket("smtp.example.co", 60025);) {
			
//			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();
			
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("HELO smtp.example.com").append("\r\n");
			stringBuilder.append("MAIL FROM: asaka@example.com").append("\r\n");
			stringBuilder.append("RCPT TO: minato@example.com").append("\r\n");
			stringBuilder.append("DATA").append("\r\n");
			stringBuilder.append("From: asaka@example.com").append("\r\n");
			stringBuilder.append("Subject: Please send me your RPG").append("\r\n");
			stringBuilder.append("Hello minato. \\i would like to play your RPG.").append("\r\n");
			stringBuilder.append("Could you please send it me ?").append("\r\n");
			stringBuilder.append(".").append("\r\n");
			stringBuilder.append("QUIT").append("\r\n");
			
			String dataString = stringBuilder.toString();
			
			outputStream.write(dataString.getBytes());
			outputStream.flush();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	
	//「smtp.example.com」60025番ポート
	//HELO smtp.example.com
	//MAIL FROM: asaka@example.com
	//RCPT TO: minato@example.com
	//DATA
	//From: asaka@example.com
	//Subject: Please send me your RPG
	//Hello minato. \i would like to play your RPG.
	//Could you please send it me ?
	//.
	//QUIT
	
}
