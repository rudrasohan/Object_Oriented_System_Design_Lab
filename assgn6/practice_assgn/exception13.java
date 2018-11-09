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
			String test1 = input.substring(5);
			int l = input.length();
			int test2 = 1/Math.min(0,(l-9));
			System.out.println("dipu");

		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("ram");
		}
		catch(ArithmeticException e)
		{
			System.out.println("hari");
		}
	}
}