package jan30assignments;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class ps5 {
public static void main(String args[])
{
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter string:");
	String str=scan.next();
	StringBuilder sb=new StringBuilder();
	sb.append(str);
	sb.reverse();
	System.out.println("String="+sb);
}
}
