package Practice;

import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if(initialAge < 0) {
  			
  			this.age=0;
  			System.out.println("Age is not valid, setting age to 0.");
  		}else {
  			this.age=initialAge;
  			System.out.println("Age is: "+age);
  		}
	}

	public void amIOld() {
  		if(this.age < 13) {
  			
  			System.out.println("You are young.");
  		}else if(this.age >= 13 && this.age < 18) {
  			
  			System.out.println("You are a teenager.");
  		}else {
  			System.out.println("You are old.");
  		}
	}

	public void yearPasses() {
  		this.age++;
  		System.out.println("Year Passes by and the age is: " + this.age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		sc.close();
		Person p = new Person(age);
		System.out.println("Check how old your are.");
		p.amIOld();

		p.yearPasses();

		p.amIOld();
		System.out.println();
		
    }
}
