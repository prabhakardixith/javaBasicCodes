class firstlast6
{
	static public boolean firstLast(int[] nums) {
  int n = nums.length-1;

  if(nums[0]==6)
  {
    return true;
  }
   else if(nums[n]==6)
   {
     return true;
   }
  else{
    return false;
  }

}
public static void main(String[] args) 
{
	int n [] = {1,2,3,4,6};
	int n1 [] = {6,4,3,1,6};
	int n2 [] = {1,2,3,4};
	System.out.println(firstLast(n));
	System.out.println(firstLast(n1));
	System.out.println(firstLast(n2));

	
}
}