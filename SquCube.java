import java.awt.*;
import java.awt.event.*;

public class SquCube extends Frame implements ActionListener {
    Label l1, l2, l3;
    Button b1;
    TextField t1;

    public SquCube() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.PLAIN, 22);
        Font f2 = new Font("Times New Roman", Font.BOLD, 20);
        l1 = new Label("Enter a number :");
        l2 = new Label("Square is :");
        l3 = new Label("Cube is :");
        b1 = new Button("Get");
        t1 = new TextField();

        l1.setBounds(100, 100, 200, 30);
        l1.setFont(f1);
        l1.setBackground(Color.GRAY);
        t1.setBounds(300, 100, 200, 30);
        t1.setFont(f2);
        b1.setBounds(250, 200, 100, 30);
        l2.setBounds(150, 250, 200, 30);
        l2.setFont(f1);
        l2.setBackground(Color.GRAY);
        l3.setBounds(150, 300, 200, 30);
        l3.setFont(f1);
        l3.setBackground(Color.GRAY);
        b1.setBackground(Color.PINK);
        b1.setFont(f1);
        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(t1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        l2.setText("Square is : " + (a * a));
        l3.setText("Cube is : " + (a * a * a));
    }

    public static void main(String ar[]) {
        SquCube f = new SquCube();
        f.setVisible(true);
        f.setTitle("Square Cube");
        f.setSize(600, 300);
        f.setBackground(Color.GRAY);
    }
}
