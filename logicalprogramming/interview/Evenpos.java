class Evenpos
{
	public static void evenposition(int[] nums)
	{
		for(int i=0;i<nums.length;)
		{
			System.out.println(nums[i]);
			i+=2;
		}

	}
	
	public static void main(String[] args) 
	{
		int arr [] ={10,20,30,40,50,60};
		evenposition(arr);
		
	}
}