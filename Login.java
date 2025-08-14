import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton adminLogin, accountantLogin;

    public Login() {
        // Set up Login GUI with options for Admin and Accountant
        adminLogin = new JButton("Admin Login");
        accountantLogin = new JButton("Accountant Login");

        adminLogin.addActionListener(this);
        accountantLogin.addActionListener(this);

        add(adminLogin);
        add(accountantLogin);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == adminLogin) {
            JOptionPane.showMessageDialog(this, "Admin Login Clicked!");
        } else if (e.getSource() == accountantLogin) {
            showAccountantLogin(); // Call method to handle Accountant Login
        }
    }

    // Method to show Accountant Login form without a separate class
    private void showAccountantLogin() {
        JDialog dialog = new JDialog(this, "Accountant Login", true);
        dialog.setSize(300, 200);
        dialog.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("accountant") && password.equals("1234")) {
                JOptionPane.showMessageDialog(dialog, "Login Successful!");
                dialog.dispose(); // Close the dialog on successful login
            } else {
                JOptionPane.showMessageDialog(dialog, "Invalid credentials!");
            }
        });

        dialog.add(userLabel);
        dialog.add(userField);
        dialog.add(passLabel);
        dialog.add(passField);
        dialog.add(new JLabel()); // Empty space for alignment
        dialog.add(loginButton);

        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
