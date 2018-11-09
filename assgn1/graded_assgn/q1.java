import java.io.*;

class adder
{
	public static void main(String args[]) throws IOException
	{

		//DataInputStream t = new DataInputStream(System.in);
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String s;
		System.out.println("Enter String");
		s = d.readLine();
		s = s.trim();
		int i,loc=0;
		float n1,n2;
		int opp[] = new int[4];
		opp[0] = s.indexOf('+');
		opp[1] = s.indexOf('-');
		opp[2] = s.indexOf('*');
		opp[3] = s.indexOf('/');
		for(i=0;i<4;i++)
		{
			if(opp[i]>=0)
			{
				loc=i;
				break;
			}
		}
		//System.out.println(opp[0]);
		n1 = Integer.parseInt(s.substring(0,opp[loc]));
		n2 = Integer.parseInt(s.substring(opp[loc]+1));
		double fin = 0.0;
		if(loc==0)
		{
			fin = n1+n2;
			System.out.println(fin);
		}
		if(loc==1)
		{
			fin = n1-n2;
			System.out.println(fin);
		}
		if(loc==2)
		{
			fin = n1*n2;
			System.out.println(fin);
		}
		if(loc==3)
		{
			fin = n1/n2;
			System.out.println((n1/n2));
		}
	}
}