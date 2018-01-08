
/**
 * Justin Seda 
 * 
 * This program is similar to lab #9 but the background is red.
 */
import javax.swing.*;
import java.awt.*;
public class Lab10
{
  public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      
      JButton button = new JButton("Click me");
      JLabel label = new JLabel();
      
      JPanel panel = new JPanel();
      panel.add(button);
      panel.add(label);
      panel.setBackground(Color.RED);
      
      frame.add(panel);
      
      final int FRAME_WIDTH = 800;
      final int FRAME_HEIGHT = 800;
      
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setTitle("My Frist Frame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    }
    
}
