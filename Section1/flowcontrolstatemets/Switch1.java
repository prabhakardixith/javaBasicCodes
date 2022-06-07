class Switch1
{
	public static void quiz(char optn)
	{
		switch(optn)
		{
			case 'A' : System.out.println("option A is selected");
			           break;

			case 'B' : System.out.println("option B is selected");
                       break;

			case 'C' : System.out.println("option C is selected");
		               break;

		    case 'D' : System.out.println("option D is selected");
		               break;	

		    default :  System.out.println("option "+optn+" Invalid option");
		}
	}
	public static void main(String[] args) 
	{
		quiz('A');
		quiz('C');
		quiz('Z');
		
	}
}