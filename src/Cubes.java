import java.util.*;
import java.lang.*;

public class Cubes {
	public static int sumofcubes(int n) {
		int sum = 0;
		for (int x = 1; x <= n; x++)
			sum += x * x * x;
		return sum;
	}

	public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
    	System.out.println(sumofcubes(n));
    }
}
