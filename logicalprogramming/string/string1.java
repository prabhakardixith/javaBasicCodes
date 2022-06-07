class string1
{
	public static void main(String[] args) 
	{
	String str="hello ";//space is also counted
	//System.out.println(str.lastIndexOf('o'));// done in presentation class

	System.out.println(str);
	String str1 = new String("world hey worlds");		
	System.out.println(str1);
	System.out.println(str1.length());//length function is used to find the length of string
	System.out.println(str.length());
	System.out.println(str.charAt(0));//charAT() we can get particular char based on index
	System.out.println(str1.indexOf('d'));//indexOf() we can get index of an specified character
	System.out.println(str1.indexOf('r',5));//it starts from specified index and send give char index
	String s = "said";
	String s1 = "say";
	System.out.println(s.equals(s1));//its compare two string and gives boolean result
	String s2 = "Hey";
	String s3 = "hey";
	System.out.println(s2.equalsIgnoreCase(s3));//compare two string dont consider cases
	String s4="said hello";
	System.out.println(s4.substring(0,3));//gives char within given range 
	System.out.println(s4.substring(0));//gives complete string start point and end point
	


	}
}