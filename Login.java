import java.awt.*;

public class Login extends Frame {
    public Login() {
        setLayout(null);
        Font f = new Font("Times New Roman", Font.BOLD, 16);

        Button btn1 = new Button("Sign in");
        Button btn2 = new Button("Login");

        Label l1 = new Label("Enter Username : ");
        Label l2 = new Label("Enter Password : ");

        TextField t1 = new TextField();
        TextField t2 = new TextField();

        l1.setSize(160, 25);
        l1.setLocation(75, 100);
        l1.setFont(f);

        l2.setSize(160, 25);
        l2.setLocation(75, 140);
        l2.setFont(f);

        t1.setSize(150, 25);
        t1.setLocation(240, 100);

        t2.setSize(150, 25);
        t2.setLocation(240, 140);

        btn1.setSize(90, 30);
        btn1.setLocation(100, 190);

        btn2.setSize(90, 30);
        btn2.setLocation(250, 190);

        btn1.setBackground(Color.PINK);
        btn2.setBackground(Color.gray);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn1);
        add(btn2);

    }

    public static void main(String ar[]) {
        Login fr = new Login();
        fr.setSize(500, 500);
        fr.setTitle("Login Window");
        fr.setVisible(true);
    }
}