class AllNum
{

	public static void  a3(int[] nums,int num)
	{
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]/10 == num)
			{
				count++;
			}
			 if(nums[i]%10 == num)
			{
			  count++;
		    }
		}
		System.out.println("count is : "+count);
	}
	
	public static void main(String[] args) 
	{
		int [] arr1 = {1,20,21,12,31};
		
		a3(arr1,1);  
	}
}
	