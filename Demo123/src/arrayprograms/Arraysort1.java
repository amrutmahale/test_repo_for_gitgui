package arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysort1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element ");
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("display the array eleemnts");
		for(int r:a) {
			System.out.println(r);
		}  //{1,2,3,4,5} {5,4,3,2,1}{a,b,c,d,e}
		System.out.println("the reverse element in array");
		for(int i=n-1;i>=0;i--){//n=5
			System.out.println(a[i]);
		}
		System.out.println("reverse element");
		Arrays.sort(a);
		System.out.println("the sorted array is"+Arrays.toString(a));
	
		
		
	}

}
