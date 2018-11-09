import java.io.*;
class exceptions
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String input;
		input = d.readLine();
		int num=0;
		try
		{
			num = Integer.parseInt(input);
			int test2 = 1/Math.min(0,(num-11));
		}
		catch(NumberFormatException e)
		{
			System.out.print("B");
		}
		catch(ArithmeticException e)
		{
			System.out.print("P");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.print("D");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.print("D");
		}
		System.out.print("C\n");
	}
}