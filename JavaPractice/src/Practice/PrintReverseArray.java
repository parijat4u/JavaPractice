package Practice;

import java.util.Scanner;

public class PrintReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int sizeOfArr=scan.nextInt();
		scan.nextLine();
		int[] inputArr=new int[sizeOfArr];
		
		for(int i=0; i<sizeOfArr;i++) {
			inputArr[i]=scan.nextInt();
			
		}
		scan.close();
		for(int i=sizeOfArr-1; i>=0;i--) {
			System.out.print(inputArr[i]+" ");
			
		}

	}

}
