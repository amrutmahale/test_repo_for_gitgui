package arrayprograms;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];//declare array with size user input n
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("the array element is");
		for(int i=0;i<n;i++) {
			System.out.print(" " +a[i]);
		}
		System.out.println();
		int max=a[0]; //{1,2,44,33,55}
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("the largest element is : " +max);
		int min=a[0]; //{1,2,44,33,55}
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("the smallest element is : " +min);
		
		
		

	}

}
