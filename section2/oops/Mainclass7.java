//Conatiner
//Entity
class Dept
{
  int deptno = 10;
  String dname = "Dev";
  String loc = "BLR";

  Employee emp = null;//linkingVar

  public Dept()
  {
    
  }

  public void showDeptDetails()
  {
  	System.out.println("deptno : "+deptno);
  	System.out.println("dname : "+dname);
  	System.out.println("loc : "+loc);
  }
}

//Conatining
//Entity
class Employee
{
  int empno;
  String ename;
  String job;
  int deptno;

  public Employee(int empno,String ename,String job,int deptno)
  {
  	this.empno = empno;
    this.ename = ename;
    this.job = job;    
    this.deptno = deptno;
  }

  public void showEmpDetails()
  {
  	System.out.println("deptno : "+deptno);
  	System.out.println("empno : "+empno);
  	System.out.println("ename : "+ename);
  	System.out.println("job : "+job);
  }
}

//Service
class DeptService
{
	static int empno = 1;
	Dept d1 = new Dept();

	public void createEmployee(String ename,String job,int deptno)
	{
	 //create emp object and link emp to dept
      d1.emp = new Employee(empno,ename,job,deptno);
      empno++;
	}

	public void showFullDeptDetails()
	{
	   d1.showDeptDetails();//dept_details
	   if(d1.emp!=null)
	   {
	    d1.emp.showEmpDetails();//emp_detials
	   }
	   else
	   {
	   	System.out.println("NO EMPLOYEES IN THIS DEPARTMENT");
	   }
	}
}

class Mainclass7
{
	public static void main(String[] args) 
	{
	  DeptService ds = new DeptService();
	  ds.createEmployee("Arjun","Dev",10);
	  ds.showFullDeptDetails();	
	}
}