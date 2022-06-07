class string2
{
	public static void main(String[] args)
{ 
String str="aAlls";//using string literals 
System.out.println(str); 
String str1=new String("AAlLeoe");//using new keyword 
System.out.println(str1); 
System.out.println("lenght() of String str : "+str.length());//lenght of str 
System.out.println("lenght() of String str1 : "+str1.length());//length of str1 
System.out.println("----------------------"); 
System.out.println(str.charAt(2));//return char at given index 
System.out.println(str.charAt(0)==str.charAt(1));//comparing two characters 
System.out.println(str.indexOf('e'));//returs index of given char 
System.out.println(str.indexOf('e',5));//returs index of given char starting from given index 
System.out.println(str.equals(str1));//compare two strings 
System.out.println("-----------------------"); 
System.out.println(str.equalsIgnoreCase(str1)); 
System.out.println("-----------------------"); 
System.out.println(str.substring(0,str.length()));//(0,7) 
System.out.println(str.substring(str.length()-2));//(5,7) 
System.out.println(str.substring(str.length()-2,str.length()-1)); 
}
}