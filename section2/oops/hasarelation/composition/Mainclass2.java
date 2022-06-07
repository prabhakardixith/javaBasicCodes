class Bank
{
	final String Bname="ICICI";
	Branch bn = null;


}
class Branch
{
	String BranchName;
	String BranchLocation;
	int id=0;
	Bank bk = null;

	public Branch(String BranchName,String BranchLocation,int id)
	{
		this.BranchName = BranchName;
		this.BranchLocation = BranchLocation;
		this.id=id;
	}
	public void ShowBranchDetail()
	{
		System.out.println("Brach Id : "+id);
		System.out.println("BranchName : "+BranchName);
		System.out.println("BranchLocation :"+BranchLocation);
		

	}

}
class BankService
{
	Branch br1 = null;
	Bank bk1 = null;
	static int id=1;
	public void createNewBranch(String Bname,String BranchLocation)
	{
		bk1 = new Bank();
		br1 = new Branch(Bname,BranchLocation,id);
		
		bk1.bn = br1;
		br1.bk=bk1;
		id++;
	}
	public BankService DeleteBranch()
	{
		br1.bk=null;
		bk1.bn=null;

		return null;
		
	}


	public void ShowBankDetails()
	{
		
		System.out.println("BankName : "+br1.bk.Bname);
		bk1.bn.ShowBranchDetail();
	}
}
class Mainclass2 
{
	
	public static void main(String[] args) 
	{

		BankService bs = new BankService();
		bs.createNewBranch("Bhopal-ICICI","Bhopal");
		bs.ShowBankDetails();

		BankService bs1 = new BankService();
		bs1.createNewBranch("Banglore-ICICI","Banglore");
		bs1.ShowBankDetails();
        bs.ShowBankDetails();
        bs1 = bs1.DeleteBranch();
		if(bs1 != null)
		{
			bs1.ShowBankDetails();
		}
		else
		{
			System.out.println("no Branch exist");

		}
	    

	}
}