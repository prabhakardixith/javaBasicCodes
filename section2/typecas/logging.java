interface User
{

}

//Entity
class Admin implements User
{
	String name;
	int empid;
	int pwd;

	public Admin(String name,int empid,int pwd)
	{
		this.name = name;
		this.empid = empid;
		this.pwd = pwd;
	}

    public void addProducts()
    {
       System.out.println("Admin adding the products");
    }

    public void UpdateProducts()
    {
       System.out.println("Admin updates the products");
    }
}

//Entity
class Customer implements User
{
	String name;
	String email;
	int pwd;

	public Customer(String name,String email,int pwd)
	{
		this.name = name;
		this.email = email;
		this.pwd = pwd;
	}


    public void buyProduct()
    {
       System.out.println("Customer buys the product");
    }

    public void cancelOrder()
    {
       System.out.println("Customer cancelled Order");
    }
}

//service
class AccountService
{
	public static void login(User ref)//User ref = c1;
	{
	  
	   if(ref instanceof Customer)
	   {
	     System.out.println("Customer login() executed");  
	     Customer cus = (Customer) ref;
         cus.buyProduct();
         cus.cancelOrder();
       }
       else
       {
         System.out.println("Admin login() executed");  
       	 Admin adm = (Admin)ref;
       	 adm.addProducts();
       	 adm.UpdateProducts();
       }
	}
}


class logging
{
	public static void main(String[] args)
	{
		Customer c1 = new Customer("Customer1","Customer1@gmail.com",1234);
        AccountService.login(c1);

        Admin a1 = new Admin("Admin1",1009,4321);
        AccountService.login(a1);
	}
}