import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CursorClick extends Frame implements MouseListener {
    Label lb;
    int x, y;

    public CursorClick() {
        setLayout(new FlowLayout());
        Font f = new Font("Arial", Font.BOLD, 19);

        lb = new Label("See Axis Here");
        add(lb);
        lb.setFont(f);

        this.addMouseListener(this);

    }

    public static void main(String ar[]) {
        CursorClick c = new CursorClick();
        c.setVisible(true);
        c.setSize(900, 900);
    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
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
        lb.setText(x + " x " + y);
        g.fillOval(x, y, 100, 100);
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