import java.awt.*;

public class RegisterDetail extends Frame {
    public RegisterDetail() {
        setLayout(null);

        Font f = new Font("Times New Roman", Font.BOLD, 16);
        Font ft = new Font("Times New Roman", Font.PLAIN, 14);

        Button btn1 = new Button("Register");

        Label l1 = new Label("Enter Name : ");
        Label l2 = new Label("Gender : ");
        Label l3 = new Label("Enter Mobile no. : ");
        Label l4 = new Label("Select Language : ");
        Label l5 = new Label("Enter Username : ");
        Label l6 = new Label("Enter Password : ");
        Label l7 = new Label("Confirm Password : ");
        Label l8 = new Label("Enter Address : ");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        TextField t5 = new TextField();

        TextArea ta = new TextArea("", 3, 10, 3);

        Checkbox cb1 = new Checkbox("Hindi");
        Checkbox cb2 = new Checkbox("English");
        Checkbox cb3 = new Checkbox("Marathi");

        CheckboxGroup cb = new CheckboxGroup();
        Checkbox cb4 = new Checkbox("Male", true, cb);
        Checkbox cb5 = new Checkbox("Female", false, cb);
        Checkbox cb6 = new Checkbox("Other", false, cb);

        l1.setSize(160, 25);
        l1.setLocation(75, 100);
        l1.setFont(f);
        l1.setBackground(Color.LIGHT_GRAY);

        t1.setSize(250, 25);
        t1.setLocation(240, 100);
        t1.setFont(ft);

        l2.setSize(160, 25);
        l2.setLocation(75, 140);
        l2.setFont(f);
        l2.setBackground(Color.LIGHT_GRAY);

        cb4.setSize(70, 25);
        cb4.setLocation(240, 140);
        cb4.setFont(ft);
        cb4.setBackground(Color.LIGHT_GRAY);

        cb5.setSize(70, 25);
        cb5.setLocation(320, 140);
        cb5.setFont(ft);
        cb5.setBackground(Color.LIGHT_GRAY);

        cb6.setSize(70, 25);
        cb6.setLocation(400, 140);
        cb6.setFont(ft);
        cb6.setBackground(Color.LIGHT_GRAY);

        l3.setSize(160, 25);
        l3.setLocation(75, 180);
        l3.setFont(f);
        l3.setBackground(Color.LIGHT_GRAY);

        cb1.setSize(70, 25);
        cb1.setLocation(240, 180);
        cb1.setFont(ft);
        cb1.setBackground(Color.LIGHT_GRAY);

        cb2.setSize(70, 25);
        cb2.setLocation(320, 180);
        cb2.setFont(ft);
        cb2.setBackground(Color.LIGHT_GRAY);

        cb3.setSize(70, 25);
        cb3.setLocation(400, 180);
        cb3.setFont(ft);
        cb3.setBackground(Color.LIGHT_GRAY);

        l4.setSize(160, 25);
        l4.setLocation(75, 220);
        l4.setFont(f);
        l4.setBackground(Color.LIGHT_GRAY);

        t2.setSize(250, 25);
        t2.setLocation(240, 220);
        t2.setFont(ft);

        l5.setSize(160, 25);
        l5.setLocation(75, 260);
        l5.setFont(f);
        l5.setBackground(Color.LIGHT_GRAY);

        t3.setSize(250, 25);
        t3.setLocation(240, 260);
        t3.setFont(ft);

        l6.setSize(160, 25);
        l6.setLocation(75, 300);
        l6.setFont(f);
        l6.setBackground(Color.LIGHT_GRAY);

        t4.setSize(250, 25);
        t4.setLocation(240, 300);
        t4.setEchoChar('*');
        t4.setFont(ft);

        l7.setSize(160, 25);
        l7.setLocation(75, 340);
        l7.setFont(f);
        l7.setBackground(Color.LIGHT_GRAY);

        t5.setSize(250, 25);
        t5.setLocation(240, 340);
        t5.setEchoChar('*');
        t5.setFont(ft);

        l8.setSize(160, 25);
        l8.setLocation(75, 380);
        l8.setFont(f);
        l8.setBackground(Color.LIGHT_GRAY);

        ta.setSize(250, 70);
        ta.setLocation(240, 380);
        ta.setFont(ft);

        btn1.setSize(90, 30);
        btn1.setLocation(240, 490);
        btn1.setFont(f);

        btn1.setBackground(Color.pink);

        add(l1);
        add(t1);

        add(l2);
        add(cb4);
        add(cb5);
        add(cb6);

        add(l3);
        add(cb1);
        add(cb2);
        add(cb3);

        add(l4);
        add(t2);

        add(l5);
        add(t3);

        add(l6);
        add(t4);

        add(l7);
        add(t5);

        add(l8);
        add(ta);

        add(btn1);

    }

    public static void main(String ar[]) {
        RegisterDetail fr = new RegisterDetail();

        fr.setSize(600, 600);
        fr.setTitle("Registration Window");
        fr.setVisible(true);
        fr.setBackground(Color.LIGHT_GRAY);

    }
}