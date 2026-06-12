import java.awt.*;
import java.awt.event.*;

public class MyStack extends Frame {
    Button b1, b2;
    TextArea t1;
    TextField tx1, tx2;
    Label l1, l2, l3, l4;
    String result = "";
    int[] list;
    int pointer = -1, ele;

    public MyStack() {
        setLayout(null);
        Font f = new Font("Times New Roman", Font.BOLD, 16);
        Font f1 = new Font("Times New Roman", Font.BOLD, 22);
        b1 = new Button("PUSH");
        b2 = new Button("POP");
        b1.addActionListener(new Inner1());
        b2.addActionListener(new Inner2());
        t1 = new TextArea("", 5, 10, 3);
        tx1 = new TextField();
        tx2 = new TextField();

        l1 = new Label("Enter Element to Push  : ");
        l2 = new Label("Popped Element : ");
        l3 = new Label("MSG here.....!");
        l4 = new Label("Stack Demonstration");

        l4.setSize(250, 25);
        l4.setLocation(250, 40);
        l4.setFont(f1);

        l1.setSize(200, 25);
        l1.setLocation(50, 100);
        l1.setFont(f);

        tx1.setSize(75, 25);
        tx1.setLocation(250, 100);
        tx1.setFont(f);

        b1.setSize(75, 25);
        b1.setLocation(175, 150);
        b1.setFont(f);

        l2.setSize(150, 25);
        l2.setLocation(400, 100);
        l2.setFont(f);

        tx2.setSize(75, 25);
        tx2.setLocation(550, 100);
        tx2.setFont(f);

        b2.setSize(100, 25);
        b2.setFont(f);
        b2.setLocation(475, 150);

        t1.setSize(70, 200);
        t1.setLocation(300, 220);
        t1.setFont(f);

        l3.setSize(350, 25);
        l3.setLocation(400, 300);
        l3.setFont(f);

        b1.setBackground(Color.pink);
        b2.setBackground(Color.pink);

        add(l4);
        add(l1);
        add(tx1);
        add(b1);

        add(l2);
        add(tx2);
        add(b2);

        add(t1);
        add(l3);
        list = new int[20];

    }

    class Inner1 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (pointer == list.length) {

            } else {
                ele = Integer.parseInt(tx1.getText());
                pointer++;
                list[pointer] = ele;

                result = "";

                for (int i = pointer; i >= 0; i--) {
                    result += "" + list[i] + "\n";
                }

                t1.setText(result);
                l3.setText("Pushed :" + ele);
                tx1.setText("");
            }
        }
    }

    class Inner2 implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (pointer == -1) {
                l3.setText("Popped :UNDERFLOW");
            } else {
                pointer--;
                result = "";
                tx2.setText("" + list[pointer + 1]);
                for (int i = pointer; i >= 0; i--) {
                    result += "" + list[i] + "\n";
                }

                t1.setText(result);
                l3.setText("Poped :" + list[pointer + 1]);
                tx1.setText("");
            }
        }
    }

    public static void main(String ar[]) {
        MyStack st = new MyStack();
        st.setSize(800, 500);
        st.setVisible(true);
        st.setTitle("Stack Demonstration");
    }
}