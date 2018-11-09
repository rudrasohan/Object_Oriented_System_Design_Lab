import java.io.*;

class point
{
	public float x,y;
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
	public void mid(point q)
	{
		x = (x+q.x)/2;y = (y+q.y)/2;
	}
	public void intersection(line g, line h)
	{
		x = (g.b*h.c - h.b*g.c)/(g.a*h.b - h.a*g.b);
		y = (g.c*h.a - h.c*g.a)/(g.a*h.b - h.a*g.b);
	}
	public void intersection(point a, point b, point c,point d)
	{
		line x = new line();
		line y = new line();
		x.eq(a,b);
		y.eq(c,d);
		this.intersection(x,y);
	}
}

class line
{
	float a,b,c;
	public line(float x, float y, float z)
	{
		a = x;b = y;c = z;

	}
	public line()
	{}
	public void line()
	{
		System.out.println(a+"x+"+b+"y+"+c+"z = 0");
	}
	public void eq(point p, point q)
	{
		a = (q.y - p.y)/(q.x - p.x);
		b = -1; c = p.y - a*p.x;
	}

	public static float distance(point p ,line l)
	{
		return (float)(Math.abs(l.a*p.x+l.b*p.y+l.c)/Math.sqrt(l.a*l.a + l.b*l.b));
	}

}

class circle
{
	point c;
	float r;
	public circle(point p, float r1)
	{
		c = p;
		r = r1;
	}
	public circle()
	{}
	public void print()
	{
		System.out.println("x^2+y^2+"+2*c.x+"x+"+2*c.y+"y+"+(c.x*c.x + c.y*c.y - r*r)+"=0");
	}
	public void pt()
	{
		System.out.print("CENTER=");
		c.print();
		System.out.println("RADIUS="+r);
	}
	public void form(float g, float h, float k)
	{
		//c.x = -g/2;
		//c.y = -h/2;
		c = new point(-g/2,-h/2);
		r = (float)Math.sqrt((g*g + h*h)/4 - k);
	}
	public float chord(line b)
	{
		float dist = line.distance(c,b);
		return 2*(float)Math.sqrt(r*r-dist*dist);

	}
	public point intersection(float b)
	{
		float d = r*r - (c.x-b)*(c.x-b);
		if (d > 0)
		{
			return new point((float)(Math.sqrt(d) + c.y),(float)(-Math.sqrt(d) + c.y));
		}
		else 
		{
			System.out.println("NO SOLUTION");
			return new point(-999,-999);
		}
	}
}

class line_math
{
	public static void main(String[] args) 
	{
		/*
		line p,q;
		p = new line(2,3,-26);
		q = new line(4,7,-54);
		point a = new point();
		a.intersection(p,q);
		a.print();
		point b,c,d;
		a = new point(4,6);
		b = new point(-2,10);
		c = new point(10,2);
		d = new point(3,6);
		point in = new point();
		in.intersection(a,b,c,d);
		in.print();
		a = new point(2,3);
		p = new line(8,6,-12);
		System.out.println("Dist= "+line.distance(a,p));
		*/
		circle cr = new circle();
		//cr.print();
		//cr = new circle();
		cr.form(-4,-6,-36);
		cr.print();
		cr.pt();
		point cent = new point(1,2);
		circle c1 = new circle(cent,5);
		line l1 = new line(5,12,10); 
		System.out.println("CHORD = "+c1.chord(l1));
		cent = new point(7,2);
		c1 = new circle(cent,5);
		point p = new point();
		p = c1.intersection(10);
		p.print();
	}
}