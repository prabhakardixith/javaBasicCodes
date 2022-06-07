class Demo
{
    static double x1 = 2.45;//dm //global var
    long m1 = 987654321234l;

	  public static void test()//fm --> method decleration
    {
      System.out.println("this is test()");
      int x1 = 10;//local var
      System.out.println("x1 : "+x1);
      System.out.println("x1 : "+Demo.x1);

      int m1 = 543;

      System.out.println("m1 : "+m1);
      System.out.println("m1 : "+new Demo().m1);
    }

    public void view()//fm --> method decleration
    {
      System.out.println("this is view()");
      String x1 = "hello";//local var
      System.out.println("x1 : "+x1);
      System.out.println("x1 : "+Demo.x1);

      String m1 = "world";//local var
      System.out.println("m1 : "+m1);
      System.out.println("m1 : "+this.m1);
      
    }

    public static void main(String[] args)//fm
	{
	   System.out.println("Program starts...");
       test();
       new Demo().view();

	   System.out.println("Program ends...");	
	}
}