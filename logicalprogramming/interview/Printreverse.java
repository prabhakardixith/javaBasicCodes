class Printreverse
{

	public static void evenposition(int[] nums)
	{
		int arr [] = nums;
		System.out.print("new array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("reversed array : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int arr [] ={10,20,30,40,50,60};
		evenposition(arr);
		
	}
}
	