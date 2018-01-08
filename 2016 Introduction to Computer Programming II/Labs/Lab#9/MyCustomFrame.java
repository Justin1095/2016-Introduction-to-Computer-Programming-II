
/**
 * Justin Seda
 * 
 * This program create a simple graphical user interface displaying a button.
 */
import javax.swing.*;
import java.awt.event.*;
public class MyCustomFrame extends JFrame
{
    private JButton button;
    private JLabel label;

    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_LENGTH = 300;

    public MyCustomFrame() 
    {

        createComponents();

    }

    private void createComponents()
    {
        button = new JButton("Click Me!!!");
        label = new JLabel();
        JPanel panel = new JPanel();

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

        panel.add(button);
        panel.add(label);
        add(panel);

        setSize(FRAME_WIDTH, FRAME_LENGTH);
    }

    class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Button was clicked");
        }
    }

}
