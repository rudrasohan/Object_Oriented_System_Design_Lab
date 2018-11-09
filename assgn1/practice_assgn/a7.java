import java.io.*;

class ternary
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s1,s2,s3,result;
		System.out.println("Enter 3 String");
		s1 = d.readLine();
		s2 = d.readLine();
		s3 = d.readLine();
		result = (s1.compareTo(s2) > 0) ? ((s1.compareTo(s3)>0) ? s1:s3) : ((s2.compareTo(s3)>0) ? s2:s3) ;
		System.out.println(result);
	}
}