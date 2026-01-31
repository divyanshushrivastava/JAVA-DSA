import Utilities.Log;
import java.util.*;

public class j{
static void r(int im1, int sum, int n, int c){
if(c > n)
return;
System.out.print(sum + " ");
r(sum, im1 + sum, n, c + 1);
}

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("N: ");
int n = in.nextInt();

String ilog = "Input:\nN: " + n;

Log.startCapture();

if(n > 0){
if(n == 1)
System.out.print(0);
else if(n == 2)
System.out.print("0 1 ");
else{
System.out.print("0 1 ");
r(1, 1, n, 3);
}
}

in.close();

Log.write(ilog);
}
}