import Utilities.Log;
import java.util.Scanner;

public class j{
	static void r(int count, int sum, int n){
		if(count > n){
			System.out.print(sum);
			return;
		}

		r(count + 1, count + sum, n);
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("N: ");
		int n = in.nextInt();

		String ilog = "Input:\nN: " + n;
	
		Log.startCapture();
		
		r(1, 0, n);

		Log.write(ilog);
		
		in.close();
	}
}