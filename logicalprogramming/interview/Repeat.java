class Repeat
{
	public static void test(int num)  
	{
		
   	    int rem=0,rem1=0;
   	
   		rem=num%10;//121%10--1
   		num=num/10;//121/10--12
   		rem1=num%10;//12%10--2
   		num=num/10;//12/10--1

   		if(rem==num || rem==rem1 || num==rem1)
   			System.out.println("false");
   		else
   		    System.out.println("true");



	}
	
	public static void main(String[] args)
   {
   	test(121);
   	test(123);
   	test(333);
   	hey();
   	}
}
/*
int rem=0,rem1=0;
   	
   		rem=num%10;
   		//System.out.println(rem);
   		num=num/10;
   		rem1=num%10;
   		//System.out.println(rem1);
   		num=num/10;
   		//System.out.println(num);

   		if(rem==num || rem==rem1 || num==rem1)
   			System.out.println("false");
   		else
   		    System.out.println("true");

*/