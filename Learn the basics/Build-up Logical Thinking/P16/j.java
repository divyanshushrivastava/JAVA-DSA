import java.util.*;

public class j {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		int i = v;
		while(i >= 1) {
			int j = 1;
			while(j <= i) {
				System.out.print(j + " ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}