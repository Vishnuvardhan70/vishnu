
	import java.util.*;

	public class TrafficLight 
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the signal :");
			String a=sc.nextLine();
			System.out.println("you have entered "+a);
			if (a.equals("red"))
			{
				System.out.println("STOP");
			}
			else if (a.equals("orange"))
			{
				System.out.println("READY");
			}
			else
			{
				System.out.println("GO");
			}
		}
	}

