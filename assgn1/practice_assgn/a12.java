import java.io.*;

class summ
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s,b;
		System.out.println("Enter String");
		s = d.readLine();
		s = s.trim();
		int n1,n2,n3,i,j;
		i = s.indexOf(" ");
		j = s.lastIndexOf(" ");
		n1 = Integer.parseInt(s.substring(0,i));
		n2 = Integer.parseInt(s.substring(i+1,j));
		n3 = Integer.parseInt(s.substring(j+1));
		System.out.println((n1+n2+n3));
	}
}