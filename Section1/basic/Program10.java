class Program10
{
	public static void main(String[] args)
	{
		int v1 =10,v2=8,v3=5;
        // logical operatos works with multiple expression or comaparisons
		System.out.println(v1 > v2 && v1 > v3);// logical &&(and) operators check multiple expression and gives one results these operations only returns boolean value
		System.out.println(v1 > v2 && v1 < v3); // only returns if both condition is true
		System.out.println(v1 < v2 && v1 > v3); // if both conditions are false it still sends false
		System.out.println(v1 < v2 && v1 < v3);



		System.out.println(v1 < v2 || v1 < v3); // logical or 

		System.out.println(v1 < v2 ^ v1 < v3);  // logical xor

	}
}