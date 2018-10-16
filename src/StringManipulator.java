
public class StringManipulator 
{
	public String noVowels(String str1)
	{
		String str2 = "";
		for(int i=0; i<str1.length(); i++)
		{
			char letter = str1.charAt(i);
			if  (letter == 'a' ||letter == 'e' ||letter == 'i' ||letter == 'o' ||letter == 'u' ||letter == 'A' ||letter == 'E' ||letter == 'I' ||letter == 'O' ||letter == 'U'); 
					letter = '*';
			str2 += letter;
		}
		return str2;
	}
	
	public String reverse(String  str1)
	{
		String str2 = "";
		for(int i=0; i<str1.length(); i--)
		{
			char letter = str1.charAt(i);
			str2 += letter;
		}
		return str2;
	}
}
