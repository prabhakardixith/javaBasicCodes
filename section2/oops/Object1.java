//parent class or super class
class Sample
{
	public Sample(int a)//if superclass constructor not contains any args then 
	{                   //super statement dont pass any values

		super();//Sample class dont have any super class is written
		        // but implicitly written (extends Object)
		        // every class implicitly aquiring properties of object class
		        // which is in jdk
		System.out.println("constructor of sample class"+a);
	}
}

//child class
class Demo extends Sample
{
	public Demo()
	{
		super(10);//super statement is used to create object of an superclass(parent class)
		          // it implicitly written by compiler while subclass constructor is called  
		System.out.println("constructor of Demo class");
	}

}

class Object1
{
	public static void main(String[] args) {
		new Demo();// creates object of an Demo class and also creates object superclass
	}
}