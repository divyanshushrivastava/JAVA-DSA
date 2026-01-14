import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("N: ");
		int n = in.nextInt();

		int count = 0;

		if(n > 1) {
			for(int i = 1; i <= n; i++) {
				if(n % i == 0)
					count++;
			}
		}

		if(count == 2)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
