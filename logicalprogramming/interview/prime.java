//number which is divisible by only 1 and by it self
class Prime
{
	public static void primer(int num)
	{
		if(num==2 || num==3 || num==5)
		{
			System.out.println(num+" : is a prime number");
		}
		else if(num%2==0 || num%3==0 || num%5==0)
		{
			System.out.println(num+" : is not a prime Number");
		}
		 
		else
		{
			System.out.println(num+" : is a prime number");
		}
     
    
	}
	
	public static void main(String[] args) {
		
		primer(11);
		primer(25);
		primer(5);
		primer(80);
	}
}
