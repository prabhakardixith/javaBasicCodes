class Account
{
	customer cus=null;
}

class customer
{
  Account acc=null;
}

//service
class accountservice
{
   static int cid=1;
   Account a1;
   customer c1;

    public void createcustomer(String ename,String email,long mob)
	{
	a1=new Account();
	c1=new customer();

    a1.cus=c1;
    c1.acc=a1;
    // cid++;
	}
    public void showfullacntdetails()
	{
	 System.out.println("a1="+a1);
	  System.out.println("c1="+c1);


     System.out.println("customer address in account="+a1.cus);
   System.out.println("account address in customer="+c1.acc);

	}
}
class Mainclass
{
	public static void main(String[] args)
	{
		accountservice as=new accountservice();

		
		as.createcustomer("arjun","arjuna@gmail.com",92872414);
		as.showfullacntdetails();

	   as.createcustomer("ravi","ravi@gmail.com",87463524);
		as.showfullacntdetails();
	}
}