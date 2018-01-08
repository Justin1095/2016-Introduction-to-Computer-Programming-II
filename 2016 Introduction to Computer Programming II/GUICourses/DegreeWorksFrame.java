
/**
 * This program creates a Graphical user interface and is suppose to get four inputs that the users plugs in and gives the user the options to, display the inputs at the bottom, calculate the GPA, reset the input, and reset the output.
  
 * @author Justin Seda
 * April 11, 2016
 */
import java.util.ArrayList;
import javax.swing.*;
import java. awt.event.*;
public class DegreeWorksFrame extends JFrame
{
    private JButton btn;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;

    private JLabel lb;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;

    private JTextField txt;
    private JTextField txt2;
    private JTextField txt3;
    private JTextField txt4;

    private JTextArea output;

    private ArrayList<Course> courseList;

    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 400;

    public DegreeWorksFrame()
    {
        courseList = new ArrayList<Course>();

        txt = new JTextField(30);
        txt.setText("");
        lb = new JLabel("Course Code: "); //Course Code
        txt2 = new JTextField(30);
        txt2.setText("");
        lb2 = new JLabel("Course Name: "); //Course Name
        txt3 = new JTextField(30);
        txt3.setText("");
        lb3 = new JLabel("Course Credit: "); //Course Credit
        txt4 = new JTextField(30);
        txt4.setText("");
        lb4 = new JLabel("Course Grade: "); //Course Grade        

        btn = new JButton("Add Course");//Add Course
        btn2 = new JButton("Calculate GPA");// Calculate gpa
        btn3 = new JButton("Reset Input"); // Reset Input
        btn4 = new JButton("Reset Ouput"); //Reset output

        output = new JTextArea(10, 35);
        JScrollPane pane = new JScrollPane(output);//Output

        ActionListener addCourse = new AddCourseListener();
        btn.addActionListener(addCourse);//Add Course

        ActionListener GPA = new CalGPAListener();
        btn2.addActionListener(GPA);// Calculate gpa

        ActionListener restInput = new RestInputListener();
        btn3.addActionListener(restInput);// Reset Input

        ActionListener restOutput = new RestOutputListener();
        btn4.addActionListener(restOutput);//Reset output

        JPanel p = new JPanel();
        p.add(lb);
        p.add(txt);
        p.add(lb2);
        p.add(txt2);
        p.add(lb3);
        p.add(txt3);
        p.add(lb4);
        p.add(txt4);

        p.add(btn);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);

        p.add(pane);
        add(p);

        output.append("Code\tName\tCredit\tGrade\n" );
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    class AddCourseListener implements ActionListener //Add course
    {
        public void actionPerformed(ActionEvent event)
        {
            String code = txt.getText();
            String name = txt2.getText();
            int credit = Integer.parseInt(txt3.getText());
            String grade = txt4.getText();
            grade = grade.substring(0,1);
            grade = grade.toUpperCase();
            courseList.add(new Course(code, name, credit, grade));
            
            output.append(code + "\t" + name + "\t" + credit + "\t" + grade + "\n"); 
        }
    }

    class CalGPAListener  implements ActionListener //Calculate GPA
    {
        public void actionPerformed(ActionEvent event)
        {
            //Iterate through courseList ArrayList object, and calculate GPA
            int qualityPoints = 0;
            double GPA = 0;
            int totalCredits = 0;

            for (int i = 0; i < courseList.size(); i++)
            {
                Course c = courseList.get(i);
                int credits = c.getCredit();
                totalCredits += credits;
                int grade = 0;
                if(c.getGrade().equals("A"))
                {
                    qualityPoints += credits*4;
                }
                else if (c.getGrade().equals("B"))
                {
                     qualityPoints += credits*3; 
                }
                else if (c.getGrade().equals("C"))
                {
                    qualityPoints += credits* 2; 
                }
               else if (c.getGrade().equals("D"))
               {
                  qualityPoints += credits*1;
                }
                else if (c.getGrade().equals("E"))
                {
                    qualityPoints += credits*0;
                }
                
            }
            GPA = qualityPoints/((double)totalCredits);
            output.append("\n");
            String RoundGPA = String.format("GPA :%.1f\n", GPA);
            output.append( RoundGPA);
        }
    } 

    class RestInputListener implements ActionListener //Reset Input
    {
        public void actionPerformed(ActionEvent event)
        {
            txt.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
        }
    } 

    class  RestOutputListener implements ActionListener //Reset Output
    {
        public void actionPerformed(ActionEvent event)
        {
            output.setText("");
             output.append("Code\tName\tCredit\tGrade\n" );          
             courseList.clear();
        }
    } 

}
