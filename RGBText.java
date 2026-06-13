import java.applet.*;
import java.awt.event.*;
import java.awt.*;

// <applet code="RGBText" width=1200 height=700></applet>

public class RGBText extends Applet implements ActionListener {
    TextField t1, t2, t3;
    Label l1, l2, l3;
    Button b1;
    Color c;
    int r, g, b;

    public void init() {

        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        l1 = new Label("RED");
        l2 = new Label("GREEN");
        l3 = new Label("BLUE");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        b1 = new Button("Apply");
        setFont(f1);
        l1.setBounds(100, 150, 100, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 250, 100, 30);

        t1.setBounds(250, 150, 100, 30);
        t2.setBounds(250, 200, 100, 30);
        t3.setBounds(250, 250, 100, 30);

        b1.setBounds(350, 350, 100, 40);
        b1.addActionListener(this);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b1);

    }

    public void actionPerformed(ActionEvent ae) {
        r = Integer.parseInt(t1.getText());
        g = Integer.parseInt(t2.getText());
        b = Integer.parseInt(t3.getText());

        c = new Color(r, g, b);
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(c);
        g.fillRect(500, 100, 200, 200);
    }
}
