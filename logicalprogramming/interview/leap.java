class leap
{
	public static void leapyear(int year) 
    { 
      if((year%100==0 && year%400==0) || (year%100 != 0 && year%4 == 0)) 
       { 
        System.out.println(year+"-->is a leap year"); 
       } 
       else 
       { 
        System.out.println(year+"-->not a leap year"); 
       } 
    }
	public static void main(String[] args) 
	{
		leapyear(308);
		leapyear(500);
		leapyear(2014);
	}
}
/*
tracing--->
            expected || actaul               expected || actaul     expected || actaul
  if(308%400==  0    -- 0.77 -- false || 308%4==0 -- 0--true && 308%100! == 3.08. --true)
   ---true

  if(500%400==0-- 1.25--false || 500%4==0--true && 500%100==0--false)
  --- false


 */