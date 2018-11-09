import java.io.*;

class str
{
	public static int palindrome(String s)
	{
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
		return flag;
	}
	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));	
		String a,max_st="";
		int pos=0;
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int i=0,j=0,len=0,max_len=0;
		len = a.length();
		for(i=0;i<len;i++)
		{
			//System.out.println(i);
			for(j = len;j>=i;j--)
			{
				String temp = "";
				temp = a.substring(i,j);
				//System.out.println(temp);
				int f = str.palindrome(temp);
				if(f == 1)
				{
					if (temp.length() > max_len)
					{
						max_len = temp.length();
						max_st = temp;
					}
				}
			}
		}
		System.out.println("String= "+max_st+", len= "+max_len);
		
	}

}