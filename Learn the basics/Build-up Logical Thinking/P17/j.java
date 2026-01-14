import java.util.*;

public class PalindromeAlphabet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		for(int i = 1; i <= v; i++) {

			char c = 'A';
			for(int j = 1; j <= i; j++) {
				System.out.print(c);
				c++;
			}

			c -= 2;
			for(int j = 1; j < i; j++) {
				System.out.print(c);
				c--;
			}

			System.out.println();
		}
	}
}
