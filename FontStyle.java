import java.awt.*;
import java.applet.Applet;

// <applet code= "FontStyle" width=900 height=500 ></applet>

public class FontStyle extends Applet {
    public void init() {
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        Font f1 = new Font("Times New Roman", Font.BOLD, 24);
        Font f2 = new Font("Times New Roman", Font.PLAIN, 18);

        Label l1 = new Label("Select Font : ");
        Label l2 = new Label("Select Style : ");
        Label l3 = new Label("Select Size : ");
        Label l4 = new Label("Aa Bb Cc Dd  1234567890  ~!@#$%^&*()_{}:<>? ");

        List li1 = new List(5);
        List li2 = new List(5);
        List li3 = new List(5);

        Button b1 = new Button("Test");

        l1.setBounds(100, 100, 150, 50);
        l1.setFont(f1);
        l1.setBackground(Color.LIGHT_GRAY);
        li1.setBounds(100, 150, 200, 150);
        li1.add("Arial");
        li1.add("Times New Roman");
        li1.add("Serif");
        li1.add("SansSerif");
        li1.add("Monospaced");
        li1.add("Dialog");
        li1.add("DialogInput");
        li1.setFont(f2);

        l2.setBounds(400, 100, 150, 50);
        l2.setFont(f1);
        l2.setBackground(Color.LIGHT_GRAY);
        li2.setBounds(400, 150, 200, 150);
        li2.add("Bold");
        li2.add("Plain");
        li2.add("Italic");
        li2.add("Bold + Italic");
        li2.setFont(f2);

        l3.setBounds(650, 100, 150, 50);
        l3.setFont(f1);
        l3.setBackground(Color.LIGHT_GRAY);
        li3.setBounds(650, 150, 100, 150);
        li3.add("10");
        li3.add("12");
        li3.add("14");
        li3.add("16");
        li3.add("18");
        li3.add("20");
        li3.add("22");
        li3.add("24");
        li3.add("26");
        li3.add("28");
        li3.add("30");
        li3.setFont(f2);

        l4.setBounds(350, 400, 250, 50);
        l4.setBackground(Color.LIGHT_GRAY);

        b1.setBounds(400, 500, 100, 50);
        b1.setBackground(Color.PINK);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        add(li1);
        add(li2);
        add(li3);

        add(b1);
    }
}
