/* wajp to take integer value from the user and print it is 
special two digit number or not.. 
special number:- 
sum of the digits plus product or multiplication of its digits 
is equals to actual number 
ex:-12-->(1+2)+(1*2)==12 false 
29-->(2+9)+(2*9)==29 true
*/
class special2
{
	public static void special(int n)
	{
		
        int a1=n%10;
        int b1=n/10;
        int res=a1+b1+a1*b1 ;
        if(res == n)
        {
        	System.out.println(n+" : special digit number");
        }
        else{
        	System.out.println(n+" : not a special digit number");
        }


	}
	public static void main(String[] args) {
		special(59);
		special(29);
		special(12);
	}
}