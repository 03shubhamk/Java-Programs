import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// <applet code= "ListSelection" width=700 height=800> </applet>

public class ListSelection extends Applet implements ActionListener {
    Button b1;
    List li1, li2;
    TextArea ta;
    TextField t1, t2;
    Choice ch;

    public void init() {
        setLayout(null);
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
        Font f2 = new Font("Times New Roman", Font.PLAIN, 20);

        setBackground(Color.LIGHT_GRAY);

        Label l1 = new Label("Select Operating System : ");
        l1.setFont(f1);
        Label l2 = new Label("Select Browsers : ");
        l2.setFont(f1);
        Label l3 = new Label("Select Country : ");
        l3.setFont(f1);
        Label l4 = new Label("Selected Operating System : ");
        l4.setFont(f1);
        Label l5 = new Label("Selected Browsers : ");
        l5.setFont(f1);
        Label l6 = new Label("Selected Country : ");
        l6.setFont(f1);

        t1 = new TextField();
        t1.setFont(f2);
        t2 = new TextField();
        t2.setFont(f2);

        ta = new TextArea(5, 15);
        ta.setFont(f2);

        ch = new Choice();

        li1 = new List(7, false);
        li1.setFont(f2);
        li2 = new List(7, true);
        li2.setFont(f2);

        b1 = new Button("Fetch");
        b1.setFont(f1);

        l1.setBounds(100, 100, 270, 30);
        l1.setBackground(Color.LIGHT_GRAY);
        li1.setBounds(100, 150, 200, 150);
        li1.add("Windows");
        li1.add("MacOs");
        li1.add("Ubantu");
        li1.add("Linux");
        li1.add("Android");
        li1.add("iOS");
        li1.add("FreeBSD");
        li1.add("Solaris");
        li1.add("MS-DOS");

        l2.setBounds(500, 100, 250, 30);
        l2.setBackground(Color.LIGHT_GRAY);
        li2.setBounds(500, 150, 200, 150);
        li2.add("Chrome");
        li2.add("Opera");
        li2.add("Edge");
        li2.add("Brave");
        li2.add("Arc");
        li2.add("Internet Explorer");
        li2.add("Safari");
        li2.add("Firefox");

        l3.setBounds(900, 100, 250, 30);
        l3.setBackground(Color.LIGHT_GRAY);
        ch.setBounds(900, 150, 200, 150);
        ch.add("--Select Country--");
        ch.add("India");
        ch.add("United States");
        ch.add("Brazil");
        ch.add("Russia");
        ch.add("Japan");
        ch.add("China");
        ch.add("Africa");

        b1.setBounds(500, 350, 250, 40);
        b1.setBackground(Color.pink);

        l4.setBounds(100, 420, 280, 30);
        l4.setBackground(Color.LIGHT_GRAY);
        t1.setBounds(100, 470, 200, 40);

        l5.setBounds(500, 420, 250, 30);
        l5.setBackground(Color.LIGHT_GRAY);
        ta.setBounds(500, 470, 200, 150);

        l6.setBounds(900, 420, 250, 30);
        l6.setBackground(Color.LIGHT_GRAY);
        t2.setBounds(900, 470, 200, 40);

        b1.addActionListener(this);

        add(l1);
        add(li1);

        add(l2);
        add(li2);

        add(l3);
        add(ch);

        add(b1);

        add(l4);
        add(t1);

        add(l5);
        add(ta);

        add(l6);
        add(t2);
    }

    public void actionPerformed(ActionEvent ae) {
        String s1 = li1.getSelectedItem();
        String[] selectedItems = li2.getSelectedItems();

        StringBuilder selectedItemsText = new StringBuilder();

        String s2 = ch.getSelectedItem();

        for (String item : selectedItems) {
            selectedItemsText.append(item.toString()).append("\n");
        }
        t1.setText(s1);
        t2.setText(s2);
        ta.setText(selectedItemsText.toString());
    }
}