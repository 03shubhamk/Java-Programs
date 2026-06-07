import java.awt.*;
import java.applet.Applet;

public class ChoiceDemo extends Applet {
    public void init() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        Font f = new Font("Times New Roman", Font.BOLD, 16);

        Choice c1 = new Choice();
        Choice c2 = new Choice();

        Button b1 = new Button(" Draw ");

        Label l1 = new Label("Select Shape : ");
        Label l2 = new Label("Select Color : ");

        CheckboxGroup cg = new CheckboxGroup();

        Checkbox cb1 = new Checkbox("Solid Fill ", true, cg);
        Checkbox cb2 = new Checkbox("Outline ", false, cg);

        c1.add("Rectangle");
        c1.add("Triangel");
        c1.add("Circle");
        c1.add("Oval");

        c2.add("Green");
        c2.add("Pink");
        c2.add("Yellow");
        
        c2.add("Red");
        c2.add("Black");

        l1.setBounds(80, 100, 120, 30);
        l1.setFont(f);
        l1.setBackground(Color.LIGHT_GRAY);

        c1.setBounds(200, 100, 150, 30);
        c1.setFont(f);

        l2.setBounds(450, 100, 120, 30);
        l2.setFont(f);
        l2.setBackground(Color.LIGHT_GRAY);

        c2.setBounds(570, 100, 150, 30);
        c2.setFont(f);

        cb1.setBounds(200, 250, 100, 30);
        cb1.setFont(f);
        cb1.setBackground(Color.LIGHT_GRAY);

        cb2.setBounds(400, 250, 100, 30);
        cb2.setFont(f);
        cb2.setBackground(Color.LIGHT_GRAY);

        b1.setBounds(300, 350, 100, 30);
        b1.setFont(f);
        b1.setBackground(Color.PINK);

        add(l1);
        add(c1);

        add(l2);
        add(c2);

        add(b1);

        add(cb1);
        add(cb2);
    }
}
