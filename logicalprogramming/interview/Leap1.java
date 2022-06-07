class Leap1
{ 
    public static void test(int year) 
    { 
    if(year%4==0) 
     { 
      if(year%100==0) 
      { 
        if(year%400==0) 
        { 
          System.out.println(year+" IS A LEAP YEAR"); 
        } 
        else 
        { 
          System.out.println(year+" IS NOT A LEAP YEAR"); 
        } 
      } 
      else 
      {  
        System.out.println(year+" IS A LEAP YEAR"); 
      } 
    } 
    else 
    { 
      System.out.println(year+" IS NOT A LEAP YEAR"); 
    } 
   } 
  public static void main(String[] args)
  { 
   test(200); 
   test(2000); 
   test(600); 
   test(2020); 

  } 
}