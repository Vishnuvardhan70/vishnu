package day3;
import java.util.regex.Pattern;
public class RegExAss {
	public static void main(String[] args) {
		String str1="flyingreturn.base@airindia.in";
		String str2=" star.retros@airindia.in";
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{2,}@\\w{2,}\\.\\w{1,}", str1));//false
	  
	    String str3="1860 233 1407";
	    System.out.println(Pattern.matches("\\d{4,}\\s\\d{2,}\\s\\d{4,}", str3)); //false
	    
	    String str5 = "020-26231407";
	    System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}", str5));
	    
	    String str6="0930 hrs - 1730 hrs";
	    System.out.println(Pattern.matches("\\d{4,}\\s\\w{3,}\\s\\-\\s\\d{3,}\\s\\w{3,}", str6));
	    
	  String str7 = "MTNL / BSNL"; 
	  System.out.println(Pattern.matches("\\w{3,}\\s\\/\\s\\w{3,}", str7));
	 String str8 = "+ 91 124 2641407 (International call rates applicable)";
	 System.out.println(Pattern.matches("\\+91\\s[0-9]{3}\\s[0-9]{7}\\s[a-zA-Z\\s(International call rates applicable)]*", str8));
	}
	}