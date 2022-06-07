class Dept
{
	int deptno;
	String name;
	String location;

	public Dept(int deptno,String name,String location)
	{
		this.deptno=deptno;
		this.name=name;
		this.location=location;
	}

	public void showdeptdetails()
	{
		System.out.println(" dept number "+deptno);
		System.out.println(" dept name "+name);
		System.out.println(" dept location "+location);
	}
}

class Employee
{
	int empno;
    String empname;
    String empjob;
    int empdeptno;

    public Employee(int empno,String empname,String empjob,int empdeptno)
    {
    	this.empno=empno;
    	this.empname=empname;
    	this.empjob=empjob;
    	this.empdeptno=empdeptno;

    }

    public void showempdetails()
    {
    	System.out.println(" emp number "+empno);
		System.out.println(" emp name "+empname);
		System.out.println(" emp job "+empjob);
		System.out.println(" emp dept "+empdeptno);


 
    }


}
class Mainclass7
{


public static void main(String[] args) {
	
}
}










