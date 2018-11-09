import java.io.*;
import java.lang.*;
import java.util.Arrays;

class ravi
{
    public static void main(String[] args)throws IOException
    {
        float p[] = new float[20];
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
                p[n] = 3.14f*a*a;
                System.out.println(n+" is area of radius "+a);
            }
            if(w=='R')
            {
                n = n+1;
                i = s.indexOf(',');
                t = s.substring(1,i);
                a = Float.parseFloat(t);
                u = s.substring(1+i);
                b = Float.parseFloat(u);
                p[n] = a*b;
                System.out.println(n+" is rectangle of length "+a+" breadth "+b);
            }
            if(w=='A')
            {
                v = s.charAt(1);
                i = (int)v - 48;
                System.out.println(p[i]);
            }
        } while (1==1);
    }
}