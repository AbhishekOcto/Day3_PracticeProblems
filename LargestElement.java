package assignment3;

public class LargestElement {
		    public static void main(String[] args) {  
		  
		        //Initialize array  
		        int [] arr = new int [] {12,13,45,8,6};  
		        //Initialize max with first element of array.  
		        int max = arr[0];  
		        //Loop through the array  
		        for (int i = 0; i < arr.length; i++) {  
		            //Compare elements of array with max  
		           if(arr[i] > max)  
		               max = arr[i];  
		        }  
		        System.out.println("Largest element present in given array: " + max);  
		  

	}

}
