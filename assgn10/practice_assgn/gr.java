import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.applet.*;

public class gr extends Applet
{
    int x = 70;
    int y = 70;
    int r = 40;
    int count = 0;
    String a = "";
    public void init()
    {
        setBackground(Color.white);
        setForeground(Color.red);
    }
    /*
    public void paint(Graphics g) 
    {
        g.drawRect(10,100,50,70);
        g.fillOval(10,100,50,70);
        g.drawString("Kapil", x,7);
        g.drawLine(100,20,400,70);
        g.setColor(Color.blue);
        g.drawOval(100,200,50,10);
    }*/
    /*
    public void paint(Graphics g)
    {
        do 
        {
            try {
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                a = read.readLine();
            } 
            catch (Exception e) {}
            x = Integer.parseInt(a);
            g.drawLine(x,100,x+50,200);
        } while (1==1);
    }*/
    /*
    public void paint(Graphics g)
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        x = Integer.parseInt(a);
        g.drawRect(200,200,x,x);
    }while(1==1);
    }
    */
    /*
    public void paint(Graphics g)
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        x = Integer.parseInt(a);
        g.drawRect(200-x,200-x,x,x);
    }while(1==1);
    }
    */
    /*
    public void paint(Graphics g)
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        x = Integer.parseInt(a);
        g.drawRect(200-x/2,200-x/2,x,x);
    }while(1==1);
    }*/
    /*
    public void paint(Graphics g)
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        String nums[] = a.split(" ");
        x = Integer.parseInt(nums[0]);
        y = Integer.parseInt(nums[1]);
        g.drawRect(x,y,100,100);
    }while(1==1);
    }*/
    /*
    public void paint(Graphics g)
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        String types[] = a.split(" ");
        if(types[0].equals("square"))
        {
            x = Integer.parseInt(types[1]);
            g.drawRect(100-x/2,100-x/2,x,x);
        }
        else if(types[0].equals("rectangle"))
        {
            x = Integer.parseInt(types[1]);
            y = Integer.parseInt(types[2]);
            g.drawRect(100,100,x,y);
        }
        else if(types[0].equals("circle"))
        {
            x = Integer.parseInt(types[1]);
            y = Integer.parseInt(types[2]);
            int r = Integer.parseInt(types[3]);
            g.drawOval(x-r,y-r, 2*r, 2*r);
        }
        else
        {
            g.drawString("ERROR",10,10);
        }
    }while(1==1);
    }*/
    /*
    public void paint(Graphics g) 
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        if(a.equals("ram"))
        {
            g.setColor(Color.red);
        }
        else if(a.equals("gagan"))
        {
            g.setColor(Color.green);
        }
        else if(a.equals("bimu"))
        {
            g.setColor(Color.blue);
        }
        g.fillOval(60,60,80,80);
        }while(1==1);
    }
    */
    /*
    public void paint(Graphics g) 
    {
        int r = 40;
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        if(a.equals("ram"))
        {
            g.setColor(Color.red);
        }
        else if(a.equals("gagan"))
        {
            g.setColor(Color.green);
        }
        else if(a.equals("bimu"))
        {
            g.setColor(Color.blue);
        }
        g.fillOval(100-r,100-r, 2*r, 2*r);
        r = r + 5;
        }while(1==1);
    }
    */
    /*
    public void paint(Graphics g) 
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        if(a.equals("ram"))
        {
            g.setColor(Color.red);
        }
        else if(a.equals("gagan"))
        {
            g.setColor(Color.green);
        }
        else if(a.equals("bimu"))
        {
            g.setColor(Color.blue);
        }
        else if(a.equals("hari"))
        {
            x=0;
        }
        else
        {
            continue;
        }
        g.fillOval(100-r,100-r, 2*r, 2*r);
        r = r + 5;
        }while(x>0);repaint();
        x = 70;
        r = r - 5;

    }*/
    /*
    public void paint(Graphics g) 
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        if(a.equals("ram"))
        {
            g.setColor(Color.red);
        }
        else if(a.equals("gagan"))
        {
            g.setColor(Color.green);
        }
        else if(a.equals("bimu"))
        {
            g.setColor(Color.blue);
        }
        else if(a.equals("hari"))
        {
            x=0;
        }
        else
        {
            continue;
        }
        g.fillOval(100-r,100-r, 2*r, 2*r);
        r = r + 5;
        }while(x>0);repaint();
        x = 70;
        r = r - 10;

    }*/
    /*
    public void paint(Graphics g) 
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        if(a.equals("ram"))
        {
            g.setColor(Color.red);
        }
        else if(a.equals("gagan"))
        {
            g.setColor(Color.green);
        }
        else if(a.equals("bimu"))
        {
            g.setColor(Color.blue);
        }
        else if(a.equals("hari"))
        {
            x=0;
        }
        else
        {
            continue;
        }
        g.fillOval(100-r,100-r, 2*r, 2*r);
        r = r + 5;
        }while(x>0);repaint();
        x = 70;
        r = 50;
    }*/
    public void paint(Graphics g) 
    {
        do
        {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        if(a.equals("ram"))
        {
            g.setColor(Color.red);
        }
        else if(a.equals("gagan"))
        {
            g.setColor(Color.green);
        }
        else if(a.equals("bimu"))
        {
            g.setColor(Color.blue);
        }
        else if(a.equals("hari"))
        {
            x=0;
        }
        else
        {
            continue;
        }
        g.fillOval(100-r,100-r, 2*r, 2*r);
        r = r + 5;
        }while(x>0);repaint();
        x = 70;
        count++;
        r = 50 + count*10;
    }
}