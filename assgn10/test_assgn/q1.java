import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.applet.*;

public class q1 extends Applet
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
    public void paint(Graphics g) 
    {
        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            a = read.readLine();
        } 
        catch (Exception e) {}
        String nums[] = a.split(" ");
        x = Integer.parseInt(nums[0]);
        y = Integer.parseInt(nums[1]);
        int curr = x;
        int count = 0;
        while(curr>y)
        {
            System.out.println("Enter: "+curr);
            int hlf = (int)(curr/2);
            g.drawRect(200-hlf,200-hlf,curr,curr);
            g.drawOval(200-hlf,200-hlf,curr,curr);
            int tx,ty;
            int intermediate = (int)(curr/(Math.sqrt(2)));
            System.out.println("Intermediate: "+intermediate);
            count = count + 2;
            if(intermediate<y)
                break;
            g.drawLine(200-hlf,200,200,200-hlf);
            g.drawLine(200,200-hlf,200+hlf,200);
            g.drawLine(200+hlf,200,200,200+hlf);
            g.drawLine(200,200+hlf,200-hlf,200);
            
            int rad_sq = (int)(curr/(Math.sqrt(2)*2));
            g.drawOval(200-rad_sq,200-rad_sq,2*rad_sq,2*rad_sq);
            curr = (int)(rad_sq/Math.sqrt(2))*2;
            count = count + 2;
        }
        System.out.println("Count: "+count);
    }
}