import java.util.*;

public class GCD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("N1: ");
		int n1 = in.nextInt();

		System.out.print("N2: ");
		int n2 = in.nextInt();

		while(n1 != n2) {
			if(n1 > n2)
				n1 = n1 - n2;
			else
				n2 = n2 - n1;
		}

		System.out.println(n1);
	}
}
