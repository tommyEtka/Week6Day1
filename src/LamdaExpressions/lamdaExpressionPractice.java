package LamdaExpressions;

import java.util.ArrayList;

public class lamdaExpressionPractice {
	
	public static void main(String[] args) {
		
		ArrayList<String> ls = new ArrayList<String>();
		
		ls.add("Hello");
		ls.add("Hello1");
		ls.add("Hello2");
		
		
		
			ls.replaceAll(str -> str.toUpperCase());
		
		ls.forEach(str->System.out.println(str));
	}

}
