class a
{
	String name;
	int id;

	public a(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
}
class b
{
	String dept;
	String company;
	a a1;
	public b(String dept,String company)
	{
		this.dept = dept;
		this.company = company;

	}
	public void display(a a1)
	{

	  System.out.println("employee name :"+a1.name);
	  System.out.println("employee id :"+a1.id);
	  System.out.println("employee department :"+dept);
	  System.out.println("employee company name :"+company);

	}

}
class mainclass
{
	public static void main(String[] args) {
		a a1 = new a("prabhakar",12);
		b b1 = new b("computer science","oracle");
		b1.display(a1);
		a a2 = new a("diwakar",11);
		b b2 = new b("computer science","microsoft");
		b2.display(a2);


	}
}