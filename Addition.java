import java.awt.*;
import java.awt.event.*;

public class Addition extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Label l1, l2, l3;

    public Addition() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.PLAIN, 22);
        Font f2 = new Font("Times New Roman", Font.BOLD, 20);
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        l1 = new Label("Enter First Number : ");
        l2 = new Label("Enter Second Number : ");
        l3 = new Label("Result : ");

        Button b1 = new Button("ADD");
        Button b2 = new Button("RESET");

        l1.setBounds(100, 100, 250, 30);
        l1.setFont(f2);
        l1.setBackground(Color.GRAY);

        t1.setBounds(350, 100, 150, 30);
        t1.setFont(f1);

        l2.setBounds(100, 150, 250, 30);
        l2.setFont(f2);
        l2.setBackground(Color.GRAY);

        t2.setBounds(350, 150, 150, 30);
        t2.setFont(f1);

        l3.setBounds(100, 200, 250, 30);
        l3.setFont(f2);
        l3.setBackground(Color.GRAY);

        t3.setBounds(350, 200, 150, 30);
        t3.setFont(f1);

        b1.setBounds(200, 250, 100, 30);
        b1.setFont(f2);
        b1.setBackground(Color.PINK);
        b1.addActionListener(this);

        b2.setBounds(350, 250, 100, 30);
        b2.setFont(f2);
        b2.setBackground(Color.PINK);
        b2.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();

        if (s.equals("ADD")) {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText((a + b) + "");
        } else if (s.equals("RESET")) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String ar[]) {
        Addition fr = new Addition();
        fr.setTitle("Addition");
        fr.setSize(600, 400);
        fr.setVisible(true);
        fr.setBackground(Color.GRAY);
    }
}
