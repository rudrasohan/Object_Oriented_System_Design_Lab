import java.io.*;
class exceptions
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String input;
		input = d.readLine();

		int num1=0;
		float num2 = 0.0f;
		try
		{
			num2 = Float.parseFloat(input);
			int test = 1/((int)Math.ceil(num2) - (int)Math.floor(num2));
			System.out.println(3*(float)num2);

		}
		catch(ArithmeticException e)
		{
			System.out.println(2*(int)num2);
		}
	}
}