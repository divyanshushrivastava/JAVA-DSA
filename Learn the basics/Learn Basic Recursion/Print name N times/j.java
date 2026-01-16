import Utilities.RunLogger;
import java.util.Scanner;

class Recursion {
    public void fn(String name, int count, int n) {
        if (count == n) return;
        System.out.println(name);
        fn(name, count + 1, n);
    }
}

public class j {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Recursion r = new Recursion();

        System.out.print("N: ");
        int n = in.nextInt();
        in.nextLine();

        System.out.print("Name: ");
        String name = in.nextLine();

        // ---- build generic log strings ----
        String inputLog =
            "Input:\n" +
            "N: " + n + "\n" +
            "Name: " + name + "\n";

        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            outputBuilder.append(name).append("\n");
        }

        String outputLog =
            "Output:\n" +
            outputBuilder.toString();

        // ---- write to file ----
        RunLogger.write(inputLog + outputLog);

        // ---- normal output ----
        r.fn(name, 0, n);

        in.close();
    }
}
