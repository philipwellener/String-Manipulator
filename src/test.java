
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
		boolean validNum = true;
		while (validNum)
		{
		System.out.print("Which option would you like to run: \nOption 1: Replaces all the vowels with  *\nOption 2: Reverses the string\nWhich option do  you choose(in numerical represenation): ");
		int option = in.nextInt();
		System.out.print("What string would you like to use: ");
		String str1 = in.next();
		if (option == 1)
		{
			System.out.println(manip.noVowels(str1));
			validNum = false;
		}
		else if (option == 2)
		{
			System.out.println(manip.reverse(str1));
			validNum = false;
		}
		else
			System.out.println("This is not a valid. Try again");
			validNum = true;
		}
		System.out.print("If you like to play again, press 1. If you would like to end the program, press 2: ");
		int again = in.nextInt();
		if (again == 1)
			tryAgain = true;
		else if (again == 2)
			tryAgain = false;
		}
	}

}
