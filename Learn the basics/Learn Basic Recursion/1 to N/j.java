import Utilities.Log;
import java.util.*;

public class j{
	static void method(int count, int n){
		if(count == n+1)
			return;

		System.out.print(count + " ");

		method(count+1, n);
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("N: ");
		int n = in.nextInt();

		String ilog = "Input:\nN: " + n;

		Log.startCapture();

		method(1, n);

		Log.write(ilog);

		in.close();
	}
}