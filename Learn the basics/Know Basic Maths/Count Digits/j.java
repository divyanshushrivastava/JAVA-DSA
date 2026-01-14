import java.util.*;

public class CountDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("N: ");
		int n = in.nextInt();

		int count = 0;

		if(n == 0) {
			count = 1;
		} else {
			while(n != 0) {
				n = n / 10;
				count++;
			}
		}

		System.out.println(count);
	}
}
