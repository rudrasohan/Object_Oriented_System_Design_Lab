import java.io.*;

class nums
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n;
		System.out.println("Enter Number");
		n = Integer.parseInt(d.readLine());
		n = 2*n;
		s = n + "";
		s = s.substring(0,2) + s.substring(3);
		System.out.println(s);
	}
}