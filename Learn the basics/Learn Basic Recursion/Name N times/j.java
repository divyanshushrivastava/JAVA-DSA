import Utilities.Log;
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

        String ilog =
            "Input:\n" +
            "N: " + n + "\n" +
            "Name: " + name + "\n";
        
        Log.startCapture();

        r.fn(name, 0, n);

	Log.write(ilog);

        in.close();
    }
}
