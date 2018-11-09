import java.io.*;

class point
{
	private float x,y;
	public point(float a, float b)
	{
		x=a;
		y=b;
	}
	public point()
	{}
	public void print()
	{
		System.out.println("("+x+","+y+")");
	}
	public void abc()
	{
		x = 2*x;
		y = 3*y;
	}
	public static point pqr(point a)
	{
		point t;
		t = new point(2*a.x,3*a.y);
		return t;
	}
	public void ghi(point a)
	{
		x = 2*a.x;
		y = 3*a.y;
	}
	public float getx()
	{
		return x;
	}
	////////////////////////////////////////////////////
	public void fa()
	{
		x = x + y;
		y = 2*y;
	}
	public void fb()
	{
		y = x+y;
		x = 2*x;
	}
	public void fc()
	{
		point temp = new point();
		temp.x = x+y;
		temp.y = x*y;
		x = temp.x;
		y = temp.y;
	}
	public point fd()
	{
		point q = new point();
		q.x = x+y;
		q.y = x*y;
		return q;
	}
	public point fe()
	{
		return new point(x+y,x*y);
	}
	public point ga()
	{
		return new point(x+y,2*y);
	} 
	public static point gb(point a)
	{
		return new point(a.x+a.y,2*a.y);
	} 
	public static point kb(point a)
	{
		return a.ga();
	}
	public void gc(point a)
	{
		x = a.x+a.y;
		y = 2*a.y;
	} 
	public void kc(point a)
	{
		a.ga();
		x = a.x;
		y = a.y;
	}
	public void gd(int k)
	{
		y = 2*y;
		x = x + k;
	}
	public point ha()
	{
		return this.ga();
	}
	public static point hb(point a)
	{
		return a.ga();
	}
	public void hc(point a)
	{
		a = point.gb(a);
		x = a.x;
		y = a.y;
	}
	public static abc faa(point p)
	{
		return new abc(p.x + p.y,p.x * p.y,p.x - p.y);	
	}
	public static abc kaa(point p)
	{
		return abc.fab(p);
	}
	public void fad(abc q)
	{
		point temp = q.fac();
		x = temp.x;
		y = temp.y;
	}
	public void kad(abc q)
	{
		point temp = q.fac();
		x = temp.x;
		y = temp.y;
	}
}

class abc
{
	private float a,b,c;
	public abc(float p,float q,float r)
	{
		a = p;
		b = q;
		c = r;
	}
	public abc()
	{}
	public void print()
	{
		System.out.println("("+a+","+b+","+c+")");
	}
	////////////////////////
	public static abc fab(point p)
	{
		return point.faa(p);	
	}
	public static abc kab(point p)
	{
		return point.faa(p);
	}
	public point fac()
	{
		return new point(a+b,b*c);
	}
	public point kac()
	{
		point temp = new point();
		temp.fad(new abc(a,b,c));
		return temp;
	}

}


//////////////////////////////
class xyz
{
	private float x,y;
	public xyz(float a, float b)
	{
		x = a;
		y = b;
	}
	public pt()
	{
		System.out.println("("+x+","+y+")");
	}
	public point f()
	{
		point temp = new point()
		temp.x = x + y;
		temp.y = 2*x;
		x = temp.x;
		y = temp.y;
		temp.x = temp.x*3 + 1;
		temp.y = (x - temp.y/2)*6 + 3;
		return temp; 
	}
	public point g()
	{
		
	}
}
//////////////////////////////

class hari
{
	public static void main(String args[])
	{
		///////////////////////Already given////////////
		/*
		point a,b,c;
		float t;
		abc k;
		a = new point(2,4);
		a.print();
		a.abc();
		a.print();
		a = new point(2,4);
		b = point.pqr(a);
		b.print();
		a = new point(2,4);
		c = new point();
		c.ghi(a);
		c.print();
		t = a.getx();
		System.out.println(t);
		k = new abc(2,4,9);
		k.print();
		*/
		/////////////////////////////Adding my code//////////////////////
		System.out.println("////////////////////////////////////////////////");
		/*
		point p = new point(20,4);
		p.print();
		p.fa();
		p.print();
		p = new point(20,4);
		p.print();
		p.fb();
		p.print();
		p = new point(20,4);
		p.print();
		p.fc();
		p.print();
		p = new point(20,4);
		point q = p.fd();
		System.out.print("OLD: ");
		p.print();
		System.out.print("NEW: ");
		q.print();
		p = new point(20,4);
		q = p.fe();
		q.print();
		p = new point(2,4);
		q = p.ga();
		q.print();
		p = new point(2,4);
		q = point.gb(p);
		q.print();
		p = new point(2,4);
		q = point.kb(p);
		q.print();
		p = new point(2,4);
		q.gc(p);
		q.print();
		p = new point(2,4);
		q.gc(p);
		q.print();
		p = new point(5,7);
		p.gd(12);
		p.print();
		System.out.println("////////////////////////////////////////////////");
		point a = new point(2,4);
		point c = a.ha();
		a.print();
		c.print();
		c = point.hb(a);
		a.print();
		c.print();
		c.hc(a);
		a.print();
		c.print();
		System.out.println("////////////////////////////////////////////////");
		abc qr = point.faa(a);
		qr.print();
		qr = abc.fab(a);
		qr.print();
		qr = point.kaa(a);
		qr.print();
		qr = abc.kab(a);
		qr.print();
		qr = new abc(1,2,3);
		a = qr.fac();
		a.print();
		point t = new point();
		t.fad(qr);
		t.print();
		t = qr.kac();
		t.print();
		t.kad(qr);
		t.print();
		*/
		xyz a,b;
		
	}
}