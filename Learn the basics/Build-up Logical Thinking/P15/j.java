import java.util.*;

public class j {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		for(int i = v; i >= 1; i--) {
			char c = 'A';
			for(int j = 1; j <= i; j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}
