package RateMyClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class RateView extends JPanel implements ActionListener {
  public static String courseQuestion = RateDriver.courseQuestion;
  public static String text; // used to save the text that the user has entered
  protected JTextField textField; // controls the text field - where user types text - is editable
  protected JTextArea textArea; // controls the text Area - where text is displayed
  Boolean language = false; //controls subset language

  
  public RateView() {
    super(new GridBagLayout());
    
    textArea = new JTextArea(courseQuestion, 20, 80); // adds a new text area w/ dimensions -- args = # rows
    
    textArea.setEditable(false); // doesn't allow the text area to be editable by the user. It just displays text
    
    JScrollPane scrollPane = new JScrollPane(textArea); // allows the text area to be scrolled through. 
    
    textField = new JTextField(80); // adds new text field - where users can type -- arg = # of columns
    textField.addActionListener(this); //adds action listener, which allows me to know what the user clicks on or types
    textArea.setMargin(new Insets(15,20,20,20)); //sets margin
    
    // font
    Font font = new Font("Century Gothic", Font.BOLD,  16);
    textArea.setFont(font);
    textArea.setLineWrap(true); //wraps lines if the window is too small
    
    
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
      textArea.setText("\nMATH\n-----------------------------\n");
      textArea.append(RateDriver.mathCourses);
    }
    else if (newText.equals("science")) {
      textArea.setText("\nSCIENCE\n-----------------------------\n");
      textArea.append(RateDriver.scienceCourses);
    }
    else if (newText.equals("english")) {
      textArea.setText("\nENGLISH\n-----------------------------\n");
      textArea.append(RateDriver.englishCourses);
    }
    else if (newText.equals("social studies")) {
      textArea.setText("\nSOCIAL STUDIES\n-----------------------------\n");
      textArea.append(RateDriver.socialCourses);
    }
    else if (newText.equals("language")) {
      textArea.setText("\nLANGUAGE\n-----------------------------\n");
      language = true;
      textArea.append(RateDriver.language1); 
    }
    
    else if (newText.equals("chinese") && language == true) {
      textArea.setText("\nCHINESE\n-----------------------------\n");
      textArea.append(RateDriver.languageChinese);   
      language = false;
    }
    else if (newText.equals("japanese") && language == true) {
      textArea.setText("\nJAPANESE\n-----------------------------\n");
      textArea.append(RateDriver.languageJapanese);
    }
    
    else if (newText.equals("art")) {
      textArea.setText("\nART\n-----------------------------\n");
      textArea.append(RateDriver.courseSelection);
      
    }
    else if (newText.equals("pe")) {
      textArea.setText("");
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