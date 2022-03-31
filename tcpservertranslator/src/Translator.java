
/*
 * This class will translate the English text into target translated language
 */

public class Translator 
{
	private static String translatedText;
	
	public static String Translate(String text, String targetLanguage)
	{
		// English Texts
		String text1 = "Good morning";
		String text2 = "Good night";
		String text3 = "How are you?";
		String text4 = "Thank you";
		String text5 = "Goodbye";
		String text6 = "What's up?";
		
		// Target translated language
		String target1 = "Bahasa Malaysia";
		String target2 = "Arabic";
		String target3 = "Korean";
		
		// If the English text is Good morning
		if(text.equals(text1))
		{
			// If the target translated language is Bahasa Malaysia
			if(targetLanguage.equals(target1))
			{
				translatedText = "Selamat pagi";
			}
			
			// If the target translated language is Arabic
			else if(targetLanguage.equals(target2))
			{
				translatedText = "صباحالخير";
			}
			
			// If the target translated language is Korean
			else if(targetLanguage.equals(target3))
			{
				translatedText = "좋은 아침";
			}
		}
		
		// If the English text is Good night
		else if(text.equals(text2))
		{
			// If the target translated language is Bahasa Malaysia
			if(targetLanguage.equals(target1))
			{
				translatedText = "Selamat malam";
			}
			
			// If the target translated language is Arabic
			else if(targetLanguage.equals(target2))
			{
				translatedText = "	طبتم مساءا";
			}
			
			// If the target translated language is Korean
			else if(targetLanguage.equals(target3))
			{
				translatedText = "안녕히 주무세요";
			}
		}
		
		// If the English text is How are you?
		else if(text.equals(text3))
		{
			// If the target translated language is Bahasa Malaysia
			if(targetLanguage.equals(target1))
			{
				translatedText = "Apa khabar?";
			}
			
			// If the target translated language is Arabic
			else if(targetLanguage.equals(target2))
			{
				translatedText = "كيفحالك؟";
			}
			
			// If the target translated language is Korean
			else if(targetLanguage.equals(target3))
			{
				translatedText = "어떻게 지내세요?";
			}
		}
		
		// If the English text is Thank you
		else if(text.equals(text4))
		{
			// If the target translated language is Bahasa Malaysia
			if(targetLanguage.equals(target1))
			{
				translatedText = "Terima kasih";
			}
			
			// If the target translated language is Arabic
			else if(targetLanguage.equals(target2))
			{
				translatedText = "شُكْرًا لَكَ";
			}
			
			// If the target translated language is Korean
			else if(targetLanguage.equals(target3))
			{
				translatedText = "감사합니다";
			}
		}
		
		// If the English text is Goodbye
		else if(text.equals(text5))
		{
			// If the target translated language is Bahasa Malaysia
			if(targetLanguage.equals(target1))
			{
				translatedText = "Selamat tinggal";
			}
			
			// If the target translated language is Arabic
			else if(targetLanguage.equals(target2))
			{
				translatedText = "معالسلامة";
			}
			
			// If the target translated language is Korean
			else if(targetLanguage.equals(target3))
			{
				translatedText = "안녕";
			}
		}
		
		// If the English text is What's up?
		else if(text.equals(text6))
		{
			// If the target translated language is Bahasa Malaysia
			if(targetLanguage.equals(target1))
			{
				translatedText = "Ada apa?";
			}
			
			// If the target translated language is Arabic
			else if(targetLanguage.equals(target2))
			{
				translatedText = "ماأخبارك؟";
			}
			
			// If the target translated language is Korean
			else if(targetLanguage.equals(target3))
			{
				translatedText = "뭐야?"; 
			}
		}
		
		return translatedText;
	}
}
