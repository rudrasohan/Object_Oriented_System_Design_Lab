import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class muse9 extends Applet implements MouseListener, MouseMotionListener
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
        
    }
    public void mouseDragged(MouseEvent p)
    {
        p2 = p.getX();
        q2 = p.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent e)
    {}
    public void paint(Graphics f)
    {
        f.drawRect(p1,q1,p2-p1,q2-q1);
    }

}