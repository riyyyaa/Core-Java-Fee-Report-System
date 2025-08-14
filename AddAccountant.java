import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddAccountant extends JFrame implements ActionListener {
    JTextField name, email, contact;
    JPasswordField password;
    JButton addButton;

    public AddAccountant() {
        name = new JTextField(15);
        email = new JTextField(15);
        password = new JPasswordField(15);
        contact = new JTextField(15);
        addButton = new JButton("Add Accountant");

        add(new JLabel("Name:"));
        add(name);
        add(new JLabel("Email:"));
        add(email);
        add(new JLabel("Password:"));
        add(password);
        add(new JLabel("Contact:"));
        add(contact);
        add(addButton);

        addButton.addActionListener(this);

        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Add accountant to database (Database interaction code needed here)
        JOptionPane.showMessageDialog(this, "Accountant Added Successfully!");
        this.dispose();
    }
}

