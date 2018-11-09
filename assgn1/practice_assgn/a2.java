import java.io.*;

class letter
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String n,fin;
		System.out.println("Enter String");
		n = d.readLine();
		fin = n.substring(0,2) + n.substring(4);
		System.out.println(fin);
	}
}