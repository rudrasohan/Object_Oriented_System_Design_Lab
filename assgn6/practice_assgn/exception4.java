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
			System.out.print("A");
			int test = 1/Math.max(0,(num-5));
			System.out.print("E");
		}
		catch(NumberFormatException e)
		{
			System.out.print("B");
		}
		catch(ArithmeticException e)
		{
			System.out.print("D");
		}
		System.out.print("C\n");
	}
}