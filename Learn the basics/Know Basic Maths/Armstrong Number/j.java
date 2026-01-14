import java.util.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("N: ");
		int n = in.nextInt();

		int temp = n;
		int sum = 0;
		int count = 0;

		int t = n;
		while(t != 0) {
			count++;
			t = t / 10;
		}

		while(n != 0) {
			int d = n % 10;
			int p = 1;

			for(int i = 1; i <= count; i++) {
				p = p * d;
			}

			sum = sum + p;
			n = n / 10;
		}

		if(sum == temp)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
