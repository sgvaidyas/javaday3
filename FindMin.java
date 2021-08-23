package day3;

import java.util.Scanner;

public class FindMin {

	static int minimumarray(int a[])
	{
		int min=a[0],i,minindex=0;
		for(i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
				minindex = i;
			}
		}
		return minindex;
	}
	static int maximumarray(int a[])
	{
		int max=a[0],i,maxindex=0;
		for(i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max = a[i];
				maxindex = i;
			}
		}
		return maxindex;
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n;
		System.out.println("Enter the no of ele = ");
		n = ob.nextInt();
		
		int a[] = new int[n];
		inputarray(a);	
		displayarray(a);
		int ind = minimumarray(a);
		System.out.println("minimum ele = "+ a[ind] );

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
0	1	2	3	4
11	2	33	3	1
1000	1004	1008	1012	1016
				
				
				
min=		2		
				
i	a[i]	min>a[i]		minindex
1	2	11>2	min=2	1
2	33	2>33		
3	3	2>3		
4	1	2>1	min=1	4
				
				
				
				
				

				

*/