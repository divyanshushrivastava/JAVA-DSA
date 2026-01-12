import java.util.*;

public class j {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		int i = v;
		while(i >= 1) {
			int j = i;
			while(j >= 1) {
				System.out.print("* ");
				j--;
			}
			System.out.println();
			i--;
		}
	}
}