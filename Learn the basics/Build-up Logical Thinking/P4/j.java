import java.util.*;

public class j {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		int i = 1;
		while(i <= v) {
			int j = 1;
			while(j <= i) {
				System.out.print(i + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}