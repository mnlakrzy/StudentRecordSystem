import javax.swing.*;
import javax.swing.JOptionPane;

public class index {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Label Example");
        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(20);
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        frame.add(panel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
