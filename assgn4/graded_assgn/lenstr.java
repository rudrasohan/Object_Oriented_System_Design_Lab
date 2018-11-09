import java.io.*;

class str
{
	public static void main(String[] args)  throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));	
		String a,e="";
		int len=0;
		System.out.println("Enter a string: ");
		a = read.readLine();
		len = a.compareTo(e);
		System.out.println("Length = "+len);
		
	}

}