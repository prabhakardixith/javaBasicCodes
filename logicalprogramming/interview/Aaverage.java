class Aaverage
{
	public static void average(int[] nums)
	{
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];

		}
		System.out.println(sum/nums.length);
		
	}
	public static void main(String[] args) {
      int arr[]={10,20,30,40};
		average(arr);
	}
}