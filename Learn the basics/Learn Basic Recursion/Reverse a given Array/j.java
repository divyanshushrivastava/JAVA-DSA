import Utilities.Log;
import java.util.Scanner;

public class j{
static void r(int[] arr, int n, int[] swap, int count){
if(count == n){
int i = 0;
while(i < n){
System.out.print(swap[i] + " ");
i++;
}
return;
}

swap[count] = arr[n-1-count];
r(arr, n, swap, count+1);
}

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("N: ");
int n = in.nextInt();

System.out.println("Array: ");
int i = 0;
int[] arr = new int[n];
int[] swap = new int[n];
String arrstr = "";
while(i < n){
arr[i] = in.nextInt();
arrstr += arr[i] + " ";
i++;
}

String ilog = "Input:\nN: " + n + "\nArray: " + arrstr;

Log.startCapture();

r(arr, n, swap, 0);

Log.write(ilog);

in.close();
}
}