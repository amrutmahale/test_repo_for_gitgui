package arrayprograms;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {11,66,33,44,36,24,52,22};
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min=j;
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		System.out.println("the sortedd array is:");
		for(int i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("the second largest element is:"+a[n-2]);
		

	}

}
