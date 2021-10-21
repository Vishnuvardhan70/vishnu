package day3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		
		//String str3 = "mrs.";
				String str3 = "mr.";
				Pattern p = Pattern.compile("mrs?\\.");//. represents single character 
				Matcher m = p.matcher(str3);  
				boolean b = m.matches();

				System.out.println(b);
				boolean b2=Pattern.compile(".s").matcher("*s").matches();
				System.out.println(b2);
				boolean b3 = Pattern.matches("mrs?\\.", "mr"); //false
				System.out.println(b3);
				String str2 = "044-12349876";
				System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}", str2));
				String str4 =  "user@gmail.com";
			    String str5 = "user_12@gmail.com";
			    String str6 = "user123@yahoo.co.in";

			    System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}", str6)); //false
			    System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}.*", str6)); //true
			    System.out.println(Pattern.matches("\\w{3,}@.*", str5)); //true

	}
}
	
