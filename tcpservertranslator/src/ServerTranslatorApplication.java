import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * This class launch the server side application
 * The server will send back the translation of the English text to the target
 * translated language to the client
 */

public class ServerTranslatorApplication 
{
	public static void main(String[] args) throws IOException
	{
		// Launch the server frame
		ServerTranslatorFrame serverTranslatorFrame = new ServerTranslatorFrame();
		serverTranslatorFrame.setVisible(true);
		
		// Bind to a port
		int portNo = 4380;
		ServerSocket serverSocket = new ServerSocket(portNo);
		
		// Server need always to be alive
		while(true)
		{
			// Accept client request for connection
			Socket socket = serverSocket.accept();
			
			// Read data from socket
			BufferedReader bufferedReader1 = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
					
			// Get the English text from client
			String text = bufferedReader1.readLine();
			serverTranslatorFrame.setEnglishText(text);
			
			// Read data from socket
			BufferedReader bufferedReader2 = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
								
			// Get the target translated language from client
			String targetLanguage = bufferedReader2.readLine();
			serverTranslatorFrame.setTargetLanguage(targetLanguage);
			
			// Translate the English text to target translated language
			String translatedText = Translator.Translate(text, targetLanguage);
			
			// Write data to socket
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			
			// Send the translated text to the client
			printWriter.println(translatedText);
			printWriter.flush();
			
			// Close everything
			bufferedReader1.close();
			bufferedReader2.close();
			socket.close();
		}

	}

}
