class Account
{
  long accno = 2345;
  String owner = "prabhakar";
  double bal = 000;
  String branch = "hubli";
  static String bank = "union";


  public void deposit(double amt)
  {
  	System.out.println("balance before deposit "+bal);

  	bal+=amt;

  	System.out.println("balance after deposit "+bal);

  	
  }

  public void withdraw(double amt)
  {

  	System.out.println("balance before withdraw "+bal);

  	bal-=amt;

  	System.out.println("balance after withdraw "+bal);

  	
  	
  }

  public void checkbal()
  {
  	System.out.println("balance present in account "+bal);
  }

  public void viewAccntDetails(double bal)
  {

  	System.out.println("account details ");

  	System.out.println("account number "+accno);

  	System.out.println("owner name "+owner);

  	System.out.println("balance amount "+bal);

  	System.out.println("account branch "+branch);

  	System.out.println("account of bank "+Account.bank);
  }

}
class Mainclass3
{
	public static void main(String[] args)
	{
		Account ref;
		ref = new Account();//reference variable is used to store address of variable

		//Account ref2 = new Account();
		Account ref3 = ref; // refering ref address to ref3 variable

		System.out.println(" ref = "+ref);

		//System.out.println(" ref2 = "+ref2);

		System.out.println(" ref3 = "+ref3);

		ref.checkbal();
		ref.deposit(1000);
		ref.checkbal();

		//ref2.checkbal();
		ref3.withdraw(200);
		ref.checkbal();



	}
}
