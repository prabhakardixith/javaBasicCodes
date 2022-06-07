class Binary
{//Decimal to binary and store in string
	public static void test(int n) 
     { 
       int count=0; 
       int r; 
       String x=""; 
       while(n>0) 
       { 
         r=n%2; 
         if(r==1) 
         { 
            count++; 
         } 
         x=x+" "+r; 
         n=n/2; 
       } 
     System.out.println(x); 
     System.out.println(count); 
     } 
  public static void main(String[] args)
  { 
   test(25); 
  }
	
}