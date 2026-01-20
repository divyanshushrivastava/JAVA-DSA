import Utilities.Log;
import java.util.Scanner;

public class j{
static void r(int fac, int n, int count){

if(n == 0){
System.out.print("1");
return;
}

if(count > n){
System.out.print(fac);
return;
}

r(fac*count, n, count + 1);
}

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("N :");
int n = in.nextInt();

String ilog = "Input:\nN: " + n;

Log.startCapture();

r(1, n, 1);

Log.write(ilog);
}
}