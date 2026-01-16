import Utilities.Log;
import java.util.Scanner;

public class j{
	static void r(int count){
		if(count == 0)
			return;
		
		System.out.print(count + " ");

		r(count - 1);
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("N:");
		int n = in.nextInt();

		String ilog = "Input\nN: " + n;

		Log.startCapture();

		r(n);

		Log.write(ilog);

		in.close();
	}
}