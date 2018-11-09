import java.io.*;

class digits
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n;
		System.out.println("Enter String");
		s = d.readLine();
		char ch = s.charAt(Integer.parseInt(s.substring(0,1)));
		System.out.println(ch);
	}
}