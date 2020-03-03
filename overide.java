class person
{
	String name,add,pn,ema;
	public person(String n,String ad,String p,String em)
	{
		name=n;
		add=ad;
		pn=p;
		ema=em;
	}
   public void	getinfo()
   {
   	System.out.println("Name:"+name+"\nClass is Person");
   }
}
class student extends person
{
	final String status;
	public student(String n,String ad,String p,String em,String sta)
	{
		super(n,ad,p,em);
		status=sta;
	}
	public void getinfo()
   {
   	System.out.println("Name:"+name+"\nClass name is Student");
   }
}
class employee extends person
{
	String office;  long sal; String dj;
	public employee(String n,String ad,String p,String em,String offi,long salary,String datjo)
	{
		super(n,ad,p,em);
	
		office=offi;
		sal=salary;
		dj=datjo;
	}
	public void getinfo()
   {
   	System.out.println("Name:"+name+"\nClass name is Employee");
   }
}
class faculty extends employee
{
	String rank;  int ot;
	public faculty(String n,String ad,String p,String em,String offi,long salary,String datjo,String rk,int hrs)
	{super(n,ad,p,em,offi,salary,datjo);
	
		rank=rk;
		ot=hrs;
	}
	public void getinfo()
   {
   	System.out.println("Name: "+name+"\nClass name is faculty");
   }
}
class staff extends employee
{
	String title;
	public staff(String n,String ad,String p,String em,String offi,long salary,String datjo,String ti)
	{super(n,ad,p,em,offi,salary,datjo);
	
		title=ti;
	}
	public void getinfo()
   {
   	System.out.println("Name:"+name+"\nClass name is Staff");
   }
}
class override
{
	public static void main(String[] args)
	{
		person p= new person("A","bangalore","9876543210","a@g.com");
		p.getinfo();
		student s= new student("B","bangalore","9876543210","b@g.com","JR");
		s.getinfo();
		employee e= new employee("C","bangalore","9876543210","c@g.com","Admin",12000,"5/7/11");
		e.getinfo();
		faculty f= new faculty("D","bangalore","9876543210","d@g.com","University",12000,"6/2/11","Prof",10);
		f.getinfo();
		staff st= new staff("E","bangalore","9876543210","a@g.com","Accounts",12000,"10/4/11","techie");
		st.getinfo();

	}
}