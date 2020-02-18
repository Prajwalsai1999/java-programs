import java.util.Scanner;

class triangleclass
{
	public static void main(String args[])
	{
		int sidea, sideb, sidec;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the sides of the triangle: ");
		sidea = in.nextInt();
		sideb = in.nextInt();
		sidec = in.nextInt();

		if(sidea == sideb && sidea == sidec)
		{
			System.out.println("Triangle is Equilateral.");
		}
		else if(sidea == sideb || sideb == sidec || sidea == sidec)
		{
			System.out.println("Triangle is Isoceles.");
		}
		else
		{
			System.out.println("Triangle is Scalene.");
		}

	}
}