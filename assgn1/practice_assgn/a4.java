import java.io.*;

class charc
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n;
		System.out.println("Enter Number");
		n = Integer.parseInt(d.readLine());
		System.out.println("Enter String");
		s = d.readLine();
		char ch = s.charAt(n);
		System.out.println(ch);
	}
}