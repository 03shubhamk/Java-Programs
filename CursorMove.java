import java.awt.*;
import java.awt.event.*;

public class CursorMove extends Frame implements MouseMotionListener {
    Label lb;
    int x, y;

    public CursorMove() {
        setLayout(new FlowLayout());
        Font f = new Font("Arial", Font.BOLD, 19);

        lb = new Label("See Axis Here");
        add(lb);
        lb.setFont(f);

        this.addMouseMotionListener(this);

    }

    public void paint(Graphics g) {
        g.drawOval(x, y, 100, 100);
    }

    public static void main(String ar[]) {
        CursorMove c = new CursorMove();
        c.setVisible(true);
        c.setSize(900, 900);
    }

    @Override
    public void mouseDragged(MouseEvent me) {

    }

    @Override
    public void mouseMoved(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        repaint();
        lb.setText(x + " x " + y);
    }

}
