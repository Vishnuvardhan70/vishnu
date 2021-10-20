
public class SumOfFirstNnaturalNumbers {

		public static void main(String[] args) {

		int k;
		System.out.println("Number divisible by 3");
		for(k=1;k<100;k++)
		{
		if(k%3==0)
		System.out.println(k +" , ");
		}
		System.out.println("Number divisible by 5");
		for(k=1;k<100;k++) {
		if(k%5==0)
		System.out.println(k +" , ");

		}
		System.out.println("Number divisible by 3 and 5");
		for(k=1;k<100;k++) {
		if(k%3==0 && k%5==0)
		System.out.println(k +" , ");

		}
		System.out.println();

		}

		}

