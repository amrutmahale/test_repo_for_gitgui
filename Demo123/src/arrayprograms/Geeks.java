package arrayprograms;

import java.util.Arrays;

public class Geeks {

	
		   
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Get the Array
	        int intArr[] = { 10, 20, 15, 22, 35 };
	        int arr[]={ 10, 20, 22, 35,15,33 };
	 
	        //asList= To convert the elements as List
	        System.out.println("Integer Array as List: "
	                           + Arrays.asList(intArr)); // return hexadecimal address of array
	        System.out.println(intArr);
	        System.out.println(" binary search element postion is :"+ Arrays.binarySearch(intArr, 35));
	        //System.out.println("to compare  array:" +Arrays.compare(intArr, arr));
	        //compare method return zero(0) if  both array all element are same
	      //compare method return one(1) if  both array all element are not same
	       // //compare method return minus one(-1) if  both array all element
	        //are same same but position are different 
	        System.out.println("to check equality on array:"+Arrays.equals(intArr, arr));
	        //equals method return true if  both array all element and position are same
	      //equals method return false if  both array all element same but and position different
	       int a[]=null;
	       if(a==null)
	       {
	    	   System.out.println("array is empty");
	    	   
	       }
	       else
	       {
	    	   System.out.println("array is not empty");
	       }
	       //int p[]=new int [-1]; //negative index on array is not applicable// 
	       // int p[]=new int [null];////null ,empty index on array is not allowed
	      System.out.println("list array return using toString: "+Arrays.toString(intArr) );
	       // using toString return array as list format
	      
	      System.out.println("Integer Array: "
                  + Arrays.toString(
                        Arrays.copyOf(intArr, 6))); //copyOf(originalArray, newLength) Method 
	      System.out.println("copyrange from indexes:"+Arrays.toString(Arrays.copyOfRange(intArr, 1, 4)));

	   // To compare both arrays
	      /*  System.out.println("The element mismatched at index: "
	                           + Arrays.mismatch(intArr, arr));*/
	      
	    }
	}
