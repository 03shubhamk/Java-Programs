import java.awt.*;
import java.awt.event.*;

class Window2 extends Frame implements ActionListener {
    public Window2() {
        setLayout(new FlowLayout());
        Button b = new Button("Switch Window");
        b.setBackground(Color.RED);
        add(b);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        FrameSwitch w = new FrameSwitch();
        w.setVisible(true);
        w.setSize(400, 400);
        w.setTitle("First Window");
        this.setVisible(false);

    }
}

public class FrameSwitch extends Frame implements ActionListener {
    public FrameSwitch() {
        setLayout(new FlowLayout());
        Button b = new Button("Switch Window");
        b.setBackground(Color.GREEN);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        Window2 w = new Window2();
        w.setVisible(true);
        w.setSize(400, 400);
        w.setTitle("Second Window");
        this.setVisible(false);
    }

    public static void main(String ar[]) {
        FrameSwitch f = new FrameSwitch();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setTitle("First Window");
    }
}
