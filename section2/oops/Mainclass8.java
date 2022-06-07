class Bank{
	String name;
	int code;
	Branch bc;//if branch is deleted then all branch details will be deleted
	//its strong relation its a composition

	public Bank()
	{

	}
	public void addbranch()
	{

	}
	public void removebranch()
	{

	}
	public void getbranch()
	{

	}
	public void getallbranch()
	{

	}
}

class Branch
{
	int branchcode;
	String city;
	Bank bk;
	Account ac;//if account is deleted then account association data will be deleted 
	//savings and current and customer is also deleted its composition
	Loan ln;
	public Branch()
	{

	}
	public void addaccount()
	{

	}
	public void removeaccount()
	{
		
	}
	public void getaccount()
	{
		
	}

	public void addloan()
	{
		
	}
	public void removeloan()
	{
		
	}
	public void getloan()
	{
		
	}
}

class Loan
{
	int loan_no;
	int amount;
	String type;
	Customer cu;//if loan is deleted customer and account will not be deleted its a aggregation

	public loan()
	{

	}
	public void addcustomer()
	{
		
	}
	public void prepayment()
	{
		
	}
	public void getemi()
	{
		
	}
}

class Account
{
	int accno;
	int balance;
	Savings sv;
	Current cr;


	public Account()
	{

	}
	public void debitamount()
	{
		
	}
	public void creditamount()
	{
		
	}
	public void getbalance()
	{
		
	}
}

class Savings
{
	int min_balance;
	String date_of_opening;
	Account acc;
	Customer cus;

	public Savings()
	{

	}
	public void addcustomer()
	{
		
	}
	public void removecustomer()
	{
		
	}
}

class Current
{
	float interest_rate;
	String date_of_opening;
	Account acc1;
	Customer cus1;

	public Current()
	{

	}
	public void addcustomer()
	{
		//cus1.cu2 = new Customer("prabhakar","hubli",98767656653l);
		
	}
	public void removecustomer()
	{
		
	}
}

class Customer
{
	int cust_id=1;
	String name;
	String address;
	long phone;
	Current cu2;//if accounts deleted it will also delete customer
	Savings sa1;


	public Customer(String name,String address,long phone)
	{
		this.cust_id=cust_id;
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.cust_id++;
	}

}

class Mainclass8
{
public static void main(String[] args) {
	

	
}
}

