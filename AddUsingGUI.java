import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
    JLabel l1 = new JLabel("Name:");
    JLabel l2 = new JLabel("Batch:");
    JLabel l3 = new JLabel("Dept.:");
    JButton b1 = new JButton("+");
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JLabel l4 = new JLabel("Result..");

    MyFrame() {
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My First GUI");
        
        // Set layout
        setLayout(new FlowLayout());
        getContentPane().setBackground(new Color(255, 200, 150));

        // Styling labels
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        l2.setFont(new Font("Arial", Font.BOLD, 16));
        l3.setFont(new Font("Arial", Font.BOLD, 16));
        l4.setFont(new Font("Arial", Font.BOLD, 16));

        // Add components
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b1);
        add(l4);

        // Add action listener to button
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            l4.setText("Result: " + (n1 + n2));
        } catch (NumberFormatException ex) {
            l4.setText("Invalid input! Enter numbers.");
        }
    }
}

public class Swing {
    public static void main(String[] args) {
        new MyFrame();
    }
}
