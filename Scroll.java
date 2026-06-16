import java.applet.*;
import java.awt.event.*;
import java.awt.*;

// <applet code="Scroll" width=1200 height=700></applet>
public class Scroll extends Applet implements AdjustmentListener {
    Scrollbar sc;
    TextField t;

    public void init() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        sc = new Scrollbar(0, 0, 10, 0, 255);
        sc.setBounds(350, 200, 400, 30);

        t = new TextField();
        t.setBounds(500, 300, 100, 30);
        t.setFont(f1);
        sc.addAdjustmentListener(this);
        add(sc);
        add(t);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int n = sc.getValue();
        t.setText(n + "");
    }

}
