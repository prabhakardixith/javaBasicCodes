class ReverseString
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("abc");
		System.out.println(s.reverse());	

String s1 = "abc";
String rev = "";
System.out.println(s1);
for (int i = s1.length()-1;i >= 0;i--)
{
	System.out.println(s1.charAt(i));
	rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
	int num = 121112;
int c=0;
while(num!=0)
{
	c++;
	num = num/10;
}
System.out.println(c);
}

}