package assignment3;

public class SecondLargestElement {

	 
			public static int getSecondLargest(int[] a, int total){  
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        }  
			       return a[total-2];  
			}  
			public static void main(String args[]){  
			int a[]={2,1,3,4,5,6};  
			int b[]={78,84,79,23,21};  
			System.out.println("Second Largest: "+getSecondLargest(a,6));  
			System.out.println("Second Largest: "+getSecondLargest(b,7));  
			
		
		
		// TODO Auto-generated method stub

	}

}
