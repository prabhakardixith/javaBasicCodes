class Aeven
{

	public static void aeven(int[] nums)
	{
		int sum=0,count=0;
		for(int i=0;i<nums.length;i++)
		{
			//System.out.println(nums[i]);
			if(nums[i]%2==0)
			  sum+=nums[i];
			  count++;
			

		}
		System.out.println("average of "+sum/count);
		
	}
	
	public static void main(String[] args) 
	{
		int arr [] ={10,20,30,40,50,60};

		aeven(arr);
		int [] arr1 = {1,2,3};
		aeven(arr1);
	}
}
	