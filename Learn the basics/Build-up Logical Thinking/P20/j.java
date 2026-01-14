import java.util.*;

public class DiamondStar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		for(int i = 1; i <= v; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = v - 1; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
