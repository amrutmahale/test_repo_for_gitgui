package arrayprograms;

public class FrequencyArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int p[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			p[i]=a[i];
		}
		System.out.println("element from original  array ");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("copy from one array to another");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+p[i]);
		}
		
	}

}
