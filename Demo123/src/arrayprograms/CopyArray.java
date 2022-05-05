package arrayprograms;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int p[]=a; // using asignment operator copy array one to another
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		for(int i=0;i<p.length;i++) {
			System.out.print(" "+p[i]);
		}
		System.out.println();
		System.out.println("original Array is " +Arrays.toString(a));
		System.out.println("duplicate array is "+Arrays.toString(p));
		a[0]=12;// update array position in array
		a[2]=9;
		System.out.println("after modifying array is");
		System.out.println("original Array is " +Arrays.toString(a));
		System.out.println("duplicate array is "+Arrays.toString(p));
		
		int s[]=Arrays.copyOf(a, a.length);
		System.out.println("using ArrayCopy methods" + Arrays.toString(s));

	}

}
