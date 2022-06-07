class Flow20//array
{
	public static void main(String[] args) 
	{
		int [] arr;//array declaration

		arr = new int [3];//array initialisation

		// also be done

		int [] a = new int [3];//it is declaration and initialisation both in one line
		int c []= new int [3];//this is also possible

		a[0]=2;// a[0] = index of an array
		a[1]=4;
		a[2]=6;//we cannot give more values than index 
		//a[3]=8;  // give array index out of bound exeption

		//System.out.println(a[0]);//this way we should write alot of print statemets 
        
        System.out.println("array lenght = "+a.length);//lenght is an variable helps to get the lenght of an array

        System.out.println("array < lenght");

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
		// i=0 - 0<3 - a[i]=a[0]=2
		//i=1 - 1<3 - a[i]=a[1]=4
		//i=2 - 2<3 - a[i]=a[2]=6
		//i=3 - 3<3 - false

		System.out.println("array <= lenght-1");

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);

		}
		// i=0 - 0<=2 - a[i]=a[0]=2
		//i=1 - 1<=2 - a[i]=a[1]=4
		//i=2 - 2<=2 - a[i]=a[2]=6
		//i=3 - 3<=2 - false


        System.out.println("array initialisation in one line");
		int [] b = {10,20,30,40};
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.println(b[i]);

		}






		
	}
}