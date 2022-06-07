
//evenodd without % operator

class evenodd1
{
	static void even(int n)   
	{
	// without using if
		switch(n%2)
		{
			case 0 :System.out.println("even");
			         break;
			
			case 1:System.out.println("odd");
			       break;
		}
	}
	public static void main(String[] args) {
		
		even(33);
	    even(10);
		

		
	}
}