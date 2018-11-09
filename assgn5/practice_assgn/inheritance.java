import java.io.*;

class stack
{
	protected String s[] = new String[10];
	int sp = 1;
	public void put(String e)
	{ s[sp] = e;sp++;}
	public String take()
	{ sp--;return s[sp];}
	public String top()
	{return s[sp-1];}
	public void pt()
	{int i; for(i=1;i<sp;i++) System.out.print(s[i]+" ");}
}

class queue extends stack
{
	
	public String Take()
	{
		String temp = s[1];
		for(i=1;i<st-1;i++)
		{
			s[i] = s[i+1]
		}
		st--;
	}
	public String Top()
	{
		return s[1];
	}
	
}

class priority_queue extends stack
{
	public void put(String e)
	{
		s[0] = "-999";
		if(sp == 1)
		{ s[1] = e; sp++;} 
		else
		{
			int pos = sp;
			int i;
			int test = Integer.parseInt(e);
			for(i=sp-1;i>=0;i--)
			{
				int temp = Integer.parseInt(s[i]);
				if(test>temp)
				{
					pos = i+1;
					break;
				}	
			}
			for (i=sp;i>pos;i--)
			{
				s[i] = s[i-1];
			}
			s[pos] = e;
			sp++;
		}
	}
}

class kapil
{
	public static void main(String[] args)throws IOException
	{
		String a = "",b; int i; queue x = new queue();
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			a = d.readLine(); i = a.indexOf(' ');
			if (i!=-1) b = a.substring(0,i); else b = a;
			if (b.compareTo("put")==0) x.put(a.substring(i+1));
			if (b.compareTo("take")==0) System.out.println("The taken element "+x.Take());
			if (b.compareTo("top")==0) System.out.println("The first element "+x.Top());
			if (b.compareTo("print")==0) x.pt(); System.out.println();		
		}while(b.compareTo("exit")!=0);
	}
}