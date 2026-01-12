import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("NOE: ");
        int v = in.nextInt();

        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }
}
