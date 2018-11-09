import java.io.*;

class del
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int i;
		System.out.println("Enter String");
		s = d.readLine();
		s = s.trim();
		for(i=1;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
}