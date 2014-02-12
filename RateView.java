package RateMyClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RateView extends JPanel implements ActionListener {
  public static String courseQuestion = "\n Which Course area do you want? Math, Sciece, English, Social Studies, Art, or P.E.?";
  public static String text; // used to save the text that the user has entered
  protected JTextField textField; // controls the text field - where user types text - is editable
  protected JTextArea textArea; // controls the text Area - where text is displayed
  
  public RateView() {
    super(new GridBagLayout());
    
    textArea = new JTextArea(courseQuestion, 40, 80); // adds a new text area w/ dimensions
    
    textArea.setEditable(false); // doesn't allow the text area to be editable by the user. It just displays text
    
    JScrollPane scrollPane = new JScrollPane(textArea); // allows the text area to be scrolled through. 
    
    textField = new JTextField(80); // adds new text field - where users can type
    
    textField.addActionListener(this); //adds action listener, which allows me to know what the user clicks on or types
    
    
    
    GridBagConstraints gridcon = new GridBagConstraints(); // the window w/ the same dimensions that were specified above 
    gridcon.gridwidth = GridBagConstraints.REMAINDER;
    gridcon.fill = GridBagConstraints.BOTH;    
    gridcon.weightx = 1.0; // allows users to pull the constraints and change the size of the window
    gridcon.weighty = 1.0;
   
    add(scrollPane, gridcon); // allows text area to be displayed
    add(textField, gridcon); // allows text field to be displayed
    
  }
  
  public void actionPerformed(ActionEvent evt) { // controls action listener
    text = textField.getText(); //gets and saves text that the user types in
    
    textField.selectAll();
    
    // textArea.append(text); shows text that u have just typed after u press enter
    
    String newText = text.toLowerCase(); 
    
    // controls what will be displayed for each subject
    if (newText.equals("math")) {
      textArea.append(RateDriver.mathCourses);
    }
    else if (newText.equals("science")) {

      textArea.append(RateDriver.scienceCourses);
    }
    else if (newText.equals("english")) {
      textArea.append(RateDriver.englishCourses);
    }
    else if (newText.equals("social studies")) {
      textArea.append(RateDriver.socialCourses);
    }
    else if (newText.equals("language")) {   
      textArea.append(RateDriver.language1);
      if (textField.equals("chinese")) {
        textArea.append(RateDriver.languageChinese);
      }
    }
    else if (newText.equals("art")) {
      textArea.append(RateDriver.courseSelection);
    }
    else if (newText.equals("pe")) {
      textArea.append(RateDriver.courseSelection);
    }
    
  }
  
  private static void createAndShowGUI() { // creates the GUI
    

    JFrame frame = new JFrame("Rate My Class"); // creates a window and labels it Rate My Class
    // allows all the windows and stuff above to be seen
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new RateView());
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) { // just displays the GUI like in grid world how it has to say "Show grid"
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}