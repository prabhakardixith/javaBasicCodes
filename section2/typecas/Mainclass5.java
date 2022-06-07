interface Run{
	 int sum(double d1,double d2);
}
class Sample implements Run
{
	@Override
	public int sum(double d1,double d2)
	{
		return (int)(d1+d2);
	}

}
class Mainclass5
{
	public static void main(String[] args) {
		Sample s=new Sample();
		int res = s.sum(12.2,32.4);
		System.out.println(res);
	}
}