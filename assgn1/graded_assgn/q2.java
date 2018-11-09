import java.io.*;

class reverse
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.println("Enter String");
		s = d.readLine();
		s = s.trim();
		int l = s.length()-1;
		int flag = 1,i;
		char ch[] = s.toCharArray(); 
		for(i=0;i<s.length();i++)
		{
			if(ch[i] != ch[l-i])
			{
				flag = 0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("NOT A PALINDROME");
			for(i=(s.length()-1);i>=0;i--)
			{
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		else
		{
			System.out.println("A PALINDROME");
		}
		
	}
}