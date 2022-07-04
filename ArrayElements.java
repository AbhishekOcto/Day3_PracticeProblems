package assignment3;
import java.util.Scanner;
public class ArrayElements {
			public static void main(String[] args) {
				System.out.println("Enter the size of array");
				Scanner sc = new Scanner(System.in);
				int arrSize = sc.nextInt();
				int arr[] = new int[arrSize];
				System.out.println("Enter array elements");
				
				for (int i=0; i<arrSize; i++) {
					arr[i] =sc.nextInt();
				}
				for(int i=0; i<arrSize; i++) {
					System.out.println(arr[i]);
				}
				sc.close();
		
		// TODO Auto-generated method stub

	}

}
