interface DataBase
{
	public void adduser(String s);
	public void updateuser(String s);
}
class customerDB implements DataBase
{
	@Override
	public void adduser(String s)
	{
		System.out.println("Customer added to CustomerDB");
	}
	@Override
	public void updateuser(String s)
	{
		System.out.println("Customer updated in CustomerDB");
	}
}
class EmployeeDB implements DataBase
{
	@Override
	public void adduser(String s)
	{
		System.out.println("Employee added to EmployeeDB");
	}
	@Override
	public void updateuser(String s)
	{
		System.out.println("Employee updated in EmployeeDB");
	}
}
class DBManage
{
	public static DataBase getDBObject(String name)
	{
		DataBase db=null;
		if(name.equalsIgnoreCase("CustomerDB"))
		{
			db=new customerDB();
		}
		else if(name.equalsIgnoreCase("EmployeeDB"))
		{
			db=new EmployeeDB();
		}
		return db;
	}
}
class CustomerService
{
	public static void customer(String s)
	{
		DataBase ab = DBManage.getDBObject("CustomerDB");
		ab.adduser("supriya");
		ab.updateuser("vidya");
	}
}
class EmployeeService
{
	public static void employee(String s)
	{
		DataBase ab = DBManage.getDBObject("Employee");
		ab.adduser("priyanka");
		ab.updateuser("aishu");
	}
}
class mainclass3
{
	public static void main(String[] args)
	{
		CustomerService.customer("Customer");
	}
}