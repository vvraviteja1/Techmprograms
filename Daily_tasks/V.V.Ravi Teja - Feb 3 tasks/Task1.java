package Feb3tasks;

public class Task1 {
	public static void main(String[] args)
	{
		int a=30,b=0,c=0,res;
		try {
			res=a/(b-c);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Cannot divide by 0");	}
	finally {
		b++;
		res=a/(b-c);
		System.out.println("Result="+res);
	}
}
}
