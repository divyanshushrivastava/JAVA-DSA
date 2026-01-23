import Utilities.Log;
import java.util.Scanner;

public class j{
static void r(String s, int count, int match){
if(count == s.length()/2 || s.length() == 1){
if(match == s.length()/2)
System.out.print("Palindrome");
else
System.out.print("Not palindrome");
return;
}

if(s.charAt(count)==s.charAt(s.length()-count-1))
match += 1;
r(s, count+1, match);
}

public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("String: ");
String s = in.nextLine();

String ilog = "Input \nString: " + s;

Log.startCapture();

r(s, 0, 0);

Log.write(ilog);

in.close();
}
}