package arrayprograms;

import java.util.Scanner;

public class ArrayProgram1 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter the no how many element you want");
		int n=in.nextInt();
		int a[]= new int[n];
		int p=a.length;
		for(int i=0;i<p;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("the element of array is");
		for(int i=0;i<p;i++)
		{
			System.out.println("the element of array is position "+i + " :" +a[i]);
		}
		for(int ele:a) {
			System.out.println("the element of array is :" + ele);
		}
		int max=a[0];
		for(int i=0;i<p;i++)//{11,22,33,44}
		{
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("the max number is :"+max);
		

	}

}
