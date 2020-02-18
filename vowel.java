import java.util.Scanner;

class vowelsOrConso
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = in.next().charAt(0);
		switch(ch)
		{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'u':
			case 'U':
			System.out.println(ch + " is a vowel.");
			break;
			default:
			System.out.println(ch + " is a consonent.");
		}
	}
}