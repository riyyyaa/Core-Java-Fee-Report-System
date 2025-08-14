import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminSection extends JFrame implements ActionListener {
    JButton addAccountant, viewAccountant, deleteAccountant, logout;

    public AdminSection() {
        addAccountant = new JButton("Add Accountant");
        viewAccountant = new JButton("View Accountant");
        deleteAccountant = new JButton("Delete Accountant");
        logout = new JButton("Logout");

        addAccountant.addActionListener(this);
        viewAccountant.addActionListener(this);
        deleteAccountant.addActionListener(this);
        logout.addActionListener(this);

        add(addAccountant);
        add(viewAccountant);
        add(deleteAccountant);
        add(logout);

        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addAccountant) {
            JOptionPane.showMessageDialog(this, "Add Accountant Clicked!");
        } else if (e.getSource() == viewAccountant) {
            showViewAccountant();
        } else if (e.getSource() == deleteAccountant) {
            showDeleteAccountant();
        } else if (e.getSource() == logout) {
            this.dispose();
        }
    }

    // Method to display View Accountant details
    private void showViewAccountant() {
        JFrame frame = new JFrame("View Accountant");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        String data[][] = {
                {"101", "John Doe", "Finance"},
                {"102", "Jane Smith", "Payroll"},
                {"103", "Alice Brown", "Billing"}
        };
        String column[] = {"ID", "Name", "Department"};

        JTable table = new JTable(data, column);
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method to display Delete Accountant confirmation
    private void showDeleteAccountant() {
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete an accountant?", "Delete Accountant", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Accountant Deleted!");
        }
    }

    public static void main(String[] args) {
        new AdminSection();
    }
}
