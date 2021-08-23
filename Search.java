package day3;

import java.util.Scanner;

public class Search {
	
	static void linearsearch(int a[],int key)
	{
		int flag = 0;
		for(int i=0;i<a.length;i++)
		{
			if(key == a[i])
			{
				flag=1;
				System.out.println("Found the key at "+ i);
			}
		}
		if(flag==0)
			System.out.println("Not found"); 
	}
	
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		int n,key;
		System.out.println("Enter the no of ele = ");
		n = ob.nextInt();
		
		int a[] = new int[n];
		inputarray(a);		
		System.out.println("Enter the key = ");
		key = ob.nextInt();			
		linearsearch(a, key);
		

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
