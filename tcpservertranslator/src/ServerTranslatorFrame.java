import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

/*
 * This class represent the frame for the server side
 */

public class ServerTranslatorFrame extends JFrame
{
	JLabel lblReceivedText;
	JLabel lblTextOutput;
	JLabel lblTargetLanguage;
	JLabel lblTranslateOutput;
	
	public ServerTranslatorFrame() {
		getContentPane().setLayout(null);
		
		// Label for Received text
		lblReceivedText = new JLabel("Received text (from client):");
		lblReceivedText.setBackground(Color.WHITE);
		lblReceivedText.setOpaque(true);
		lblReceivedText.setFont(new Font("Serif", Font.PLAIN, 25));
		lblReceivedText.setBounds(40, 46, 286, 45);
		getContentPane().add(lblReceivedText);
		
		
		// Label for Text output
		lblTextOutput = new JLabel("");
		lblTextOutput.setOpaque(true);
		lblTextOutput.setFont(new Font("Serif", Font.PLAIN, 25));
		lblTextOutput.setBackground(Color.WHITE);
		lblTextOutput.setBounds(336, 46, 286, 45);
		getContentPane().add(lblTextOutput);
		
		
		// Label for target language
		lblTargetLanguage = new JLabel("Translate to (from client):");
		lblTargetLanguage.setOpaque(true);
		lblTargetLanguage.setFont(new Font("Serif", Font.PLAIN, 25));
		lblTargetLanguage.setBackground(Color.WHITE);
		lblTargetLanguage.setBounds(40, 125, 286, 45);
		getContentPane().add(lblTargetLanguage);
		
		
		// Label for translate output
		lblTranslateOutput = new JLabel("");
		lblTranslateOutput.setOpaque(true);
		lblTranslateOutput.setFont(new Font("Serif", Font.PLAIN, 25));
		lblTranslateOutput.setBackground(Color.WHITE);
		lblTranslateOutput.setBounds(336, 125, 286, 45);
		getContentPane().add(lblTranslateOutput);
	}
	
	// This method set the English text
	public void setEnglishText(String englishText)
	{
		lblTextOutput.setText(englishText);
	}
	
	// This method set the target translated language
	public void setTargetLanguage(String targetLanguage)
	{
		lblTranslateOutput.setText(targetLanguage);
	}
	
	

}
