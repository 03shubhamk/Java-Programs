import java.awt.*;
import java.applet.Applet;

// <applet code="RGB2" width=1200 height=700></applet>

public class RGB2 extends Applet {
    public void init() {
        setLayout(null);
        // setBackground(Color.LIGHT_GRAY);

        Font f1 = new Font("Times New Roman", Font.BOLD, 20);

        Label l1 = new Label("Select Red : ");
        Label l2 = new Label("Select Green : ");
        Label l3 = new Label("Select Blue : ");
        Label l4 = new Label("abc");
        Label l5 = new Label("abc");
        Label l6 = new Label("abc");

        Scrollbar sc1 = new Scrollbar(0, 0, 30, 0, 255);
        Scrollbar sc2 = new Scrollbar(0, 0, 30, 0, 255);
        Scrollbar sc3 = new Scrollbar(0, 0, 30, 0, 255);

        Button b1 = new Button("-");
        b1.setFont(f1);
        Button b2 = new Button("-");
        b2.setFont(f1);
        Button b3 = new Button("-");
        b3.setFont(f1);
        Button b4 = new Button("+");
        b4.setFont(f1);
        Button b5 = new Button("+");
        b5.setFont(f1);
        Button b6 = new Button("+");
        b6.setFont(f1);

        l1.setBounds(100, 200, 150, 30);
        l1.setFont(f1);
        b1.setBounds(280, 200, 50, 30);
        sc1.setBounds(350, 200, 400, 30);
        b4.setBounds(770, 200, 50, 30);
        l4.setBounds(500, 250, 50, 30);
        l4.setFont(f1);

        l2.setBounds(100, 300, 150, 30);
        l2.setFont(f1);
        b2.setBounds(280, 300, 50, 30);
        sc2.setBounds(350, 300, 400, 30);
        b5.setBounds(770, 300, 50, 30);
        l5.setBounds(500, 350, 50, 30);
        l5.setFont(f1);

        l3.setBounds(100, 400, 150, 30);
        l3.setFont(f1);
        b3.setBounds(280, 400, 50, 30);
        sc3.setBounds(350, 400, 400, 30);
        b6.setBounds(770, 400, 50, 30);
        l6.setBounds(500, 450, 50, 30);
        l6.setFont(f1);

        // l1.setBackground(Color.LIGHT_GRAY);
        // l2.setBackground(Color.LIGHT_GRAY);
        // l3.setBackground(Color.LIGHT_GRAY);
        // l4.setBackground(Color.LIGHT_GRAY);
        // l5.setBackground(Color.LIGHT_GRAY);
        // l6.setBackground(Color.LIGHT_GRAY);

        add(l1);
        add(sc1);
        add(l4);

        add(l2);
        add(sc2);
        add(l5);

        add(l3);
        add(sc3);
        add(l6);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }

    public void paint(Graphics g) {
        g.fillRect(900, 225, 200, 200);
    }
}
