import java.io.*;

class first
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.println("Enter String");
		s = d.readLine();
		int num = s.indexOf('x');
		if(num != -1)
		{
			char ch = s.charAt(+1);
			System.out.println(ch);
		}
		else
		{
			System.out.println(num);
		}

		
	}
}