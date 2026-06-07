import java.awt.*;

public class ArithmaticOp extends Frame {
    /**
     * 
     */
    public ArithmaticOp() {
        setLayout(null);

        Font f = new Font("Times New Roman", Font.BOLD, 16);
        Font ft = new Font("Times New Roman", Font.PLAIN, 14);

        Label l1 = new Label("Enter First Number : ");
        Label l2 = new Label("Enter Second Number : ");
        Label l3 = new Label("Arithmatic Result is : ");
        Label l4 = new Label("Relational Result is : ");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        CheckboxGroup cg1 = new CheckboxGroup();
        CheckboxGroup cg2 = new CheckboxGroup();

        Checkbox ch1 = new Checkbox("Addition", true, cg1);
        Checkbox ch2 = new Checkbox("Subtraction", false, cg1);
        Checkbox ch3 = new Checkbox("Multiplication", false, cg1);
        Checkbox ch4 = new Checkbox("Division", false, cg1);

        Checkbox ch5 = new Checkbox("Largest", true, cg2);
        Checkbox ch6 = new Checkbox("Samallest", false, cg2);

        Button b1 = new Button("Get Result");

        l1.setSize(210, 25);
        l1.setLocation(75, 100);
        l1.setFont(f);
        l1.setBackground(Color.LIGHT_GRAY);

        t1.setSize(180, 25);
        t1.setLocation(285, 100);
        t1.setFont(ft);

        l2.setSize(210, 25);
        l2.setLocation(75, 150);
        l2.setFont(f);
        l2.setBackground(Color.LIGHT_GRAY);

        t2.setSize(180, 25);
        t2.setLocation(285, 150);
        t2.setFont(ft);

        ch1.setSize(100, 25);
        ch1.setLocation(80, 200);
        ch1.setFont(ft);
        ch1.setBackground(Color.LIGHT_GRAY);

        ch2.setSize(100, 25);
        ch2.setLocation(180, 200);
        ch2.setFont(ft);
        ch2.setBackground(Color.LIGHT_GRAY);

        ch3.setSize(100, 25);
        ch3.setLocation(280, 200);
        ch3.setFont(ft);
        ch3.setBackground(Color.LIGHT_GRAY);

        ch4.setSize(100, 25);
        ch4.setLocation(380, 200);
        ch4.setFont(ft);
        ch4.setBackground(Color.LIGHT_GRAY);

        ch5.setSize(100, 25);
        ch5.setLocation(80, 250);
        ch5.setFont(ft);
        ch5.setBackground(Color.LIGHT_GRAY);

        ch6.setSize(100, 25);
        ch6.setLocation(180, 250);
        ch6.setFont(ft);
        ch6.setBackground(Color.LIGHT_GRAY);

        b1.setSize(100, 30);
        b1.setLocation(200, 300);
        b1.setFont(f);
        b1.setBackground(Color.pink);

        l3.setSize(210, 25);
        l3.setLocation(75, 350);
        l3.setFont(f);
        l3.setBackground(Color.LIGHT_GRAY);

        t3.setSize(180, 25);
        t3.setLocation(285, 350);
        t3.setFont(ft);

        l4.setSize(210, 25);
        l4.setLocation(75, 400);
        l4.setFont(f);
        l4.setBackground(Color.LIGHT_GRAY);

        t4.setSize(180, 25);
        t4.setLocation(285, 400);
        t4.setFont(ft);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(ch1);
        add(ch2);
        add(ch3);
        add(ch4);

        add(ch5);
        add(ch6);

        add(b1);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

    }

    public static void main(String ar[]) {
        ArithmaticOp a = new ArithmaticOp();
        a.setTitle("Arithematic Operation");
        a.setVisible(true);
        a.setSize(600, 600);
        a.setBackground(Color.LIGHT_GRAY);
    }

}
