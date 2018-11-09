import java.io.*;
import java.lang.*;
import java.util.Arrays;
interface picture{ float area(); void set(); float[] get();}
class rectangle implements picture
{
    float p,q;
    public rectangle(float a, float b){p=a;q=b;}
    public float area() {return p*q;}
    public void set(){p = p + 5;q = q + 7;}
    public float[] get() {float arr[] = {p,q}; return arr;}
}
class circle implements picture
{
    float r;
    public circle(float a){r=a;}
    public float area() {return 3.14f*r*r;}
    public void set(){r = r + 10;}
    public float[] get() {float arr[] = {r}; return arr;}
}

class ravi
{
    public static void main(String[] args)throws IOException
    {
        picture p[] = new picture[20];
        float a,b;
        int i,n=0;
        String s,t,u;
        char v,w;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            s = in.readLine();
            w = s.charAt(0);
            if(w=='C')
            {
                n = n+1;
                t = s.substring(1);
                a = Float.parseFloat(t);
                p[n] = new circle(a);
                System.out.println(n+" is circle of radius "+a);
            }
            if(w=='R')
            {
                n = n+1;
                i = s.indexOf(',');
                t = s.substring(1,i);
                a = Float.parseFloat(t);
                u = s.substring(1+i);
                b = Float.parseFloat(u);
                p[n] = new rectangle(a,b);
                System.out.println(n+" is rectangle of length "+a+" breadth "+b);
            }
            if(w=='A')
            {
                v = s.charAt(1);
                i = (int)v - 48;
                System.out.println(p[i].area());
            }
            if(w=='B')
            {
                v = s.charAt(1);
                i = (int)v - 48;
                p[i].set();
                p[i].area();
            }
            if(w=='D')
            {
                v = s.charAt(1);
                i = (int)v - 48;
                System.out.println(Arrays.toString(p[i].get()));
            }
        } while (1==1);
    }
}