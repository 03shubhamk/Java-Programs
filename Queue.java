import java.awt.*;

public class Queue extends Frame {
    public Queue() {
        setLayout(null);
        Font f = new Font("Times New Roman", Font.BOLD, 16);

        Button b1 = new Button("ENQUEUE");
        Button b2 = new Button("DEQUEUE");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();

        Label l1 = new Label("Enter element to QUEUE : ");
        Label l2 = new Label("DEQUEUE element : ");
        Label l3 = new Label("See msg here...!");

        l1.setSize(200, 25);
        l1.setLocation(350, 100);
        setFont(f);

        t1.setSize(100, 25);
        t1.setLocation(550, 100);
        setFont(f);

        b1.setSize(90, 25);
        b1.setLocation(475, 150);
        setFont(f);

        b2.setSize(90, 25);
        b2.setLocation(150, 225);
        setFont(f);

        t2.setSize(200, 25);
        t2.setLocation(250, 225);
        setFont(f);

        l2.setSize(150, 25);
        l2.setLocation(150, 300);
        setFont(f);

        t3.setSize(80, 25);
        t3.setLocation(310, 300);
        setFont(f);

        l3.setSize(180, 25);
        l3.setLocation(525, 250);
        setFont(f);

        b1.setBackground(Color.pink);
        b2.setBackground(Color.pink);
        // l2.setBackground(Color.BLUE);

        add(l1);
        add(t1);
        add(b1);

        add(b2);
        add(t2);

        add(l2);
        add(t3);
        add(l3);

    }

    public static void main(String ar[]) {
        Queue fr = new Queue();
        fr.setSize(700, 400);
        fr.setVisible(true);
        fr.setTitle("Queue Element");
    }
}
