class SmallInArray
{
	
	public static void test(int[] nums)
	{
	
		int small=nums[0];
		for (int i=1;i<nums.length;i++)
		{
			
			if(nums[i]<small)
			{
				small=nums[i];
			}
			//System.out.println(nums[i]);
			
		}
		System.out.println("small : "+small);
		
	}
	public static void main(String[] args) {
		int arr[] = {5,1,2,7,4,10};
		test(arr);
	}
}