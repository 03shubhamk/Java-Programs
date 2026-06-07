import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ArithGame extends JFrame {
    static JTabbedPane tb;

    public ArithGame() {
        tb = new JTabbedPane();

        Pan1 pan1 = new Pan1();
        Pan2 pan2 = new Pan2();
        Pan3 pan3 = new Pan3();
        Pan4 pan4 = new Pan4();

        JPanel p1 = pan1.pan1();
        JPanel p2 = pan2.pan2();
        JPanel p3 = pan3.pan3();
        JPanel p4 = pan4.pan4();

        tb.addTab("Addition", p1);
        tb.addTab("Subtraction", p2);
        tb.addTab("Multiplication", p3);
        tb.addTab("Division", p4);
    }

    public static void main(String ar[]) {
        ArithGame a = new ArithGame();
        a.setVisible(true);
        a.setSize(1000, 700);
        a.add(tb);
        a.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}

class Pan1 implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JTextField tf;
    JLabel l1, l2;
    String str;
    int val, no;

    public JPanel pan1() {
        JPanel pan = new JPanel();
        pan.setLayout(null);

        Font f = new Font("Arial", Font.BOLD, 18);

        tf = new JTextField();

        l1 = new JLabel("Game Result");
        l2 = new JLabel("Inputs");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");

        b11 = new JButton("Clear");
        b12 = new JButton("Submit");

        l1.setBounds(100, 250, 200, 30);
        l1.setFont(f);

        tf.setBounds(100, 300, 200, 30);
        tf.setFont(f);
        tf.setEditable(false);

        l2.setBounds(100, 350, 200, 30);
        l2.setFont(f);

        b11.setBounds(400, 280, 100, 30);
        b11.setFont(f);

        b12.setBounds(400, 320, 100, 30);
        b12.setFont(f);

        b1.setBounds(600, 200, 60, 50);
        b2.setBounds(670, 200, 60, 50);
        b3.setBounds(740, 200, 60, 50);
        b4.setBounds(600, 260, 60, 50);
        b5.setBounds(670, 260, 60, 50);
        b6.setBounds(740, 260, 60, 50);
        b7.setBounds(600, 320, 60, 50);
        b8.setBounds(670, 320, 60, 50);
        b9.setBounds(740, 320, 60, 50);
        b10.setBounds(600, 380, 200, 50);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        b10.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        pan.add(tf);

        pan.add(l1);
        pan.add(l2);

        pan.add(b11);
        pan.add(b12);

        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        pan.add(b6);
        pan.add(b7);
        pan.add(b8);
        pan.add(b9);
        pan.add(b10);
        str = "";
        val = 0;

        return pan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o.equals(b1)) {
            val = val + 1;
            if (str.isEmpty()) {
                str = "1";
            } else {
                str = str + " + 1";
            }
            l2.setText(str);
        } else if (o.equals(b2)) {
            val = val + 2;
            if (str.isEmpty()) {
                str = "2";
            } else {
                str = str + " + 2";
            }
            l2.setText(str);
        } else if (o.equals(b3)) {
            val = val + 3;
            if (str.isEmpty()) {
                str = "3";
            } else {
                str = str + " + 3";
            }
            l2.setText(str);

        } else if (o.equals(b4)) {
            val = val + 4;
            if (str.isEmpty()) {
                str = "4";
            } else {
                str = str + " + 4";
            }
            l2.setText(str);

        } else if (o.equals(b5)) {
            val = val + 5;
            if (str.isEmpty()) {
                str = "5";
            } else {
                str = str + " + 5";
            }
            l2.setText(str);

        } else if (o.equals(b6)) {
            val = val + 6;
            if (str.isEmpty()) {
                str = "6";
            } else {
                str = str + " + 6";
            }
            l2.setText(str);

        } else if (o.equals(b7)) {
            val = val + 7;
            if (str.isEmpty()) {
                str = "7";
            } else {
                str = str + " + 7";
            }
            l2.setText(str);

        } else if (o.equals(b8)) {
            val = val + 8;
            if (str.isEmpty()) {
                str = "8";
            } else {
                str = str + " + 8";
            }
            l2.setText(str);

        } else if (o.equals(b9)) {
            val = val + 9;
            if (str.isEmpty()) {
                str = "9";
            } else {
                str = str + " + 9";
            }
            l2.setText(str);

        } else if (o.equals(b10)) {
            val = val + 0;
            if (str.isEmpty()) {
                str = "0";
            } else {
                str = str + " + 0";
            }
            l2.setText(str);

        } else if (o.equals(b11)) {
            val = 0;
            str = "";
            Random ran = new Random();
            no = ran.nextInt(17);
            tf.setText(Integer.toString(no));
            l2.setText("Input");
            l1.setText("Game Result");

        } else if (o.equals(b12)) {
            if (val == no) {
                l1.setText("Win the Game");
            } else {
                l1.setText("Lose the Game");
            }

        }
    }
}

class Pan2 implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JTextField tf;
    JLabel l1, l2;
    String str;
    int val, no;

    public JPanel pan2() {
        JPanel pan = new JPanel();
        pan.setLayout(null);

        Font f = new Font("Arial", Font.BOLD, 18);

        tf = new JTextField();

        l1 = new JLabel("Game Result");
        l2 = new JLabel("Inputs");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");

        b11 = new JButton("Clear");
        b12 = new JButton("Submit");

        l1.setBounds(100, 250, 200, 30);
        l1.setFont(f);

        tf.setBounds(100, 300, 200, 30);
        tf.setFont(f);
        tf.setEditable(false);

        l2.setBounds(100, 350, 200, 30);
        l2.setFont(f);

        b11.setBounds(400, 280, 100, 30);
        b11.setFont(f);

        b12.setBounds(400, 320, 100, 30);
        b12.setFont(f);

        b1.setBounds(600, 200, 60, 50);
        b2.setBounds(670, 200, 60, 50);
        b3.setBounds(740, 200, 60, 50);
        b4.setBounds(600, 260, 60, 50);
        b5.setBounds(670, 260, 60, 50);
        b6.setBounds(740, 260, 60, 50);
        b7.setBounds(600, 320, 60, 50);
        b8.setBounds(670, 320, 60, 50);
        b9.setBounds(740, 320, 60, 50);
        b10.setBounds(600, 380, 200, 50);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        b10.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        pan.add(tf);

        pan.add(l1);
        pan.add(l2);

        pan.add(b11);
        pan.add(b12);

        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        pan.add(b6);
        pan.add(b7);
        pan.add(b8);
        pan.add(b9);
        pan.add(b10);
        str = "";
        val = 0;

        return pan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o.equals(b1)) {

            if (str.isEmpty()) {
                str = "1";
                val = 1;
            } else {
                str = str + " - 1";
                val = val - 1;
            }
            l2.setText(str);
        } else if (o.equals(b2)) {

            if (str.isEmpty()) {
                str = "2";
                val = 2;
            } else {
                str = str + " - 2";
                val = val - 2;
            }
            l2.setText(str);
        } else if (o.equals(b3)) {

            if (str.isEmpty()) {
                str = "3";
                val = 1;
            } else {
                str = str + " - 3";
                val = val - 3;
            }
            l2.setText(str);

        } else if (o.equals(b4)) {
            if (str.isEmpty()) {
                str = "4";
                val = 4;

            } else {
                str = str + " - 4";
                val = val - 4;

            }
            l2.setText(str);

        } else if (o.equals(b5)) {
            if (str.isEmpty()) {
                str = "5";
                val = 5;

            } else {
                str = str + " - 5";
                val = val - 5;

            }
            l2.setText(str);

        } else if (o.equals(b6)) {
            if (str.isEmpty()) {
                str = "6";
                val = 6;

            } else {
                str = str + " - 6";
                val = val - 6;

            }
            l2.setText(str);

        } else if (o.equals(b7)) {
            if (str.isEmpty()) {
                str = "7";
                val = 7;

            } else {
                str = str + " - 7";
                val = val - 7;

            }
            l2.setText(str);

        } else if (o.equals(b8)) {
            if (str.isEmpty()) {
                str = "8";
                val = 8;

            } else {
                str = str + " - 8";
                val = val - 8;

            }
            l2.setText(str);

        } else if (o.equals(b9)) {
            if (str.isEmpty()) {
                str = "9";
                val = 9;

            } else {
                str = str + " - 9";
                val = val - 9;

            }
            l2.setText(str);

        } else if (o.equals(b10)) {
            if (str.isEmpty()) {
                str = "0";
                val = 0;

            } else {
                str = str + " - 0";
                val = val - 0;

            }
            l2.setText(str);

        } else if (o.equals(b11)) {
            val = 0;
            str = "";
            Random ran = new Random();
            no = ran.nextInt(9);
            tf.setText(Integer.toString(no));
            l2.setText("Input");
            l1.setText("Game Result");

        } else if (o.equals(b12)) {
            if (val == no) {
                l1.setText("Win the Game");
            } else {
                l1.setText("Lose the Game");
            }

        }
    }
}

class Pan3 implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JTextField tf;
    JLabel l1, l2;
    String str;
    int val, no;

    public JPanel pan3() {
        JPanel pan = new JPanel();
        pan.setLayout(null);

        Font f = new Font("Arial", Font.BOLD, 18);

        tf = new JTextField();

        l1 = new JLabel("Game Result");
        l2 = new JLabel("Inputs");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");

        b11 = new JButton("Clear");
        b12 = new JButton("Submit");

        l1.setBounds(100, 250, 200, 30);
        l1.setFont(f);

        tf.setBounds(100, 300, 200, 30);
        tf.setFont(f);
        tf.setEditable(false);

        l2.setBounds(100, 350, 200, 30);
        l2.setFont(f);

        b11.setBounds(400, 280, 100, 30);
        b11.setFont(f);

        b12.setBounds(400, 320, 100, 30);
        b12.setFont(f);

        b1.setBounds(600, 200, 60, 50);
        b2.setBounds(670, 200, 60, 50);
        b3.setBounds(740, 200, 60, 50);
        b4.setBounds(600, 260, 60, 50);
        b5.setBounds(670, 260, 60, 50);
        b6.setBounds(740, 260, 60, 50);
        b7.setBounds(600, 320, 60, 50);
        b8.setBounds(670, 320, 60, 50);
        b9.setBounds(740, 320, 60, 50);
        b10.setBounds(600, 380, 200, 50);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        b10.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        pan.add(tf);

        pan.add(l1);
        pan.add(l2);

        pan.add(b11);
        pan.add(b12);

        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        pan.add(b6);
        pan.add(b7);
        pan.add(b8);
        pan.add(b9);
        pan.add(b10);
        str = "";
        val = 1;

        return pan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o.equals(b1)) {
            if (str.isEmpty()) {
                str = "1";
                val = 1;
            } else {
                str = str + " * 1";
                val = val * 1;
            }
            l2.setText(str);
        } else if (o.equals(b2)) {
            if (str.isEmpty()) {
                str = "2";
                val = 2;
            } else {
                str = str + " * 2";
                val = val * 2;
            }
            l2.setText(str);
        } else if (o.equals(b3)) {
            if (str.isEmpty()) {
                str = "3";
                val = 3;

            } else {
                str = str + " * 3";
                val = val * 3;
            }
            l2.setText(str);

        } else if (o.equals(b4)) {
            if (str.isEmpty()) {
                str = "4";
                val = 4;

            } else {
                str = str + " * 4";
                val = val * 4;
            }
            l2.setText(str);

        } else if (o.equals(b5)) {
            if (str.isEmpty()) {
                val = 5;
                str = "5";
            } else {
                str = str + " * 5";
                val = val * 5;
            }
            l2.setText(str);

        } else if (o.equals(b6)) {
            if (str.isEmpty()) {
                str = "6";
                val = 6;
            } else {
                str = str + " * 6";
                val = val * 6;
            }
            l2.setText(str);

        } else if (o.equals(b7)) {
            if (str.isEmpty()) {
                str = "7";
                val = 7;
            } else {
                str = str + " * 7";
                val = val * 7;
            }
            l2.setText(str);

        } else if (o.equals(b8)) {
            if (str.isEmpty()) {
                str = "8";
                val = 8;
            } else {
                str = str + " * 8";
                val = val * 8;
            }
            l2.setText(str);

        } else if (o.equals(b9)) {
            if (str.isEmpty()) {
                str = "9";
                val = 9;
            } else {
                str = str + " * 9";
                val = val * 9;
            }
            l2.setText(str);

        } else if (o.equals(b10)) {
            if (str.isEmpty()) {
                str = "0";
                val = 0;
            } else {
                str = str + " * 0";
                val = val * 0;
            }
            l2.setText(str);

        } else if (o.equals(b11)) {
            val = 1;
            str = "";
            Random ran = new Random();
            no = ran.nextInt(81);
            tf.setText(Integer.toString(no));
            l2.setText("Input");
            l1.setText("Game Result");

        } else if (o.equals(b12)) {
            if (val == no) {
                l1.setText("Win the Game");
            } else {
                l1.setText("Lose the Game");
            }

        }
    }
}

class Pan4 implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JTextField tf;
    JLabel l1, l2;
    String str;
    int val, no;

    public JPanel pan4() {
        JPanel pan = new JPanel();
        pan.setLayout(null);

        Font f = new Font("Arial", Font.BOLD, 18);

        tf = new JTextField();

        l1 = new JLabel("Game Result");
        l2 = new JLabel("Inputs");

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");

        b11 = new JButton("Clear");
        b12 = new JButton("Submit");

        l1.setBounds(100, 250, 200, 30);
        l1.setFont(f);

        tf.setBounds(100, 300, 200, 30);
        tf.setFont(f);
        tf.setEditable(false);

        l2.setBounds(100, 350, 200, 30);
        l2.setFont(f);

        b11.setBounds(400, 280, 100, 30);
        b11.setFont(f);

        b12.setBounds(400, 320, 100, 30);
        b12.setFont(f);

        b1.setBounds(600, 200, 60, 50);
        b2.setBounds(670, 200, 60, 50);
        b3.setBounds(740, 200, 60, 50);
        b4.setBounds(600, 260, 60, 50);
        b5.setBounds(670, 260, 60, 50);
        b6.setBounds(740, 260, 60, 50);
        b7.setBounds(600, 320, 60, 50);
        b8.setBounds(670, 320, 60, 50);
        b9.setBounds(740, 320, 60, 50);
        b10.setBounds(600, 380, 200, 50);

        b1.setFont(f);
        b2.setFont(f);
        b3.setFont(f);
        b4.setFont(f);
        b5.setFont(f);
        b6.setFont(f);
        b7.setFont(f);
        b8.setFont(f);
        b9.setFont(f);
        b10.setFont(f);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        pan.add(tf);

        pan.add(l1);
        pan.add(l2);

        pan.add(b11);
        pan.add(b12);

        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        pan.add(b6);
        pan.add(b7);
        pan.add(b8);
        pan.add(b9);
        pan.add(b10);
        str = "";
        val = 0;

        return pan;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o.equals(b1)) {
            if (str.isEmpty()) {
                str = "1";
                val = 1;
            } else {
                str = str + " / 1";
                val = val / 1;
            }
            l2.setText(str);
        } else if (o.equals(b2)) {
            if (str.isEmpty()) {
                str = "2";
                val = 2;
            } else {
                str = str + " / 2";
                val = val / 2;
            }
            l2.setText(str);
        } else if (o.equals(b3)) {
            if (str.isEmpty()) {
                str = "3";
                val = 3;
            } else {
                str = str + " / 3";
                val = val / 3;
            }
            l2.setText(str);

        } else if (o.equals(b4)) {
            if (str.isEmpty()) {
                str = "4";
                val = 4;
            } else {
                str = str + " / 4";
                val = val / 4;
            }
            l2.setText(str);

        } else if (o.equals(b5)) {
            if (str.isEmpty()) {
                str = "5";
                val = 5;
            } else {
                str = str + " / 5";
                val = val / 5;
            }
            l2.setText(str);

        } else if (o.equals(b6)) {
            if (str.isEmpty()) {
                str = "6";
                val = 6;
            } else {
                str = str + " / 6";
                val = val / 6;
            }
            l2.setText(str);

        } else if (o.equals(b7)) {
            if (str.isEmpty()) {
                str = "7";
                val = 7;
            } else {
                str = str + " / 7";
                val = val / 7;
            }
            l2.setText(str);

        } else if (o.equals(b8)) {
            if (str.isEmpty()) {
                str = "8";
                val = 8;
            } else {
                str = str + " / 8";
                val = val / 8;
            }
            l2.setText(str);

        } else if (o.equals(b9)) {
            if (str.isEmpty()) {
                str = "9";
                val = 9;
            } else {
                str = str + " / 9";
                val = val / 9;
            }
            l2.setText(str);

        } else if (o.equals(b10)) {
            if (str.isEmpty()) {
                str = "0";
                val = 0;

            } else {
                str = str + " / 0";
                val = val / 0;
            }
            l2.setText(str);

        } else if (o.equals(b11)) {
            val = 0;
            str = "";
            Random ran = new Random();
            no = ran.nextInt(9);
            tf.setText(Integer.toString(no));
            l2.setText("Input");
            l1.setText("Game Result");

        } else if (o.equals(b12)) {
            if (val == no) {
                l1.setText("Win the Game");
            } else {
                l1.setText("Lose the Game");
            }

        }
    }
}