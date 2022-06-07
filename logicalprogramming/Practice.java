class Practice
{

	static final void hey() throws Exception
	{
		int num=10;
		System.out.println(num/0);
	}
	public static void main(String[] args)  
	{
		int num=513;
		int num1=10;
		int res=0;
		int rem=0;

		while(num>0)
		{
			rem = num%10;
			System.out.println(rem);
			res =(res*10)+rem;
			//System.out.println(res);
			num=num/10;
		}
		System.out.println(res);
         

        System.out.println("phibonaci series");
        int n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2);
		for (int i=2;i<num1 ;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;

			
		}
		System.out.println();
        int fact =1;
		for (int i=1;i<=5;i++)
		 {
		 	fact*=i;
			
		}
		System.out.println("fact : "+fact);
        
        String str1 = "prabhakar";
        System.out.println("String Reverse");
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.println();

      System.out.println("remove duplicate from string");
		String str ="aabbcc";
		  String s="";
		char c =' ';
        int count=0;
		for(int i=0;i<str.length();i++)
		{
			c = str.charAt(i);
			//System.out.println(c);
			for(int j=0;j<s.length();j++)
			{
				if(c == s.charAt(j))
				{
					count++;
				}
			}
			if(count == 0)
			{
				s = s+c;
				//System.out.println(s);
			}
			count=0;
		}
		System.out.println(s);


		System.out.println("count Character ");
		int count1=0;
		for(int i=0;i<"klpb  dn ef w  skhuk".length();i++)
		{
			if("klpb  dn ef w  skhuk".charAt(i) != ' ')
			{
				count1++;
			}

		}
		System.out.println(count1);
		try{
				hey();	
				
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}

		//System.out.println(num/0);

		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('l'));
		System.out.println(s2.substring(0,3));

		int a=4;
		int b=20;
		for (int i=0;i<b ;i++ )
		{
			a++;
			
		}
		System.out.println(a);

        int number=4;
		switch(number%2)
		{
			case 0 : System.out.println("even");
			        break;
			case 1 :System.out.println("odd");
			        break;
			       default:System.out.println("not valid");
		}

		


	
		
	}
}