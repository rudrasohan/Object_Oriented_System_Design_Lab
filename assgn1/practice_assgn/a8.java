import java.io.*;

class last
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s,result;
		System.out.println("Enter String");
		s = d.readLine();
		char ch = s.charAt(s.length()-1);
		System.out.println(ch);
	}
}