class Mainclass
{
	public static void main(String[] args) {
		int v1=10;//32 bit
		double d1 = v1;//widening 
		//widening means converting lower datatype value to higher datatype value

		System.out.println("v1 :"+v1);
		System.out.println("d1 :"+d1);

		double d2=2.45;//64 bit
		int v2 = (int)d2;//narrowing
		//widening means converting higher datatype value to lower datatype value

		System.out.println("d2 :"+d2);
		System.out.println("v2 :"+v2);
        

        System.out.println("int to char and char to int conversion");
		char c1='a';
		int i1 =c1;//widening
		System.out.println("i1 :"+i1);

        int i2 = 65;
		char c2=(char)i2;//narrowing
		System.out.println("c2 :"+c2);
		
        /*
        if you try to store a char value within an number-variable(other than short/byte)then.
        the UNICODE value of the char will be stored in the given number-variable

        */

        
		
		

	}

}