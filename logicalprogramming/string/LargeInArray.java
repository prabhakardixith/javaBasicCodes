class LargeInArray
{
	
	public static void test(int[] nums)
	{
		int big=0;

		for (int i=0;i<nums.length;i++)
		{
			if(nums[i] > big)
			{
				big=nums[i];
			}
			
			//System.out.println(nums[i]);
			
		}
		
		System.out.println("big : "+big);
	}
	public static void main(String[] args) {
		int arr[] = {1,5,2,7,4,10};
		test(arr);
	}
}