import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class LineClick extends Frame implements MouseListener {
    int x, y;

    public LineClick() {

        this.addMouseListener(this);

    }

    public static void main(String ar[]) {
        LineClick c = new LineClick();
        c.setVisible(true);
        c.setSize(800, 800);
    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
        // int x = me.getX();
        // int y = me.getY();
        // repaint();
        // lb.setText(x + " x " + y);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        Random random = new Random();

        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        Color randomColor = new Color(red, green, blue);

        Graphics g = getGraphics();

        g.setColor(randomColor);

        g.drawLine(x, y, 400, 400);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent me) {
        // TODO Auto-generated method stub

    }

}