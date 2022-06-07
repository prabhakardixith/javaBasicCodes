interface user
{
	void adduser(String uname);
	void edituser(String uname);
}
class customer implements user
{
	@Override
	public void adduser(String uname)
	{
		System.out.println("adduser() of customer class ");
		System.out.println("and customer name is : "+uname);
	}
	@Override
	public void edituser(String uname)
	{
		System.out.println("edituser() of customer class ");
		System.out.println("and customer name is : "+uname);
	}
}
class employee implements user
{
	@Override
	public void adduser(String uname)
	{
		System.out.println("adduser() of employee class ");
		System.out.println("and employee name is : "+uname);
	}
	@Override
	public void edituser(String uname)
	{
		System.out.println("edituser() of employee class  "+uname);
		System.out.println("and employee name is : "+uname);
	}
}
/* -------------------------------------------implemetation layer-----------------------*/
class userservice
{
	public static user service(String s)
	{
       if(s.equalsIgnoreCase("customer"))
       {
       	customer cs = new customer();
       	return cs;
       }
       else
       {
       	employee em = new employee();
       	return em;
       }
	}
}
class customerservice
{
    public static void cservice(String s)
    {
     user us = userservice.service("customer");
     us.adduser("prabhakar");
    }
}
class employeeservice
{
   public static void eservice(String s)
    {
     user us = userservice.service("employee");
     us.adduser("diwakar");
    }
}
class mainclass2
{
	public static void main(String[] args) 
	{
		//user us = userservice.service("customer");
		//us.adduser("prabhakar");

		customerservice.cservice("customer");
		employeeservice.eservice("employee");

		//user us1 = userservice.service("employee");
		//us1.edituser("diwakar");
	}
}