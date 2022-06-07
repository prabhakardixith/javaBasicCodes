//----------------------------------Object Implimentation Layer-------------------------------------------------------------

interface Bank
{
	public void payment(double amt,String upi);
	public void checkBal(String upi);
}

class SBI implements Bank
{
    @Override
    public void payment(double amt,String upi)
    {
      System.out.println("SBI BANK payement : enter 6-digit UPI PIN to pay "+amt);
    }
    
    @Override
	public void checkBal(String upi)
	{
      System.out.println("SBI BANK payement : enter 6-digit UPI PIN to Check Bal "); 
	}
}

class ICICI implements Bank
{
    @Override
    public void payment(double amt,String upi)
    {
      System.out.println("ICICI BANK payement : enter 6-digit UPI PIN to pay "+amt);
    }
    
    @Override
	public void checkBal(String upi)
	{
      System.out.println("ICICI BANK payement : enter 6-digit UPI PIN to Check Bal "); 
	}
}

class Kotak implements Bank
{
    @Override
    public void payment(double amt,String upi)
    {
      System.out.println("Kotak BANK payement :enter 8-digit UPI PIN to pay "+amt);
    }
    
    @Override
	public void checkBal(String upi)
	{
      System.out.println("Kotak BANK payement : enter 8-digit UPI PIN to Check Bal "); 
	}
}

//----------------------------------Object Implimentation Layer-------------------------------------------------------------


//----------------------------------Object Creation Layer-------------------------------------------------------------

class GooglePay
{
  //public Bank pay(String bankName)/* i tried   */
   public  static Bank pay(String bankName)
   {
     if(bankName.equalsIgnoreCase("SBI"))
     {
         Bank ref = new SBI();//upcasting
         return ref;
     }
     else if(bankName.equalsIgnoreCase("ICICI"))
     {
        Bank ref = new ICICI();//upcasting
        return ref;
     }
     else
     {
        Bank ref = new Kotak();//upcasting
        return ref;
     }
   }
}
//----------------------------------Object Creation Layer-------------------------------------------------------------




//----------------------------------Object Utilization Layer-------------------------------------------------------------
class mainclass//user
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts..");
    Bank ref = GooglePay.pay("sbi");
    ref.payment(2000,"1234");

    /* i tried
    //String s="sbi";
		//Bank ref = GooglePay.pay(s);
    
    //GooglePay g = new GooglePay();
    //Bank ref;
    //ref = g.pay("sbi");
    */
   System.out.println("Program ends...");
	}
}
//----------------------------------Object Utilization Layer-------------------------------------------------------------