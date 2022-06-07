class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		String str = "aaabbccc";
	    char c=' ';
		String s="";
        int count=0;
		for(int i=0;i<str.length();i++)
		{
			c = str.charAt(i);
			for(int j=0;j<s.length();j++)
			  { 
			     if(c == s.charAt(j))
				{
					count++;
					
				}

			  }
			if(count == 0)
			{
				s=s+c;
			}
			count=0;	
		}
		System.out.println("final string : "+s);

	

	}

}