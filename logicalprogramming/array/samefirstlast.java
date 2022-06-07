class samefirstlast
{
	static public boolean sameFirstLast(int[] nums) {
  if(nums.length>0 && nums[0]==nums[nums.length-1])
  {
    return true;
  }
  else{
    return false;
  }
  }

  
public static void main(String[] args) 
{
	int n[]={1,2,1};//declaration and creation of an array
	int n1[]={1,2,3};
	/*
	int [] a ;//only declaration
	a = new int[3];// only creation
	int []a = {1,2,3};//creation and declaration
	*/
	System.out.println(sameFirstLast(n));
	System.out.println(sameFirstLast(n1));
}
}