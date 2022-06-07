
//evenodd without % operator

class evenodd
{
	
	static void even(int n)   
	{
		//if(n%2==0) using %

		int ref=n/2; //31/2=30

		if(ref*2 == n)//15*2=30 == 31 = odd
		{
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}

		
	}
	public static void main(String[] args) {
		
		even(31);
		even(10);





		
	}
}