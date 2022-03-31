import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTranslatorApplication 
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
		// Launch client side frame
		ClientTranslatorFrame clientTranslatorFrame = new ClientTranslatorFrame();
		clientTranslatorFrame.setVisible(true);
		
		// Connect to localhost, port 4380
		Socket socket = new Socket(InetAddress.getLocalHost(), 4380);
		
		// Write to socket
		PrintWriter printWriter1 = new PrintWriter(socket.getOutputStream());
		
		String englishText = "Good morning";
		clientTranslatorFrame.setEnglishText(englishText);
		
		// Send the English text to the server
		printWriter1.println(englishText);
		printWriter1.flush();
		
		// Write to socket
		PrintWriter printWriter2 = new PrintWriter(socket.getOutputStream());
		
		String targetLanguage = "Bahasa Malaysia";
		clientTranslatorFrame.setTargetLanguage(targetLanguage);
		
		// Send the target translated language to the server
		printWriter2.println(targetLanguage);
		printWriter2.flush();
		
		// Read data from socket
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
							
		// Get the translated text from server
		String translatedText = bufferedReader.readLine();
		clientTranslatorFrame.setTranslatedText(translatedText);
		
		// Close everything
		bufferedReader.close();
		socket.close();
	}

}
