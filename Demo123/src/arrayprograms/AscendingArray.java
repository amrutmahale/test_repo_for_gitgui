package arrayprograms;

public class AscendingArray {

	public static void main(String[] args) {
		int a[]= {10,20,90,40,30,80,60,5,70};
		int n=a.length;
		
		
		for(int i=0;i<n;i++)// take input element
		{
			for(int j=i+1;j<n;j++)// traverse element
			{
				if(a[i]>a[j])//10>5
                {
					int temp=a[i];//10
					a[i]=a[j]; 
					a[j]=temp;
				}
			}
		}
		System.out.println("the ascending order element is:");
		for(int i=0;i<n;i++)
		{ 
			System.out.print(" "+a[i]);//print sorted array
		}
		System.out.println();
		System.out.println("The smallest element is array: "+a[0]);
		System.out.println("The second smallest element is array: "+a[1]);
		System.out.println("The largest element is array: "+a[n-1]);
		System.out.println("The second largest element is array: "+a[n-2]);
		
	}

}
