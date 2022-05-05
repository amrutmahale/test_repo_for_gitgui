package arrayprograms;

public class Descendingorder {

	public static void main(String[] args) {
		int a[]= {10,20,90,10,20,40,30,80,60,50,70};
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
                {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("the descending order element is:");
		for(int i=0;i<n;i++)
		{ 
			System.out.print(" "+a[i]);//print sorted array
		}
		System.out.println();
		System.out.println("**********************************");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("the duplicate element is :"+a[i]);
				}
				
			}
		}
		
	}

}
