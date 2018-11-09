import java.io.*;
class exceptions
{
	public static int length(String a, int n)
	{
		try
		{
			char ch = a.charAt(n);
			n = length(a,n+1);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			return n;
		}
		return n;
	}
	public static void main(String[] args)throws IOException 
	{
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int k[] = {0,1,2,3,4,5,6,7,8,9,10};
		String str = "01234567";
		input = d.readLine();
		int num=0;
		try
		{
			num = Integer.parseInt(input);
			int test1 = 1/Math.max(0,(num-4));
			int test2 = k[num];
			int test3 = str.charAt(num);
			System.out.print("R");
		}
		catch(NumberFormatException e)
		{
			System.out.println(length(input,0));
		}
		catch(ArithmeticException e)
		{
			System.out.print("Q");	
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.print("S");
			int test4 = 1/(num-10);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("P");
		}
		System.out.print("C\n");
	}
}