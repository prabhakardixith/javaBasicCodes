class Method3
{
	public static double areatri(double b,double h)
	{
		System.out.println("triangle parameters "+"base = "+b+ " height ="+h);

		return (b*h)/2 ;
      
	}
	public static double areacir(double pi,double r)
	{
		System.out.println("circle parameters "+" pi = "+pi+" radius ="+r);

		return pi*(r*r) ;
		
	}
	public static double arearomb(double d1,double d2)
	{
		System.out.println("rombhus parameters "+" diagonal1 = "+d1+" diagonal2 ="+d2);
		return (d1/d2)/2;
	}
	public static double volumecyl(double pi,double r,double h)
	{
		System.out.println("cylinder parameters "+" pi = "+pi+" radius ="+r+" height ="+h);
		return pi*(r*r)*h;
	}
	public static double surcube(double a)
	{
		System.out.println("cube parameters "+"area ="+a);// area=length=base=height
		return 6*a*a;
	}
	public static void main(String[] args) 
	{
		double at,ac,ar,vc,sc;

		at = areatri(5,8);
		System.out.println("area of tringle = "+at);

		ac = areacir(3.142,3);
		System.out.println("area of circle = "+ac);

		ar = arearomb(3,5);
		System.out.println("area of rombhus = "+ar);

		vc = volumecyl(3.142,2,6);
		System.out.println("volume of cylinder = "+vc);

		sc = surcube(5);
		System.out.println("surface of cube = "+sc);

		
	}
}