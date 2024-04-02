package Practice;

import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		System.out.println("Enter the number of test cases: ");
		Scanner scan = new Scanner(System.in);
		int T =scan.nextInt();
		scan.nextLine();
		if(T >=1 && T <=10) {
			for(int j=1; j<=T; j++) {
				System.out.println("Enter a string:");
				
				String input=scan.nextLine();
				
				char[] charArray=input.toCharArray();
				char temp;
				String evenStr="";
				String oddStr="";
				int length=input.length();
				for(int i=0; i<= length -1; i++) {
					
					if(i%2==0) {
						
					temp =charArray[i];
					evenStr=evenStr + Character.toString(temp);
					}else {
						
						temp=charArray[i];
						oddStr=oddStr + Character.toString(temp);
					}
					
					
				}
				
				System.out.println("Even string is: "+ evenStr);
				System.out.println("Even string is: "+ oddStr);
				
			}
			
			
		}else {
			System.out.println("The number of test cases should be less than 10.");
		}
		
		scan.close();
	}

}
