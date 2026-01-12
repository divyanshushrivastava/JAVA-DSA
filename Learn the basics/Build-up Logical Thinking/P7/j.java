import java.util.*;

public class j {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		for (int i = 1; i <= v; i++) {
            		for (int s = 1; s <= v - i; s++) {
                		System.out.print(" ");
            		}
            		for (int star = 1; star <= (2 * i - 1); star++) {
                		System.out.print("*");
            		}
			System.out.println();
		}
	}
}