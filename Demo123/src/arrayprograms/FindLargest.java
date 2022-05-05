package arrayprograms;

import java.util.Arrays;

public class FindLargest {

	public static void main(String[] args) {
		int a[]= {17,43,22,45,57,26,87};
		Arrays.sort(a);                   // array element return
		System.out.println("the sorted arrays are :"+Arrays.toString(a));
        System.out.println("the largest element are :"+a[a.length-1]);
	}

}
