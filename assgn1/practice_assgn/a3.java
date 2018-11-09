import java.io.*;

class exchange
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String n,fin;
		System.out.println("Enter String");
		n = d.readLine();
		fin = n.substring(0,2) + n.substring(5,6) + n.substring(3,5) + n.substring(2,3) + n.substring(6);
		System.out.println(fin);
	}
}