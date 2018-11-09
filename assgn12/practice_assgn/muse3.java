import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class muse3 extends Applet implements MouseListener, MouseMotionListener
{
    int p,q;
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
        repaint();
    }
    public void mousePressed(MouseEvent n)
    {}
    public void mouseReleased(MouseEvent k)
    {
        p = k.getX();
        q = k.getY();
    }
    public void mouseDragged(MouseEvent p)
    {}
    public void mouseMoved(MouseEvent e)
    {}
    public void paint(Graphics f)
    {
        f.drawOval(p-10,q-10, 20, 20);
    }

}