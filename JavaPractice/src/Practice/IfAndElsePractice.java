package Practice;

import java.util.Scanner;

public class IfAndElsePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scan.nextInt();
		scan.close();
		
		if(input>=1 && input<=100) {
			
			if(input % 2 == 0) {
				if(input >= 2 && input <=5) {
					
					System.out.println("Not Weird");
				}else if(input >= 6 && input <=20) {
					
					System.out.println("Weird");
				}else {
					System.out.println("Not Weird");
				}
						
				
			}else {
				
				System.out.println("Weird");
			}
			
			
		}else {
			
			System.out.println("Invalid input. Try again");
		}

	}

}
