import javax.swing.*;
public class index{
   public static void main(String[] args) {
       // Create a JFrame instance
       JFrame frame = new JFrame("Frame Example");
       // Set frame properties
       frame.setSize(400, 300); // Width: 400, Height: 300
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null); // No layout manager
       // Add a button to the frame
       JButton button = new JButton("Click Me");
       button.setBounds(150, 100, 100, 50); // x, y, width, height
       frame.add(button);
       // Make the frame visible
       frame.setVisible(true);
   }
}