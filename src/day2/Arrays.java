package day2;

public class Arrays {
	public static void main(String[] args) {

		int[] x = new int[5];

		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;

		System.out.println(x[4]);

		// foreach loop
		for (int num : x) {
			System.out.println(num);
		}

		System.out.println();
		System.out.println("Even index value");
		for (int i = 0; i < x.length; i++) {
			// print even index values
			if (i % 2 == 0) {
				System.out.println(x[i]);
			}

		}
		System.out.println("Odd Index values");
		for (int i = 0; i < x.length; i++) {
			// print Odd index values
			if (i % 2 != 0) {
				System.out.println(x[i]);
			}
		}
	}

	public static void sort(int[] a) {
		// TODO Auto-generated method stub
		
	}
}
