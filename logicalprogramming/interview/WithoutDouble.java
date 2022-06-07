/*

Return the sum of two 6-sided dice rolls, each in the range 1..6. However,
 if noDoubles is true, if the two dice show the same value, increment one 
 die to the next value, wrapping around to 1 if its value was 6.


withoutDoubles(2, 3, true) → 5
withoutDoubles(3, 3, true) → 7
withoutDoubles(3, 3, false) → 6
*/
class WithoutDouble
{
	public static int test(int a,int b,boolean noDoubles)   
	{
		if(noDoubles)
		{
			if(a==6 && b==6)
		    {
		    	return a+1;
		    }
			if(a==b)
			{
			return a+b+1;
		    }
		    

		}
		
		return a+b;
	
	}
	public static void main(String[] args) 
	{
	 	System.out.println(test(3,3,false));
	 	System.out.println(test(6,6,true));
	}
}