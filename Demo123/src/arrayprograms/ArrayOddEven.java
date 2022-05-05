package arrayprograms;

public class ArrayOddEven {
	public static void main(String args[]) {
		int a[]= {2,11,22,33,44,55,66,77,88,99,100,121,144};
		int n=a.length;
		System.out.println("the element of array is ");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println(" ");
		System.out.println("print element even place index");
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				System.out.print(" "+a[i]);
			}	
		}
		System.out.println(" ");
		System.out.println("print element odd place index");
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.print(" "+a[i]);
			}	
		}
	}

}
