class phibo
{
	public static void phibos(int n)
	{
		int n1=0,n2=1,n3=0;
		for(int i=2;i<=n;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;		
		}
		
	}
	public static void main(String[] args) 
	{
		phibos(10);
	}
}
/*
public static void test(int n) 
{ 
int n1=0,n2=1; 
int n3; 
int i=0; 
System.out.print(n1+" "+n2); 
while(i>=n1) 
{ 

n3=n1+n2; 
System.out.print(" " +n3); 
n1=n2; 
n2=n3; 
i++; 
} 
} 
/*public static void test(int n) 
{ 
int n1=0,n2=1,n3=0; 
System.out.print(n1+" "+n2); 

for(int i=2;i<=n;i++)//n1=0,n2=1,n3=1 
{ 
n3=n1+n2; 
System.out.print(" "+n3); 
n1=n2; 
n2=n3; 
}*/ 