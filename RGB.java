import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.applet.Applet;

// <applet code="RGB" width=1200 height=700></applet>

public class RGB extends Applet implements AdjustmentListener {
    Label l1, l2, l3, l4, l5, l6;
    Scrollbar sc1, sc2, sc3;
    Color c;

    public void init() {
        setLayout(null);

        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        l1 = new Label("Select Red : ");
        l2 = new Label("Select Green : ");
        l3 = new Label("Select Blue : ");
        l4 = new Label("0");
        l5 = new Label("0");
        l6 = new Label("0");

        sc1 = new Scrollbar(0, 0, 30, 0, 255);
        sc2 = new Scrollbar(0, 0, 30, 0, 255);
        sc3 = new Scrollbar(0, 0, 30, 0, 255);

        l1.setBounds(100, 200, 150, 30);
        l1.setFont(f1);
        sc1.setBounds(350, 200, 400, 30);

        l4.setBounds(500, 250, 50, 30);
        l4.setFont(f1);

        l2.setBounds(100, 300, 150, 30);
        l2.setFont(f1);
        sc2.setBounds(350, 300, 400, 30);

        l5.setBounds(500, 350, 50, 30);
        l5.setFont(f1);

        l3.setBounds(100, 400, 150, 30);
        l3.setFont(f1);
        sc3.setBounds(350, 400, 400, 30);
        l6.setBounds(500, 450, 50, 30);
        l6.setFont(f1);

        add(l1);
        add(sc1);
        add(l4);

        add(l2);
        add(sc2);
        add(l5);

        add(l3);
        add(sc3);
        add(l6);

        sc1.addAdjustmentListener(this);
        sc2.addAdjustmentListener(this);
        sc3.addAdjustmentListener(this);

    }

    public void paint(Graphics g) {
        g.setColor(c);
        g.fillRect(900, 225, 200, 200);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int n1 = sc1.getValue();
        int n2 = sc2.getValue();
        int n3 = sc3.getValue();
        l4.setText(n1 + "");
        l5.setText(n2 + "");
        l6.setText(n3 + "");
        c = new Color(n1, n2, n3);
        repaint();

    }
}
