interface Run
{
	int a=10;
	 public abstract void running();
	 default void jump()
	 {
	 	System.out.println("jump() of Run interface");
	 }
	 static void swim()
	 {
	 	System.out.println("swin() of Run interface");
	 }
}

 class Sample implements Run
{
	@Override
	public void running(){

	}
	public void hey() {
		 System.out.println("hey");
		 jump();
		 System.out.println(a);
		 Run.swim();
		}
 }
class Mainclass implements Run
{
	@Override
	public void running(){

	}
	public static void main(String[] args)
	 {
		Sample s=new Sample();
		s.hey();
		Run.swim();
	}
}