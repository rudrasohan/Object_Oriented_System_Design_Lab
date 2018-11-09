import java.io.*;

class str
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));	
		/*Q1
		String a,b="";
		System.out.print("Enter a string");
		a = read.readLine();
		b = a.substring(0,2) + a.substring(3);
		System.out.println(b);
		*/

		/*Q2
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = a.substring(0,2) +"t"+ a.substring(2);
		System.out.println(b);
		*/

		/*Q3
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = a.charAt(0) + a;
		System.out.println(b);
		*/

		/*Q4
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = "" + a.charAt(1) + (char)a.charAt(0) + a.substring(2);
		System.out.println(b);
		*/

		/*Q5
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = a.substring(3) + a.substring(0,3);
		System.out.println(b);
		*/

		/*Q6
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = a.substring(0,3) + a.charAt(4)+ a.charAt(3)+ a.substring(5);
		System.out.println(b);
		*/

		/*Q7
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = a.substring(0,4) + a.charAt(10) + a.substring(5,10) + a.charAt(4) + a.substring(10);
		System.out.println(b);
		*/

		/*Q8
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = a.substring(a.indexOf('x')+1);
		System.out.println(b);
		*/

		/*Q9
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		b = a.substring(0,a.indexOf('x')) + "y" + a.substring(a.indexOf('x')+1);
		System.out.println(b);
		*/

		/*Q10
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		b = a.substring(start+1,end+1);
		System.out.println(b);
		*/

		/*Q11
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		b = a.substring(0,start) + a.substring(start+1,end+1) + a.substring(end+2);
		System.out.println(b);
		*/

		/*Q12
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		b = a.substring(0,end+1);
		System.out.println(b);
		*/

		/*Q13
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		System.out.println(end+1);
		*/

		/*Q14
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		b = a.substring(0,end+1) + "y" + a.substring(end+2);
		System.out.println(b);
		*/

		/*Q15
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		b = a.substring(0,start) + "xx" + a.substring(end+2);
		System.out.println(b);
		*/

		/*Q16
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		b = a.substring(0,start) + "x" + a.substring(0,start) + "x" + a.substring(end+2);
		System.out.println(b);
		*/

		/*Q17
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine();
		int start = a.indexOf('x');
		int end = start + a.substring(start+1).indexOf('x');
		b = a.substring(0,start-1) + a.charAt(start+1) + "x" + a.charAt(start-1)+ a.substring(start+2);
		System.out.println(b);
		*/

		/*Q18
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int gap = a.indexOf(' ');
		b = a.substring(gap+1);
		System.out.println(b);
		*/

		/*Q19
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int gap = a.indexOf(' ');
		b = a.substring(0,gap);
		System.out.println(b);
		*/

		/*20
		String a,b="";
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int gap = a.indexOf(' ');
		b = a.substring(gap+1) + a.substring(0,gap);
		System.out.println(b);
		*/

		/*Q21
		String a,w1="",w2="",b;
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int gap = a.indexOf(' ');
		w1 = a.substring(0,gap);
		w2 = a.substring(gap+1);
		b =  w2.charAt(gap+1) + w1.substring(1) + " " +  w1.charAt(0) + w2.substring(1);
		System.out.println(b);
		*/

		/*Q22
		String a,w1="",w2="",b;
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int gap = a.indexOf(' ');
		w1 = a.substring(0,gap);
		w2 = a.substring(gap+1);
		b = w1.substring(0,gap-1) + w2.charAt(w2.indexOf(' ')-1) + " " + w2.substring(0,w2.indexOf(' ')-1) + w1.charAt(gap-1) + w2.substring(w2.indexOf(' '));
		System.out.println(b);
		*/

		/*Q23
		String a,w1="",w2="",w3="",b;
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int gap1 = a.indexOf(' ');
		w1 = a.substring(0,gap1);
		w2 = a.substring(gap1+1);
		int gap2 = w2.indexOf(' ');
		w3 = w2.substring(0,gap2);
		System.out.println(w3.indexOf('a') + gap1 + 1);
		*/

		/*Q24
		String a,w1="",w2="",w3="",b;
		System.out.print("Enter a string: ");
		a = read.readLine().trim();
		int gap1 = a.indexOf(' ');
		w1 = a.substring(0,gap1);
		w2 = a.substring(gap1+1);
		int gap2 = w2.indexOf(' ');
		w3 = w2.substring(0,gap2);
		System.out.println(w3.indexOf(w1.charAt(0)));
		*/

		/*Q25
		String a,b,c="";
		int comp = 0;
		System.out.print("Enter two strings: ");
		a = read.readLine().trim();
		b = read.readLine().trim();
		comp = a.compareTo(b);
		if (comp > 0)
			c = a +" "+ b;
		else 
			c = b +" "+ a;
		System.out.println(c);
		*/

		/*Q26
		String a,b,c="";
		int comp = 0;
		System.out.print("Enter two strings: ");
		a = read.readLine().trim();
		b = read.readLine().trim();
		comp = a.compareTo(b);
		if (comp > 0)
			c = a;
		else if (comp < 0)
			c = b;
		else
			c = a + " " + b;
		System.out.println(c);
		*/

		/*Q27
		String a,b,c;
		int comp12 = 0, comp23 = 0, comp31 = 0;
		System.out.print("Enter three strings: ");
		a = read.readLine().trim();
		b = read.readLine().trim();
		c = read.readLine().trim();
		comp12 = a.compareTo(b);
		comp23 = b.compareTo(c);
		comp31 = c.compareTo(a);
		if(comp12>0 && comp31<0)
			System.out.println("1");
		else if(comp12<0 && comp23>0)
			System.out.println("2");
		else if(comp23<0 && comp31>0)
			System.out.println("3");
		else if(comp12==0 && comp23==0)
			System.out.println("0");
		else if(comp12==0 && comp23>0)
			System.out.println("-1");
		else if(comp23==0 && comp31>0)
			System.out.println("-2");
		else 
			System.out.println("-3");
		*/

		/*Q28
		String a;
		int x;
		System.out.println("Enter a string");
		a = read.readLine().trim();
		x = a.indexOf('x');
		System.out.println(a.charAt(x+1));
		*/

		/*Q29
		String a;
		int x;
		System.out.println("Enter a string");
		a = read.readLine().trim();
		x = a.indexOf(a.charAt(8));
		System.out.println(x);
		*/

		/*Q30
		String a;
		int x;
		System.out.println("Enter a string");
		a = read.readLine().trim();
		x = a.substring(1).indexOf(a.charAt(0));
		System.out.println(x+1);
		*/

		/*Q31
		String a,b,c="";
		int x;
		System.out.println("Enter a string");
		a = read.readLine().trim();
		b = a.substring(a.indexOf('x')+1);
		x = b.indexOf('y');
		c = a.substring(0,a.indexOf('x')+1) + b.substring(0,x) + b.substring(x+1);
		System.out.println(c);
		*/

		/*Q32
		String a,c="";
		int pos;
		System.out.println("Enter a string");
		a = read.readLine().trim();
		pos = a.indexOf(a.charAt(a.indexOf('x')-1));
		c = a.substring(0,pos-1) + a.charAt(pos+1) + "" + a.charAt(pos) + "" + a.charAt(pos-1)+ a.substring(pos+2);
		System.out.println(c);
		*/

		String a,b="",c="";
		int pos_r,pos_l;
		System.out.println("Enter a string");
		a = read.readLine().trim();
		b = a.substring(a.indexOf('x')+1);
		pos_r = a.indexOf('x')+b.indexOf('x')+2;
		pos_l = a.indexOf('x')-1;
		//c = a.substring(0,pos-1) + a.charAt(pos+1) + "" + a.charAt(pos) + "" + a.charAt(pos-1)+ a.substring(pos+2);
		System.out.println(pos_l+" "+pos_r);
	}
}