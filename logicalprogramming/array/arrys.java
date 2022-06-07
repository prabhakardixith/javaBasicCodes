/*
java is in object oriented language 

is java 100% object oriented? 


primitive 
8 

objects 
1)states-->color,length,dia 
2)behaviour-->write(functions) 



int a=10;-->10-->states 
int b=20; 

int sum=a+b; 

Arrays 


1)without arrays(1 2 4 5) 

int id1=101; 
int a=10 ram 10 20 30 
int id2 address 200 201 202 
int id3=106; 


int idn=n; 

s.o.p(id3); 
s.o.p(id5); 

*data is not stored in series or linear continous order. 
*we have to declare n number of variables to store value 
*size of the application will be more.
*Random acces is not allowed. 


2)with arrays 

-->Array is a homogenious group of date 
(or) it is a group of similar data type.
-->array is of fixed length. 

how to creatre an array 10 20 30 40 50 

declare array:- 

int a;//declration of normal variable 
int[] a;//declaration of array variable 
int a[]; 
int []a; 


create array 

datatype[] var_name=new datatype[size]; 

int[] a=new int[5]; ram a{m1 m2 m3 m4 m5} 

index always int type of value 

a=10 b=20 jvm 10 a=20 
add 200 201 202 203 204 

202+0= 202 


initialize array 
syntax 
arr_name[index]=values; 
public static void main(String[] args)
{ 
int[] a=new int[5];//0 1 2 3 4 
a[0]=10; 
a[1]=20; 
a[2]=30; 
a[3]=40; 
a[4]=50; 
System.out.println(a[4]);//access by passing arr_name[index]; 


} 

public static void main(String[] args)
{ 
int[] a=new int[6];//0 1 2 3 4 5 
a[0]=10; 
a[1]=20; 
a[2]=30; 
a[3]=40; 
a[4]=50; 
a[5]=60; 
System.out.println(a[0]);//lower bond element 
System.out.println(a[a.length-1]);//upper bond element 
System.out.println(a[(a.length-1)/2]);//middle element 

*/


class arrays{
	public static void main(String[] args) {
		int a[] = new int[2];
		a[0]=10;
		a[1]=20;

		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}