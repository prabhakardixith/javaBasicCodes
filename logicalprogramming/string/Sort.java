class BubbleSort
{
	public static void test(int[] nums)   
	{
		for (int i=0;i<nums.length;i++)
		{
			for (int j=0;j<nums.length-1;j++) 
			{
				if(nums[j] > nums[j+1])
			    {
				int temp = nums[j];
				nums[j]=nums[j+1];
				nums[j+1]=temp;
			    }
		    }
		
		}
		for (int i=0;i<nums.length;i++)
		{
		System.out.println(nums[i]);
         
		}
	}
	public static void main(String[] args)
	{
		int [] arr = {2,6,1,3,8,4,0,5};
		test(arr);
		
	}
}