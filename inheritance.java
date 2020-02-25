class Parent 
{
	private String education;
	private int money;
	private int noOfCars;


public Parent(String edu,int mon,int cars)
{
	education=edu;
	money=mon;
	noOfCars=cars;

}
public String getEducation()
{
	return education;
}
public int getMoney()
{
	return money;
}
public int getnoOfCars()
{
	return noOfCars;
}
}
class child extends Parent
{
	private String hobby;
	public child(String edu,int mon,int cars,String hob)
	{
		super(edu,mon,cars);
		hobby=hob;
	}
	public String getHobby()
	{
		return hobby;
	}

}
class Inheritance
{
	public static void main(String[]args)
	{
		child m=new child("M.S.",100,5,"Cricket");
		System.out.println("Child is educated: "+m.getEducation());
		System.out.println("Child earns:"+m.getMoney()+"crores");
		System.out.println("No.of cars child has:"+m.getnoOfCars()+"cars");
		System.out.println("Hobby of child: "+m.getHobby());
	}
}