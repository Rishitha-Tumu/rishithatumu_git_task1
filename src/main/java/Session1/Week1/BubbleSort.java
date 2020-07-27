package Session1.Week1;

import java.util.Scanner;

public class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements to insert into the array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.print("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		Sort s=new Sort();
		s.sort(array,n);
	}
}
