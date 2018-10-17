
import java.util.Scanner;
public class test 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		StringManipulator manip = new StringManipulator();
		boolean tryAgain = true;
		while (tryAgain)
		{
		System.out.println("Which option would you like to run: \nOption 1: Replaces all the vowels with  *\nOption 2: Reverses the string\nWhich option do  you choose(in numerical represenation)");
		int option = in.nextInt();
		System.out.println("What string would you like to use");
		String str1 = in.next();
		if (option == 1)
		{
			System.out.println(manip.noVowels(str1));
		}
		if (option == 2)
		{
			System.out.println(manip.reverse(str1));	
		}
		}
	}

}
