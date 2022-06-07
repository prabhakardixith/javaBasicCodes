class special3
{
	public static void special(int n)
	{
		
        int a1=n%10;
        //System.out.println(a1);
        int t1=n/10;
        int b1=t1%10;
        //System.out.println(b1);
        int c1=t1/10;
        //System.out.println(c1);

        int res=(a1+b1+c1)+(a1*b1*c1) ;
        if(res == n)
        {
        	System.out.println(n+" : special digit number");
        }
        else{
        	System.out.println(n+" : not a special digit number");
        }


	}
	public static void main(String[] args) {
		special(145);
                special(1);
		
	}
}