package jan30assignments;
import java.util.Scanner;
public class ps6 {
public static void main(String args[])
{
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number:");
	int num=scan.nextInt();
	int rev=0;
	for(;num!=0;num=num/10)
	{
		int rem=num%10;
		rev=rev*10+rem;
	}
	System.out.println("Reversed number:"+rev);
}
}
