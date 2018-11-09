import java.io.*;

class name
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String n1,n2,fin;
		System.out.println("Enter Names");
		n1 = d.readLine();
		n2 = d.readLine();
		fin = n1.substring(1) + n2.substring(1);
		System.out.println(fin);
	}
}