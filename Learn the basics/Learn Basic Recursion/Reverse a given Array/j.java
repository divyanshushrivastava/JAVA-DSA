import Utilities.Log;
import java.util.Scanner;

public class j{
static void r(int[] arr, int n){

}

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("N: ");
int n = in.nextInt();

System.out.print("Array: ");
int i = 0;
int[] arr = new int[n];
String arrstr = "";
while(i < n){
arr[i] = in.nextInt();
arrstr += arr[i] + " ";
i++;
}

String ilog = "Input:\nN: " + n + "\nArray: " + arrstr;

Log.startCapture();

r(arr, n);

Log.write(ilog);

in.close();
}
}