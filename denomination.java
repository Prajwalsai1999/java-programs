import java.util.Scanner;

class denomination
{
	public static void main(String args[])
	{
		int note2k, note500, note200, note100, note50, note20, note10, note5, note2, note1;
		note2k=note500=note200=note100=note50=note20=note10=note5=note2=note1=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Amount to find denomination:");
		int amt = in.nextInt();
		if(amt>=2000)
		{
			note2k = amt/2000;
			amt = amt-(2000*note2k);
		}
		if(amt>=500)
		{
			note500 = amt/500;
			amt = amt-(500*note500);
		}
		if(amt>=200)
		{
			note200 = amt/200;
			amt = amt-(200*note200);
		}
		if(amt>=100)
		{
			note100 = amt/100;
			amt = amt-(100*note100);
		}
		if(amt>=50)
		{
			note50 = amt/50;
			amt = amt-(50*note50);
		}

		if(amt>=20)
		{
			note20 = amt/20;
			amt = amt-(20*note20);
		}

		if(amt>=10)
		{
			note10 = amt/10;
			amt = amt-(10*note10);
		}

		if(amt>=5)
		{
			note5 = amt/5;
			amt = amt-(5*note5);
		}

		if(amt>=2)
		{
			note2 = amt/2;
			amt = amt-(2*note2);
		}
		if(amt>=1)
		{
			note1=amt;
		}

		System.out.println("2000 note = " + note2k);
		System.out.println("500 note = " + note500);
		System.out.println("200 note = " + note200);
		System.out.println("100 note = " + note100);
		System.out.println("50 note = " + note50);
		System.out.println("20 note = " + note20);
		System.out.println("10 note = " + note10);
		System.out.println("5 note = " + note5);
		System.out.println("2 note = " + note2);
		System.out.println("1 note = " + note1);

	}
}