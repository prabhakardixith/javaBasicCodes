class sharedigit
{
      public static boolean shareDigit(int a, int b)
	 {
      int a1=a%10,b1=b%10;
      int a2=a/10,b2=b/10;
      if(a1==b1 || a2==b2)
      {
      	System.out.println("if "+a1+" a%10 "+b1);
      	System.out.println("if "+a2+" a/10 "+b2);
       return true;
      }
      System.out.println("else "+a1+" a%10 "+b1);
      	System.out.println("else "+a2+" a/10 "+b2);
      return false;
      }
      
   public static void main(String[] args) {
   	System.out.println(shareDigit(12,23));
   }
}
 