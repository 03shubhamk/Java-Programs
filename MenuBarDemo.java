import java.awt.*;
import java.awt.event.*;

public class MenuBarDemo extends Frame implements ActionListener {
    MenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7, mi8, mi9, mi10, mi11, mi12, mi13;
    TextField t1, t2, t3;

    public MenuBarDemo() {
        setLayout(null);

        MenuBar mb = new MenuBar();

        Font f = new Font("Times New Roman", Font.PLAIN, 20);
        Font f1 = new Font("Times New Roman", Font.PLAIN, 16);

        Menu m1 = new Menu("Arithmetic");
        Menu m2 = new Menu("Relational");
        Menu m3 = new Menu("Clear");

        m1.setFont(f1);
        m2.setFont(f1);
        m3.setFont(f1);

        mi1 = new MenuItem("Add");
        mi2 = new MenuItem("Sub");
        mi3 = new MenuItem("Mul");
        mi4 = new MenuItem("Div");
        mi1.setFont(f1);
        mi2.setFont(f1);
        mi3.setFont(f1);
        mi4.setFont(f1);

        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);

        mi5 = new MenuItem("<");
        mi6 = new MenuItem(">");
        mi7 = new MenuItem("==");
        mi8 = new MenuItem("!=");
        mi9 = new MenuItem(">=");
        mi10 = new MenuItem("<=");

        mi5.setFont(f1);
        mi6.setFont(f1);
        mi7.setFont(f1);
        mi8.setFont(f1);
        mi9.setFont(f1);
        mi10.setFont(f1);

        m2.add(mi5);
        m2.add(mi6);
        m2.add(mi7);
        m2.add(mi8);
        m2.add(mi9);
        m2.add(mi10);

        mi11 = new MenuItem("Clear Input");
        mi13 = new MenuItem("Clear All");

        mi11.setFont(f1);
        mi13.setFont(f1);

        m3.add(mi11);
        m3.add(mi13);

        Label l1 = new Label("Num 1 : ");
        Label l2 = new Label("Num 2: ");
        Label l3 = new Label("Result : ");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        l1.setBounds(70, 100, 200, 30);
        l1.setFont(f);
        l1.setBackground(Color.WHITE);
        t1.setBounds(290, 100, 200, 30);

        l2.setBounds(70, 160, 200, 30);
        l2.setFont(f);
        l2.setBackground(Color.WHITE);
        t2.setBounds(290, 160, 200, 30);

        l3.setBounds(70, 220, 200, 30);
        l3.setFont(f);
        l3.setBackground(Color.WHITE);
        t3.setBounds(290, 220, 200, 30);
        t3.setEditable(false);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        setMenuBar(mb);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);
        mi7.addActionListener(this);
        mi8.addActionListener(this);
        mi9.addActionListener(this);
        mi10.addActionListener(this);
        mi11.addActionListener(this);
        mi13.addActionListener(this);
    }

    public static void main(String ar[]) {
        MenuBarDemo m = new MenuBarDemo();
        m.setSize(700, 700);
        m.setTitle("Menu Operations");
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object s = ae.getSource();
        if (s.equals(mi1)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText((n1 + n2) + "");
        } else if (s.equals(mi2)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText((n1 - n2) + "");
        } else if (s.equals(mi3)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText((n1 * n2) + "");
        } else if (s.equals(mi4)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText((n1 / n2) + "");
        } else if (s.equals(mi5)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (n1 < n2) {
                t3.setText("True");
            } else {
                t3.setText("False");
            }
        } else if (s.equals(mi6)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (n1 > n2) {
                t3.setText("True");
            } else {
                t3.setText("False");
            }
        } else if (s.equals(mi7)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (n1 == n2) {
                t3.setText("True");
            } else {
                t3.setText("False");
            }
        } else if (s.equals(mi8)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (n1 != n2) {
                t3.setText("True");
            } else {
                t3.setText("False");
            }
        } else if (s.equals(mi9)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (n1 >= n2) {
                t3.setText("True");
            } else {
                t3.setText("False");
            }
        } else if (s.equals(mi10)) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            if (n1 <= n2) {
                t3.setText("True");
            } else {
                t3.setText("False");
            }
        } else if (s.equals(mi11)) {
            t1.setText(null);
            t2.setText(null);
        } else if (s.equals(mi13)) {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
        }

    }
}
