class Whole
{
	public static int whole(double num)
	{
		int res = (int)num;
		
		return res;

	}
	public static void main(String[] args) 
	{
		int res = whole(12.1);
		System.out.println("whole number : "+res);
	}
}