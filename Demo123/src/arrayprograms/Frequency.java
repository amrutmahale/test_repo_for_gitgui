package arrayprograms;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("the array element is");
		for(int i=0;i<n;i++) {
			System.out.print(" " +a[i]);
		}
		System.out.println();
		 //{1,2,44,33,55}
		for(int i=0;i<n;i++)
		{
			int occur=0;
			for(int j=0;j<n;j++)
			{ 
				if(a[i]== a[j])
				{
					occur=occur+1;
					
				}
				
			}
			System.out.println("the element " +a[i] +" occur " +occur );
			
		}

	}

}
