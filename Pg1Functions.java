package day3;

import java.util.Scanner;

public class Pg1Functions {

	static void add()
	{
		int a,b;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter val of a = ");
		a = ob.nextInt();
		System.out.println("Enter val of b = ");
		b = ob.nextInt();
		int res= a+b;
		System.out.println("the res = "+ res);
	}
	static void sub(int x,int y)
	{
		int res=x-y;
		System.out.println("difference = "+ res);
	}
	static int mul(int a, int b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		//Pg1Functions var1 = new Pg1Functions();
		//var1.add();
		add();
		int a,b,c;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter val of a = ");
		a = ob.nextInt();
		System.out.println("Enter val of b = ");
		b = ob.nextInt();
		sub(a,b);
		c = mul(a,b);
		System.out.println(" multiplication = "+ c);
	}

}
