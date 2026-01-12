import java.util.Scanner;

public class j {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter NOE: ");
		int v = in.nextInt();
		
		int i = v;

		while (i >= 1) {
			int j = v;
		while (j >= 1) {
			System.out.print("* ");
			j--;
		}
		System.out.println();
		i--;
	}
    }
}
