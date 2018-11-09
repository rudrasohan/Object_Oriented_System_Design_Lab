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
			System.out.println(num*2);
		}
		catch(NumberFormatException e)
		{
			System.out.println("0");
		}
	}
}