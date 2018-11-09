class n
{
	int d;
	n p;
}

class k
{
	public static void main(String[] args) {
		n a,b,c;
		a = new n();b = new n();c = new n();
		a.d=12;b.d=17;c.d=29;a.p = b;b.p = c; c.p = null;
		n i = a;
		while (i != null)
		{
			System.out.println(i.d);
			i = i.p;
		}
	}
}