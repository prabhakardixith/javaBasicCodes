class Areverse
{
	public static void test(int[] nums)
	{
		for(int i=nums.length-1;i>=0;i--)
	    {
	    	System.out.println(nums[i]);

	    }
		
	}
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
		test(arr);

		
	}
}