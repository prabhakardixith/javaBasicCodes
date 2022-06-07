
class ArmStrong2 
{
	public static void test(int num)
	{
	  int res=1,temp=num,temp1=num,rem=0,res1=0;
	  while(num>0)
      {
         rem=num%10;
         num=num/10;
         while(temp>0)
         {
       	    res*=rem;
       	    temp=temp/10;
         }
         res1+=res;//actual result res1
         res=1;
         temp=temp1;
      }
      if(temp1 == res1)
      {
          System.out.println(res1+" : is a armstrog number");
      }
      else
      {
          System.out.println(res1+" : not a armstrong  number");
      }
    }
	public static void main(String[] args) 
	{
		test(153);
		test(120);		

		
	}
}