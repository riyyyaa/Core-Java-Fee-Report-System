import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;
    JButton login;

    public AdminLogin() {
        // Admin login form setup
        username = new JTextField(15);
        password = new JPasswordField(15);
        login = new JButton("Login");

        login.addActionListener(this);

        add(new JLabel("Username:"));
        add(username);
        add(new JLabel("Password:"));
        add(password);
        add(login);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Check credentials (hardcoded for simplicity; replace with DB call in production)
        if (username.getText().equals("admin") && new String(password.getPassword()).equals("admin123")) {
            new AdminSection();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!");
        }
    }
}
