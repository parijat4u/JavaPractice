package Practice;

import java.io.*;

import java.util.*;



public class Loops {
    public static void main(String[] args) throws IOException {
        
    	int result;
    	Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scan.nextInt();
        scan.close();
        if(input >=2 && input <=20) {
        	
        	for(int i=1; i <=10; i++) {
        		
        		result = input * i;
        		System.out.println(input+ " x "+i+" = "+result );
        	}
        	
        	 
        }else {
        	
        	System.out.println("Invalid number");
        }
    }
}
