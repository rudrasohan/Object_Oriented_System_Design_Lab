import java.io.*;

class second
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		boolean flag = false;
		System.out.println("Enter String");
		s = d.readLine();
		int loc=0,i;
		int num = s.indexOf('x');
		for(i=num+1;i<s.length();i++)
		{
			if(s.charAt(i) == 'x')
			{
				flag = !flag;
				loc = i;
				break;
			}
		}
		if(flag)
		{
			System.out.println(loc);
		}
		else
		{
			System.out.println("abs");
		}

		
	}
}