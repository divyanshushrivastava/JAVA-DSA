import java.util.*;

public class ConcentricNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("NOE: ");
		int v = in.nextInt();

		int size = 2 * v - 1;

		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {

				int top = i;
				int left = j;
				int right = size - 1 - j;
				int bottom = size - 1 - i;

				int min = Math.min(Math.min(top, bottom), Math.min(left, right));
				System.out.print((v - min) + " ");
			}
			System.out.println();
		}
	}
}
