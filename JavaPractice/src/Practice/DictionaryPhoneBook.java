package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryPhoneBook {

	public static void main(String[] args) {
		Map<String,Integer> dictPhBk=new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter the number of phonebook entries: ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
        	//System.out.println("Enter name and phone number in the same line separated by space:");
            String name = in.next();
            int phone = in.nextInt();
            Integer wrapperPhone=Integer.valueOf(phone);
            dictPhBk.put(name, wrapperPhone);
        }
        //Find whether the name exists in the phonebook
        while(in.hasNext()){
        	
            String s = in.next();
            if(dictPhBk.containsKey(s)) {
            	System.out.println(s+"="+dictPhBk.get(s));
            	
            }else {
            	System.out.println("Not found");
            }
        }
        in.close();

	}

}
