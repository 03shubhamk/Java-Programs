import java.awt.*;
import java.awt.event.*;

public class Check extends Frame implements ItemListener {
    Checkbox ch1, ch2, ch3;

    public Check() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.PLAIN, 16);
        ch1 = new Checkbox("Pizza", true);
        ch2 = new Checkbox("Burger", false);
        ch3 = new Checkbox("Pestry", false);

        ch1.setBounds(100, 100, 100, 30);
        ch1.setFont(f1);

        ch2.setBounds(200, 100, 100, 30);
        ch2.setFont(f1);

        ch3.setBounds(300, 100, 100, 30);
        ch3.setFont(f1);

        ch1.addItemListener(this);
        ch2.addItemListener(this);
        ch3.addItemListener(this);

        add(ch1);
        add(ch2);
        add(ch3);
    }

    public void itemStateChanged(ItemEvent ie) {
        Object s = ie.getSource();
        if(s.equals(ch1))
        {
            ch1.setState(true);
            ch2.setState(false);
            ch3.setState(false);
        }
        else if(s.equals(ch2))
        {
            ch1.setState(false);
            ch2.setState(true);
            ch3.setState(false);
        }
        else if(s.equals(ch3))
        {
            ch1.setState(false);
            ch2.setState(false);
            ch3.setState(true);
        }
    }

    public static void main(String ar[]) {
        Check c = new Check();
        c.setTitle("CheckBoxes");
        c.setSize(500, 400);
        c.setVisible(true);
    }
}
