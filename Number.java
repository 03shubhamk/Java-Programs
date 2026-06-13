import java.awt.*;
import java.awt.event.*;

public class Number extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b1, b2;

    public Number() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.PLAIN, 16);

        b1 = new Button("-");
        b1.setFont(f1);
        b1.setBounds(70, 100, 75, 30);

        b2 = new Button("+");
        b2.setFont(f1);
        b2.setBounds(380, 100, 75, 30);

        t1 = new TextField("0");
        t1.setEditable(false);
        t1.setFont(f1);
        t1.setBounds(200, 100, 120, 30);

        t2 = new TextField("1");
        t2.setFont(f1);
        t2.setBounds(70, 170, 75, 30);

        t3 = new TextField("1");
        t3.setFont(f1);
        t3.setBounds(380, 170, 75, 30);

        add(b1);
        add(b2);
        add(t1);
        add(t2);
        add(t3);

        b1.setBackground(Color.ORANGE);
        b2.setBackground(Color.RED);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();

        if (s.equals("+")) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t3.getText());

            t1.setText((n1 + n2) + "");
        }

        else if (s.equals("-")) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());

            t1.setText((n1 - n2) + "");
        }
    }

    public static void main(String ar[]) {
        Number f = new Number();
        f.setVisible(true);
        f.setTitle("Increment & Decrement");
        f.setSize(700, 400);
        f.setBackground(Color.WHITE);
    }
}
