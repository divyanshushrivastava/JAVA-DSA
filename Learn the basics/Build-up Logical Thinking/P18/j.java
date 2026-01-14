import java.util.*;

public class ReverseAlphabetTriangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		for(int i = v; i >= 1; i--) {
			char c = (char)('A' + i - 1);

			for(int j = i; j <= v; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}
}
