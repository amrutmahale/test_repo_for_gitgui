package arrayprograms;

public class ArrayPrint {
	
	public static void main(String[] args) {
		int sum=0;
	int a[]= {10,20,30,40,50};
	int n=a.length;
	System.out.println("the length of array is:"+n);
	for(int i=0;i<n;i++) {
				//print all the element
		System.out.println("array element is" +i + " :" +a[i]);
		sum=sum+a[i]; 
		
	}
	System.out.println("the sum of all element is array is :"+sum);
	int avg= sum/n;
	System.out.println("the avg of all element in array "+avg);
	
	//****************print reverse order element************//
	System.out.println("the reverse order element is :");
	for(int i=n-1;i>=0;i--)
	{
		System.out.print(a[i] + " ");
	}

    }
}
