import java.io.*;

class vector
{
	float i,j,k;
	public vector(float a,float b,float c)
	{
		i = a;j = b;k = c;
	}
	public vector()
	{}

	public float dot(vector v)
	{
		return i*v.i+j*v.j+k*v.k;
	}
	public float mag()
	{
		return (float)Math.sqrt(this.dot(this));
	}
	public void cross(vector w, vector h)
	{
		i = w.j*h.k - h.j*w.k; j = w.k*h.i - w.i*h.k; k = w.i*h.j - w.j*h.i;  
	}
	public void vec_print()
	{
		System.out.println(i+"i+"+j+"j+"+k+"k");
	}
	public void divide(float c)
	{
		i = i/c;j = j/c;k = k/c;
	}
	public void unit()
	{
		this.divide(this.mag());
	}
	public void direction(point p, point q)
	{
		vector temp = new vector();
		temp = point.dir(p,q);
		i = temp.i;j = temp.j;k = temp.k;
	}
}

class point
{
	private float x,y,z;
	public point(float a, float b, float c)
	{
		x = a;y = b;z = c;

	}
	public point()
	{}
	public void print()
	{
		System.out.println("("+x+","+y+","+z+")");
	}
	public static point mid(vector q, vector r)
	{
		point p = new point();
		p.x = (q.i+r.i)/2;p.y = (q.j+r.j)/2;p.z = (q.k+r.k)/2;
		return p;
	}
	public static vector dir(point p, point q)
	{
		vector v = new vector();
		v.i = (q.x-p.x);v.j = (q.y-p.y);v.k = (q.z-p.z);
		return v;
	}
	public static float area(point p,point q,point r)
	{
		vector a = new vector();
		vector b = new vector();
		vector cros = new vector();
		a = dir(p,q);
		b = dir(p,r);
		cros.cross(a,b);
		return cros.mag()/2;
	}

}

class vec_math
{
	public static void main(String[] args) 
	{
		vector a = new vector(2,3,1);
		vector b = new vector(5,2,3);
		float dot,mag;
		dot = a.dot(b);
		System.out.println("Dot= "+dot);
		mag = a.mag();	
		System.out.println("Mag= "+mag);
		vector v = new vector();
		v.cross(a,b);
		v.vec_print();	
		v = new vector(4,3,12);
		v.unit();
		v.vec_print();
		point p,q;
		p = new point(2,3,1);
		q = new point(6,2,8);
		v = point.dir(p,q);
		v.vec_print();
		a.direction(p,q);
		a.vec_print();
		p = new point(3,4,5);
		q = new point(7,3,6);
		point r = new point(6,2,3);
		System.out.println("AREA = "+ point.area(p,q,r));
	}
}