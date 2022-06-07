class TEst
{
	public static void main(String[] args) 
	{
		int num[] ={1,2,2,3,6,3,4,4};
		int num1[] = new int[num.length];
        int n =0;
		for(int i=0;i<num.length;i++)
		{
			int count=0;
			System.out.print("num[i] : "+num[i]+" ");
			for(int j=0;j<num1.length;j++)
			{
				if(num[i] == num1[j])
				{
					count++;
				}
			}
			System.out.println("count : "+count);
			if(count == 0)
			{
				num1[n]=num[i];
				n++;
			}
		}
		for (int i=0;i<num1.length;i++ )
		{
			System.out.println(num1[i]);
			
		}
		
	}
}