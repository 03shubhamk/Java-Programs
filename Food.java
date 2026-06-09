import java.awt.*;
import java.awt.event.*;

public class Food extends Frame implements ActionListener {
    Checkbox ch1, ch2, ch3;
    Label l1, l2, l3;
    Button b1;

    public Food() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.PLAIN, 20);

        l1 = new Label("Pizza is : True");
        l2 = new Label("Burger is : False");
        l3 = new Label("Pestry is : False");

        b1 = new Button("GET");
        ch1 = new Checkbox("Pizza", true);
        ch2 = new Checkbox("Burger", false);
        ch3 = new Checkbox("Pestry", false);

        ch1.setBounds(100, 100, 100, 30);
        ch1.setFont(f1);
        ch1.setBackground(Color.LIGHT_GRAY);

        ch2.setBounds(200, 100, 100, 30);
        ch2.setFont(f1);
        ch2.setBackground(Color.LIGHT_GRAY);

        ch3.setBounds(300, 100, 100, 30);
        ch3.setFont(f1);
        ch3.setBackground(Color.LIGHT_GRAY);

        b1.setBounds(200, 200, 100, 30);
        b1.setFont(f1);
        b1.setBackground(Color.PINK);

        l1.setBounds(100, 300, 200, 30);
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setFont(f1);

        l2.setBounds(100, 350, 200, 30);
        l2.setBackground(Color.LIGHT_GRAY);
        l2.setFont(f1);

        l3.setBounds(100, 400, 200, 30);
        l3.setBackground(Color.LIGHT_GRAY);
        l3.setFont(f1);

        b1.addActionListener(this);
        add(ch1);
        add(ch2);
        add(ch3);
        add(l1);
        add(l2);
        add(l3);
        add(b1);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ch1.getState()) {
            l1.setText("Pizza is : True");
        } else {
            l1.setText("Pizza is : False");
        }

        if (ch2.getState()) {
            l2.setText("Burger is : True");
        } else {
            l2.setText("Burger is : False");
        }

        if (ch3.getState()) {
            l3.setText("Pestry is : True");
        } else {
            l3.setText("Pestry is : False");
        }
    }

    public static void main(String ar[]) {
        Food f = new Food();
        f.setVisible(true);
        f.setSize(600, 600);
        f.setTitle("Food Menu");
        f.setBackground(Color.LIGHT_GRAY);
    }
}
