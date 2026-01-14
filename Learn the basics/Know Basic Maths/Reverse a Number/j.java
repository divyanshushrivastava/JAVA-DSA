import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("N: ");
		int n = in.nextInt();

		int rev = 0;

		while(n != 0) {
			int d = n % 10;
			rev = rev * 10 + d;
			n = n / 10;
		}

		System.out.println(rev);
	}
}
