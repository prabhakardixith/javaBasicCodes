class SwitchCase
{
	 static public void switcher(int num)  
	{
		switch(num%2)
		{
			case 0:System.out.println("even");
			break;
			default:System.out.println("odd");
		}

		
	}
	public static void main(String[] args) 
	{
		switcher(22);
		switcher(17);
		switcher(36);
	}
}