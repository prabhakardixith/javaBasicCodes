class CommandEnd
{
	public static boolean commonEnd(int[] a, int[] b)
   {
     return(a[0]==b[0] || a[a.length-1]==b[b.length-1]);
   }
	public static void main(String[] args) 
	{
		int [] a={1,3,5};
		int [] b={1,2,4};
		System.out.println(commonEnd(a,b));
		
	}
}