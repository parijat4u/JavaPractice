package Practice;
 class StringVsStringBuilder {

	
	public static void main(String[] args) {
		String input="12Java345Python890Selenium";
		StringBuilder output= new StringBuilder();
		for (char ch:input.toCharArray()) {
			
			if(Character.isAlphabetic(ch)) {
				output = output.append(ch);
			}
		}

		System.out.println(output);
	}

}
