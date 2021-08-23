package day3;

import java.util.Scanner;

public class Concatarray {

	public static void main(String[] args) {
		
		int a[] = new int[] {11,22,44,55};
		int b[] = new int[] {1,2,3};
		
		int c[]= new int[a.length+b.length];		
		int n1,n2,n;
		n1= a.length;
		n2=b.length;
		n = n1+n2;
		for(int i=0;i<n;i++)
		{
			/*
			if(i<n1)			 
				c[i]=a[i];
			else
				c[i]=b[i-n1];
			*/
			c[i] = (i<n1)? a[i] : b[i-n1];
		}
		displayarray(c);
	}
	static void inputarray(int a[])
	{
		Scanner ob = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the ele = ");
			a[i]=ob.nextInt();
		}
	}
	static void displayarray(int a[])
	{
		System.out.println("the array elements =");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

/*
 * 
 * 
  	0	1	2	3				
A	11	2	33	3				
								
								
	0	1	2					
B	44	55	7					
								
					c[4]	c[5]	c[6]	
	0	1	2	3	4	5	6	
C	11	2	33	3	44	55	7	
	a[0]	a[1]	a[2]	a[3]	b[0]	b[1]	b[2]	
								
					b[4-4]	b[5-4]	b[6-4]	

*/
