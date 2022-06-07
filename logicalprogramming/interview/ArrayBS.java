class ArrayBS
{
	public static void find(int[] arr)
	{
		int small = arr[0];
		int big = 0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];
			}
			if(arr[i]<small)
			{
				small=arr[i];
			}
		}
		System.out.println(big);
		System.out.println(small);
	}
	public static void main(String[] args) 
	{
		int [] arr = {10,20,50,34,2,5,89,92};
		find(arr);
		
	}
}