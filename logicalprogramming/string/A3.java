class A3
{

	public static boolean  a3(int[] nums)
	{
		int sum=0,count=0;
		for(int i=0;i<nums.length;i++)
		{
			//System.out.println(nums[i]);
			if(nums[i]%2==0)
			  
			  count++;
			

		}
		if(count>3)
		{
            return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		int arr [] ={10,20,30,40,50,60};

		boolean res = a3(arr);
		System.out.println(res);
		int [] arr1 = {1,2,3};
		boolean res1 = a3(arr1);
		System.out.println(res1);
	}
}
	