class Practice
{
	public static int countNum(String str)
	{
		char s;
		int k=0;
		int charnum=0;
		int intnum=0;
		String s1="",s2="",s3="";
		char k1,k2;
		for(int i=0;i<str.length();i++)
		{
			s=str.charAt(i);
			if(s>=48 && s<=57)
			{
				intnum++;
				s1=s1+s;
				// s2=s2+" ";
			}
			else
			{
				charnum++;
				s2=s2+s;
				// s1=s1+" ";
			}
		}
		s1+=" ";
		s2+=" ";
		int ch,nu;
		ch=0;
		nu=0;
		

		if(intnum==charnum)
		{
			for(int i=0;i<str.length();i++)
			{
			s=str.charAt(i);
			k1=s1.charAt(nu);
			k2=s2.charAt(ch);

			if(s>=48 && s<=57)
			{
				s3=s3+k2;
				ch++;
			}
			else
			{
				s3=s3+k1;
				nu++;
				
			}
		}
			System.out.println(s3);
			System.out.println(str);
		}
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(intnum);
		//System.out.println(charnum);

		return k;

	}

	public static void main(String[] args) {
		String str="ab12c9";
		// char s=57;
		// System.out.println(s);
		int v=countNum(str);
		//System.out.println(v);

	}
}
