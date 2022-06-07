class Demo
{
	static void democlass()
	{
		System.out.println("hello");
	}

}
class Sample extends Demo
{
	public static void sampleclass()
	{
	democlass();
    }




}
class Mainclass
{
	
	public static void main(String[] args) {
		Sample.sampleclass();
		
		

		
	}
}