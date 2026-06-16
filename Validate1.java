import java.awt.*;
import java.awt.event.*;

public class Validate1 extends Frame {
    TextField t1, t2;
    Label l1, l2;
    boolean flag = false;
    String val;

    public Validate1() {
        setLayout(null);
        t1 = new TextField();
        t2 = new TextField();
        l1 = new Label("See the Message");
        l2 = new Label("See the Message");
        t1.setBounds(100, 100, 200, 30);
        l1.setBounds(100, 130, 200, 30);
        t2.setBounds(100, 200, 200, 30);
        l2.setBounds(100, 230, 200, 30);

        t1.addKeyListener(new Inner1());
        t2.addKeyListener(new Inner2());

        add(t1);
        add(t2);
        add(l1);
        add(l2);
    }

    class Inner1 extends KeyAdapter {
        public void keyPressed(KeyEvent ke) {
            flag = false;
            val = t1.getText();
            int a = ke.getKeyCode();
            if (!(a >= 48 && a <= 57)) {
                flag = true;
                l1.setForeground(Color.red);
                l1.setText("Enter Numeric value ");
            }
        }

        public void keyReleased(KeyEvent ke) {
            l1.setForeground(Color.black);
            l1.setText("See Message Here");
            if (flag == true) {
                t1.setText(val);
            }
        }

    }

    class Inner2 extends KeyAdapter {
        public void keyPressed(KeyEvent ke) {
            char a = ke.getKeyChar();
            if (!(a >= 'a' && a <= 'z')) {
                ke.consume();
            }
        }

    }

    public static void main(String ar[]) {
        Validate1 v = new Validate1();
        v.setVisible(true);
        v.setTitle("Validate");
        v.setSize(600, 600);
    }
}
