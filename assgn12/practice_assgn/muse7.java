import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class muse7 extends Applet implements MouseListener, MouseMotionListener
{
    int p1,q1,p2,q2;
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent k)
    {
        //p = k.getX();
        //q = k.getY();
    }
    public void mouseEntered(MouseEvent k)
    {
        //p = k.getX();
        //q = k.getY();
    }
    public void mouseExited(MouseEvent m)
    {
        
    }
    public void mousePressed(MouseEvent n)
    {
        p1 = n.getX();
        q1 = n.getY();
    }
    public void mouseReleased(MouseEvent k)
    {
        p2 = k.getX();
        q2 = k.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent p)
    {
       
    }
    public void mouseMoved(MouseEvent e)
    {}
    public void paint(Graphics f)
    {
        f.drawOval((p1-(p2-p1))-5,(q1-(q2-q1))-5,10,10);
    }

}