class mainclass2
{
	public static boolean makeBricks(int small, int big, int goal) {
  int s=small*1;
  int b=big*5;
  return(b+s >= goal);
}
public static void main(String[] args) {
	System.out.println(makeBricks(3,2,9));
}
}