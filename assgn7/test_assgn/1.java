import java.io.*;

class sequence
{
	public static String int_to_bin(int k,int b)
	{
		String s = "";
		while(k != 0)
		{
			s = k%2 + s;
			k = k/2;
		}
		s = s.trim();
		int l = s.length();
		if(l<b)
		{
			for(int i=0;i<(b-l);i++)
			{
				s = "0" + s;
			}
		}
		return s;
	}
	public static void set(int n)
	{
		for(int i=0;i<Math.pow(2,n);i++)
		{
			String temp = int_to_bin(i,n);
			System.out.print("{");
			for(int j=n;j>=1;j--)
			{
				if(temp.charAt(n-j) == '1')
					System.out.print(j+",");
			}
			System.out.print("}\n");
		}
	}
	public static void main(String[] args)throws IOException 
	{
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(d.readLine());
		set(n);
	}
}