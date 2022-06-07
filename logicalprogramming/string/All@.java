class Ncount
{

	public static void  a3(int[] nums,int num)
	{
		int sum=0,count=0;
		for(int i=0;i<nums.length;i++)
		{
			//System.out.println(nums[i]);
			if(nums[i]==num)
			  
			  count++;
			if(nums[i]/10 == 2)
				count++;
			if(nums[i]%10 == 2)
				count++
			

		}
		System.out.println("count is : "+count);
		
		
	}
	
	public static void main(String[] args) 
	{
		int arr [] ={10,20,30,40,50,60,10,10,30,10};

		
		a3(arr,10);
		int [] arr1 = {1,2,3,2,3,4,2};
		
		a3(arr1,2);
	}
}
	