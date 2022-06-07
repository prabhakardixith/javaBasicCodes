//intput 153 output-1*1*1 + 5*5*5 + 3*3*3 =153 (153==153)

class Armstrong
{ 
	public static int tester(int rem,int num)
	{
		int res=1;
		  while(num>0)
		  {
			//t++;
			num=num/10;
			res*=rem;
		  }

		return res;
	}
	public static void armer(int num) 
   {
      int rem=0,res=0,temp=num;	
      while(num>0)
      {
      	rem=num%10;
      	res += tester(rem,temp);
      	num=num/10;
      }
      System.out.println(res);

      if(res==temp)
      {
      	System.out.println(temp+": Armstrong Number");
      }
      else{
      	System.out.println(temp+": not Armstrong number");
      }
   }
	public static void main(String[] args) {
		test(153);
		test(1634);
		test(99);
		
	}
}
/*

class Armstrong
{ 
	
	public static void test(int num) 
   {
      int rem=0,res=0,temp=num;	
      while(num>0)
      {
      	rem=num%10;
      	res=(rem*rem*rem)+res;
      	res+=res;
      	num=num/10;
      }
      System.out.println(res);
      if(res==temp)
      {
      	System.out.println(temp+": Armstrong Number");
      }
      else{
      	System.out.println(temp+": not Armstrong number");
      }
   }
	public static void main(String[] args) {
		test(153);
		test(1634);
		
	}
}
*/