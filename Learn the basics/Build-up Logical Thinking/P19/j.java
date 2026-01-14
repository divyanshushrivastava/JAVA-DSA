import java.util.*;

public class HollowStarSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		for(int i = 1; i <= v; i++) {
			for(int j = 1; j <= v; j++) {
				if(i == 1 || i == v || j == 1 || j == v)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
