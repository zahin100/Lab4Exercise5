import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


/*
 * This class represent the frame for the client side
 */

public class ClientTranslatorFrame extends JFrame
{
	private JLabel lblTitle;
	private JLabel lblSelectEnglishText;
	private JLabel lblTranslate;
	private JLabel lblTranslatedText;
	private JLabel lblTranslatedTextOutput;
	private JLabel lblEnglishText;
	private JLabel lblTranslateTo;
	
	public ClientTranslatorFrame() {
		getContentPane().setLayout(null);
		
		// Label for the title
		lblTitle = new JLabel(" Welcome To The Translator Application");
		lblTitle.setBackground(Color.WHITE);
		lblTitle.setOpaque(true);
		lblTitle.setFont(new Font("Serif", Font.PLAIN, 20));
		lblTitle.setBounds(174, 11, 337, 60);
		getContentPane().add(lblTitle);
		
		
		// Label select the english text
		lblSelectEnglishText = new JLabel("English Text:");
		lblSelectEnglishText.setFont(new Font("Serif", Font.PLAIN, 30));
		lblSelectEnglishText.setBounds(69, 110, 177, 49);
		getContentPane().add(lblSelectEnglishText);
		
		
		// Label translate to
		lblTranslate = new JLabel("Translate to:");
		lblTranslate.setFont(new Font("Serif", Font.PLAIN, 30));
		lblTranslate.setBounds(69, 172, 177, 49);
		getContentPane().add(lblTranslate);
		
		
		// Label for translated text
		lblTranslatedText = new JLabel("Translated text:");
		lblTranslatedText.setFont(new Font("Serif", Font.PLAIN, 30));
		lblTranslatedText.setBounds(69, 248, 199, 49);
		getContentPane().add(lblTranslatedText);
		
		
		// Label for translated text output
		lblTranslatedTextOutput = new JLabel("");
		lblTranslatedTextOutput.setOpaque(true);
		lblTranslatedTextOutput.setFont(new Font("Serif", Font.PLAIN, 20));
		lblTranslatedTextOutput.setBackground(Color.WHITE);
		lblTranslatedTextOutput.setBounds(265, 252, 337, 49);
		getContentPane().add(lblTranslatedTextOutput);
		
		
		// Label for English text
		lblEnglishText = new JLabel("");
		lblEnglishText.setOpaque(true);
		lblEnglishText.setFont(new Font("Serif", Font.PLAIN, 20));
		lblEnglishText.setBackground(Color.WHITE);
		lblEnglishText.setBounds(256, 110, 337, 49);
		getContentPane().add(lblEnglishText);
		
		
		// Label for translate to
		lblTranslateTo = new JLabel("");
		lblTranslateTo.setOpaque(true);
		lblTranslateTo.setFont(new Font("Serif", Font.PLAIN, 20));
		lblTranslateTo.setBackground(Color.WHITE);
		lblTranslateTo.setBounds(256, 184, 337, 49);
		getContentPane().add(lblTranslateTo);
		
	}
	
	// This method set the English text
	public void setEnglishText(String englishText)
	{
		lblEnglishText.setText(englishText);
	}
	
	// This method set the target translated language
	public void setTargetLanguage(String targetLanguage)
	{
		lblTranslateTo.setText(targetLanguage);
	}
		
	// This method set the translated text
	public void setTranslatedText(String translatedText)
	{
		lblTranslatedTextOutput.setText(translatedText);
	}
}
