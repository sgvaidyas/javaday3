package day3;

import java.util.Scanner;

public class pg2Arrays {

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
	static int addarray(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];		
		return sum;
	}
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the num of elements =");
		n = ob.nextInt();
		
		int a[] = new int[n];
		inputarray(a);
		int res = addarray(a);		
		displayarray(a);
		System.out.println("\n the sum of all array elems = "+ res);
		//System.out.println("sum = " + addarray(a));
	}

}
