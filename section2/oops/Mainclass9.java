//this program is incomplete
//Conatiner
//Entity
class Account
{
   Customer cus = null;
}

//Conatining
//Entity
class Customer
{
  Account acc = null;
}

//Service
class AccntService
{
	static int cid = 1;
	Account a1;
	Customer c1;


	public void createCustomer(String ename,String email,long mob)
	{
	   a1 = new Account();
	   c1 = new Customer();

	   a1.cus = c1;//link customer to accnt
	   c1.acc = a1;//link accnt to customer
      
	}

	public void showFullAcntDetails()
	{
	   System.out.println("a1 "+a1); 
	   System.out.println("c1 "+c1); 

	   System.out.println("customer addrs in accunt  : "+a1.cus);
	   System.out.println("account addrs in customer : "+c1.acc);
  }
}

class Mainclass9// has a relation with composition
{
	public static void main(String[] args) 
	{
	  AccntService ds = new AccntService();
	  
	  ds.createCustomer("Arjun","Arjun@gmail.com",998987831l);
	  ds.showFullAcntDetails();

	  ds.createCustomer("Ravi","ravi@gmail.com",9986287831l);
	  ds.showFullAcntDetails();	
	}
}