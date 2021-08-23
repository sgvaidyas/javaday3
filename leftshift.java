package day3;

public class leftshift {

	static void reverse(int a[],int i,int j)
	{
		int temp;
		for(;i<j;i++,j--)
		{
			temp = a[i];
			a[i] = a[j];
			a[j]=temp;
		}
	}
	public static void main(String[] args) {
		int a[]=new int[] {11,22,33,44};
		int noofrot = 3;
		int temp;
		displayarray(a);
		reverse(a,0,noofrot-1);	
		reverse(a,noofrot,a.length-1);	
		reverse(a,0,a.length-1);			
		displayarray(a);
	}
	static void displayarray(int a[])
	{
		System.out.println("\nthe array elements =");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
}
