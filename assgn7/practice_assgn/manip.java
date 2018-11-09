import java.io.*;

class f
{
	public static String delkth(String a, int k)
	{
		return a.substring(0,k) + a.substring(k+1);
	}
	public static String delfirst(String a)
	{
		return delkth(a,a.indexOf('x'));
	}
	public static String delfirsttwo(String a)
	{
		return delfirst(delfirst(a));
	}
	public static int secloc(String a)
	{
		return 1 + delfirst(a).indexOf('x');
	}
	public static int firstloc(String a)
	{
		return secloc("x"+a) - 1;
	}
	public static String delfirstk(String a, int k)
	{
		for (int i=0; i<k; i++) 
		{
			a = delfirst(a);
		}
		return a;
	}
	public static String delall(String a)
	{
		while(a.indexOf('x') != -1)
		{
			a = delfirst(a);
		}
		return a;
	}
	public static int count(String a)
	{
		return a.length() - delall(a).length();
	}
	public static int loc(String a, int k)
	{
		return (k - 1) + firstloc(delfirstk(a,k-1));
	}
	public static String aft(String a, char b)
	{
		String s="";
		for(int i=0;i<a.length()-1;i++)
		{
			if(a.charAt(i) == b)
				s = s + a.charAt(i+1);
		}
		return s;
	}
	public static String mr(String a)
	{
		if(aft(a,a.charAt(0)).length()>1)
		{
			return "yes";
		}
		return "no";
	}
	public static String more(String a)
	{
		String [] arr = a.trim().split(" ",-1);
		String s = "";
		for(String temp : arr)
		{
			if(mr(temp).equals("yes"))
				{
					s = s + temp + " ";
				}
		}
		return s.trim();
	}
	public static int cnt(String a, String b)
	{
		int count = 0;
		b = b + " ";
		for(int i=0;i<a.length();i++)
		{
			String temp = a.charAt(i) + b;
			if(mr(temp).equals("yes"))
			{
				count++;
			}
		}
		return count;
	}
	public static int length(String a)
	{
		return cnt(a,a);
	}
	public static String subset(String a, String b)
	{
		if(cnt(a,b) ==  length(a))
		{
			return "yes";
		}
		return "no";
	}
	public static String subset_loop(String a, String b)
	{
		int count = 0;
		b = b + " ";
		for(int i=0;i<a.length();i++)
		{
			String temp = a.charAt(i) + b;
			if(mr(temp).equals("no"))
			{
				return "no";
			}
		}
		return "yes";
	}
	public static String first(String a)
	{
		String [] arr = a.trim().split(" ",-1);
		String s = "";
		for(String temp : arr)
		{
			s = s + temp.charAt(0);
		}
		return s;
	}
	public static String present(String a, String b)
	{

		String [] arr = a.trim().split(" ",-1);
		String s = "";
		for(String temp : arr)
		{
			if(subset(temp,b).equals("yes"))
			{
				s = s + temp + " ";
			}
		}
		return s.trim();
	}
	public static String presentfirst(String a, String b)
	{
		return first(present(a,b));
	}
	public static String prfirst(String a, String b)
	{
		String [] arr = a.trim().split(" ",-1);
		String s="";
		for(String temp : arr)
		{
			if(subset(temp.substring(1),b).equals("yes") && (length(temp) != 1))
			{
				s = s + temp.charAt(0);
			}
		}
		return s;
	}
	public static String abcfirst()
}

class Manipulation
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String input,input2;
		input = d.readLine();
		input2 = d.readLine();
		//int n = Integer.parseInt(d.readLine());
		//char a = (char)(d.read());
		System.out.println(f.prfirst(input,input2));
	}
}