package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindConsecutiveBinary {
	
	public static int consecutiveBinary(String arr) {
		
		String[] tempArr= new String[arr.length()];
		//To get String array of consecutive 1's
		tempArr= arr.split("0");
		int max=0;
		for(String s: tempArr) {
			if(max < s.length()) {
				max=s.length();
			}
		}
		return max;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a base 10 number: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        //Finding binary of a number 'n' use Integer.toBinaryString(n)
        System.out.println("The binary of "+ n + " is: "+Integer.toBinaryString(n));
        System.out.println("The highest consecutive 1's is: "+ consecutiveBinary(Integer.toBinaryString(n)));

        bufferedReader.close();
    }

}
