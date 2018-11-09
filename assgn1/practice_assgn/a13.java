import java.io.*;

class exch
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.println("Enter String");
		s = d.readLine();
		s = s.trim();
		char ch[] = s.toCharArray();  
		char temp;
		temp = ch[0];
		ch[0] = ch[1];
		ch[1] = temp;
		String fin = new String(ch);
		System.out.println(fin);
	}
}