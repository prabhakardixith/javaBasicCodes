class Asum
{

	public static void asum(int[] nums)
	{
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];

		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) 
	{
		int arr [] ={10,20,20,30,30,40,50,60};

		asum(arr);
		int [] arr1 = {1,2,3};
		asum(arr1);
	}
}
	