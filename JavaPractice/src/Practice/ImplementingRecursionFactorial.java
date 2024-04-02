package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ImplementingRecursionFactorial {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        scan.close();

        int result = RecursionFactorial.factorial(n);
        System.out.println("The factorial of "+ n+" is: "+result);
        
    }
}

