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
			String test = input.substring(5);
			System.out.println("hari");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("ram");
		}
	}
}