import java.io.*;
class exceptions
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String input;
		input = d.readLine();

		int num1=0;
		try
		{
			num1 = Integer.parseInt(input);
			int test = 1/(Math.max(0,num1-5));
			System.out.println("ram");

		}
		catch(ArithmeticException e)
		{
			System.out.println("hari");
		}
	}
}