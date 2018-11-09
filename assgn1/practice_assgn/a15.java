import java.io.*;

class asci
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int i,count=0;
		System.out.println("Enter String");
		s = d.readLine();
		s = s.trim();
		for(i=0;i<s.length();i++)
		{
			int num = (int)(s.charAt(i));
			if((num>=65)&&(num<=90))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}