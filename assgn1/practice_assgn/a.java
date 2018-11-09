import java.io.*;

class ram
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String k,p;
		k = d.readLine();
		p = k.substring(2);
		System.out.println(p);
	}
}