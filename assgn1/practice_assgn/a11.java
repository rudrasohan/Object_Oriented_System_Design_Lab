import java.io.*;

class fourth
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s,b;
		System.out.println("Enter String");
		s = d.readLine();
		int loc=0,i,count=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'x')
			{
				count++;
			}
			if(count==4)
			{
				loc=i;
				break;
			}
		}
		
		System.out.println(s.substring(i+1));
	}
}