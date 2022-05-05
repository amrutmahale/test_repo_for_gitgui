package arrayprograms;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		int p[]= {1,2,3,4,5,6};
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int a[]=new int[n];//n=5
		System.out.println("enter the element in array");
		//a[0]=10;
		int k=a.length;
		for(int i=0;i<a.length;i++) { // length used in array,length() used string
			a[i]=in.nextInt();
		}
		System.out.println("the element in array");
		for(int i=0;i<k;i++) {
			System.out.println(a[i]);
		}
		System.out.println("for each element");
		for(int s:a) {
			System.out.println(s);
		}
		System.out.println("enter the string size");
		int l=in.nextInt();
       String z[]=new String[l];
       System.out.println("enter the names");
       for(int i=0;i<l;i++) { // length used in array,length() used string
			z[i]=in.next(); // next() used for string input
		}
       System.out.println("display names");
       for(int i=0;i<l;i++) { // length used in array,length() used string
			System.out.println(z[i]);
		}
		
		                		
	}

}
