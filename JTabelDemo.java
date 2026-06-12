import javax.swing.*;
// import javax.swing.
import java.awt.*;

public class JTabelDemo extends JFrame {
    JTabelDemo() {
        String col[][] = { { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" }, { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" }, { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" },
                { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" }, { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" },
                { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" }, { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" },
                { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" }, { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" },
                { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" }, { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" },
                { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" }, { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" },
                { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" }, { "123", "Shubham", "Pune" }, { "345", "Varun", "Nashik" },
                { "567", "Rohan", "Mumbai" },
                { "789", "Pratik", "Dubai" } };
        String name[] = { "ID", "Name", "City" };

        JTable tb = new JTable(col, name);
        Container con = getContentPane();
        JScrollPane sc = new JScrollPane(tb);
        con.add(sc);

    }

    public static void main(String ar[]) {
        JTabelDemo t = new JTabelDemo();
        t.setVisible(true);
        t.setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.setSize(700, 700);
    }

}
