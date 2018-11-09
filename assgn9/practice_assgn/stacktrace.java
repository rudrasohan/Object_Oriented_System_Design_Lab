import java.io.*;
import java.util.Stack;
import java.lang.*;

class stacktrace
{
	public static void main(String[] args)throws IOException 
	{
		Stack<String> s = new Stack<String>();
		Stack<String> t = new Stack<String>();
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String a,b,c;
		char p,q;
		int i,j,size=0;
		do
		{
			a = read.readLine();
			p = a.charAt(0);
			if (p=='A') 
			{
				b = a.substring(1);
				s.push(b);
				size++;
			}
			if (p=='B') 
			{
				s.pop();
				size--;
			}
			if (p=='C')
			{
				b = s.pop();
				System.out.println(b);
				s.push(b);
			}
			if (p=='D')
			{
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					t.push(b);
				}
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					System.out.print(b+" ");
					s.push(b);	
				}
				System.out.println();
			}
			if(p=='E')
			{
				q = a.charAt(1);
				c = a.substring(2);
				j = (int)q - 48;
				j = size + 2 - j;
				size++;
				for (i=1; i<=j-1; i++) 
				{
					b = s.pop();
					t.push(b);
				}
				s.push(c);
				for (i=1; i<=j-1; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}
			if(p=='F')
			{
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					System.out.print(b+" ");
					t.push(b);
				}
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
				System.out.println();
			}
			if(p=='G')
			{
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					
					t.push(b);
				}
				b=t.pop();
				System.out.println(b+" ");
				s.push(b);
				for (i=2; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}
			if(p=='H')
			{
				int x = (int)(a.charAt(1)) - 48;
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					if(i==(size-x+1))
					{
						System.out.print(b+" ");
					}
					t.push(b);
				}
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
				System.out.println();

			}
			if(p=='I')
			{
				String x = a.substring(1);
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					t.push(b);
				}
				s.push(x);
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
				size++;
			}
			if(p=='J')
			{
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					t.push(b);
				}
				t.pop();
				size--;
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}
			if(p=='K')
			{
				String max = "";
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					if(b.compareTo(max)>0)
						max=b;
					t.push(b);
				}
				System.out.println(max);
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}
			if(p=='L')
			{
				String max = "";
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					if(b.compareTo(max)>0)
						max=b;
					t.push(b);
				}
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					if(b.equals(max))
						continue;
					s.push(b);	
				}
				size--;
			}
			if(p=='M')
			{
				String x = a.substring(1);
				int flag = 0;
				for (i=1; i<=size; i++) 
				{
					b = s.pop();
					//System.out.print(b);
					if(x.compareTo(b)>0 && flag==0)
					{
						//System.out.print("TRUE\n");
						t.push(x);
						flag=1;
					}
					t.push(b);
				}
				if(flag==0)
				{
					t.push(x);
				}
				size++;
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}
			if(p=='N')
			{
				q = a.charAt(1);
				c = a.substring(2);
				j = (int)q - 48;
				for(i=1;i<=size;i++)
				{
					b = s.pop();
					if((size-j+1)==i)
					{
						t.push(c);
						continue;
					}
					t.push(b); 
				}
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}

			if(p=='Q')
			{
				String x = a.substring(1);
				int flag = 0;
				 for(i=1;i<=size;i++)
				{
					b = s.pop();
					if(b.equals(x))
					{
						System.out.println("PRESENT");
						flag = 1;
					}
					t.push(b); 
				}
				if(flag==0)
					System.out.println("NOT_PRESENT");
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}
			if(p=='R')
			{
				String x = a.substring(1);
				int flag = 0;
				 for(i=1;i<=size;i++)
				{
					b = s.pop();
					if(b.equals(x))
					{
						flag = 1;
						continue;
					}
					t.push(b); 
				}
				if (flag == 1) 
				{
					size--;	
				}
				for (i=1; i<=size; i++) 
				{
					b=t.pop();
					s.push(b);	
				}
			}
			if(p=='S')
			{	int t_size = size;
				while(t_size>0)
				{
					
					for(i=1;i<=t_size;i++)
					{
						b = s.pop();
						t.push(b); 
					}
					String temp = t.pop();
					t_size--;
					for(i=1;i<=t_size;i++)
					{
						b = t.pop();
						s.push(b);
					}
					t.push(temp);
				}
				for(i=1;i<=size;i++)
					{
						b = t.pop();
						s.push(b); 
					}
			}
			if(p == 'Y')
			{
				=='S')
			{	int t_size = size;
				while(t_size>0)
				{
					
					for(i=1;i<=t_size;i++)
					{
						b = s.pop();
						t.push(b); 
					}
					String temp = t.pop();
					t_size--;
					for(i=1;i<=t_size;i++)
					{
						b = t.pop();
						s.push(b);
					}
					t.push(temp);
				}
				for(i=1;i<=size;i++)
					{
						b = t.pop();
						s.push(b); 
					}
			}

		}while(1==1);

	}
}