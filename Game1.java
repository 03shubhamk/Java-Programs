import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Game1 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bs, bc;
    JLabel lb1, lb2;
    JTextField t1, t2;
    int val = 0;
    String str = "";
    Random random;
    int ran;

    public Game1() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container ct = getContentPane();
        Panel1 p1 = new Panel1();
        p1.setSize(250, 250);
        p1.setLocation(500, 200);

        ct.setLayout(null);

        t1 = new JTextField();
        t1.setSize(200, 35);
        t1.setLocation(900, 200);

        t2 = new JTextField();
        t2.setSize(200, 35);
        t2.setLocation(900, 450);

        lb1 = new JLabel();
        lb1.setSize(250, 40);
        lb1.setLocation(900, 250);

        lb2 = new JLabel();
        lb2.setSize(250, 40);
        lb2.setLocation(900, 350);

        bs = new JButton("Submit");
        bs.setSize(150, 35);
        bs.setLocation(900, 300);
        bc = new JButton("Clear");
        bc.setSize(150, 35);
        bc.setLocation(1200, 300);

        ct.add(p1);

        ct.add(lb1);
        ct.add(bs);
        ct.add(bc);
        ct.add(lb2);
        ct.add(t1);
        ct.add(t2);

        bs.addActionListener(this);
        bc.addActionListener(this);
        b1.addActionListener(Game1.this);
        b2.addActionListener(Game1.this);
        b3.addActionListener(Game1.this);
        b4.addActionListener(Game1.this);
        b5.addActionListener(Game1.this);
        b6.addActionListener(Game1.this);
        b7.addActionListener(Game1.this);
        b8.addActionListener(Game1.this);
        b9.addActionListener(Game1.this);
        b0.addActionListener(Game1.this);

        random = new Random();
        ran = random.nextInt(18);
        t1.setText(String.valueOf(ran));

    }

    class Panel1 extends JPanel {

        public Panel1() {
            GridLayout gl = new GridLayout(4, 3, 10, 10);
            setLayout(gl);

            b1 = new JButton("1");
            b2 = new JButton("2");
            b3 = new JButton("3");
            b4 = new JButton("4");
            b5 = new JButton("5");
            b6 = new JButton("6");
            b7 = new JButton("7");
            b8 = new JButton("8");
            b9 = new JButton("9");
            b0 = new JButton("0");

            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(b0);
        }

    }

    public void actionPerformed(ActionEvent ae) {

        Object ob = ae.getSource();
        if (ob.equals(b1)) {

            val = val + 1;
            if (str.isEmpty()) {
                str = "1";
            } else {
                str = str + " + 1";
            }
            lb1.setText(str);

        } else if (ob.equals(b2)) {
            val = val + 2;
            if (str.isEmpty()) {
                str = "2";
            } else {
                str = str + " + 2";
            }
            lb1.setText(str);

        } else if (ob.equals(b3)) {
            val = val + 3;
            if (str.isEmpty()) {
                str = "3";
            } else {
                str = str + " + 3";
            }
            lb1.setText(str);
        } else if (ob.equals(b4)) {
            val = val + 4;
            if (str.isEmpty()) {
                str = "4";
            } else {
                str = str + " + 4";
            }
            lb1.setText(str);

        } else if (ob.equals(b5)) {

            val = val + 5;
            if (str.isEmpty()) {
                str = "5";
            } else {
                str = str + " + 5";
            }
            lb1.setText(str);

        } else if (ob.equals(b6)) {
            val = val + 6;
            if (str.isEmpty()) {
                str = "6";
            } else {
                str = str + " + 6";
            }
            lb1.setText(str);

        } else if (ob.equals(b7)) {
            val = val + 7;
            if (str.isEmpty()) {
                str = "7";
            } else {
                str = str + " + 7";
            }
            lb1.setText(str);

        } else if (ob.equals(b8)) {

            val = val + 8;
            if (str.isEmpty()) {
                str = "8";
            } else {
                str = str + " + 8";
            }
            lb1.setText(str);

        } else if (ob.equals(b9)) {
            val = val + 9;
            if (str.isEmpty()) {
                str = "9";
            } else {
                str = str + " + 9";
            }
            lb1.setText(str);

        } else if (ob.equals(b0)) {
            val = val + 0;
            if (str.isEmpty()) {
                str = "0";
            } else {
                str = str + " + 0";
            }
            lb1.setText(str);

        } else if (ob.equals(bs)) {
            lb2.setText(val + " ");

            if (ran == val) {

                t2.setText("correct");

            } else {
                t2.setText("wrong");

            }

        } else if (ob.equals(bc)) {
            lb1.setText(null);
            lb2.setText("");
            t1.setText("");
            t2.setText("");

            random = new Random();
            ran = random.nextInt(18);
            t1.setText(String.valueOf(ran));

            str = "";
            val = 0;

        }

    }

    public static void main(String ar[]) {

        Game1 g = new Game1();
        g.setVisible(true);
    }
}