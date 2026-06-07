import java.awt.*;
import java.awt.event.*;

public class Copy extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1;

    public Copy() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.PLAIN, 24);
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Copy");

        t1.setBounds(150, 150, 200, 30);
        t1.setFont(f1);

        t2.setBounds(150, 250, 200, 30);
        t2.setFont(f1);
        t2.setEditable(false);

        b1.setBounds(200, 200, 100, 30);
        b1.setFont(f1);
        b1.setBackground(Color.PINK);

        b1.addActionListener(this);
        add(t1);
        add(t2);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae) {
        String temp = t1.getText();
        t2.setText(temp);
    }

    public static void main(String ar[]) {
        Copy fr = new Copy();
        fr.setSize(700, 500);
        fr.setVisible(true);
        fr.setBackground(Color.GRAY);
        fr.setTitle("COPY");
    }
}
