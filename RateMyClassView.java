package RateMyClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;

public class RateMyClassView extends JPanel implements ActionListener {
  public static String courseQuestion = RateMyClassDriver.courseQuestion;
  public static String text; // used to save the text that the user has entered
  protected JTextField textField; // controls the text field - where user types text - is editable
  protected JTextArea textArea; // controls the text Area - where text is displayed
  public static int binder = 0;
  private static ArrayList<String> realArray = new ArrayList<String>();
  
  
  
  public RateMyClassView() {
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
    textArea.setText("");
    String newText = text.toLowerCase(); 
    realArray = RateMyClassDriver.getText(newText);
    int firstNumber = RateMyClassSurvey.getfirstNumber();
    System.out.println(realArray.size()); 
    for (int i = firstNumber; i < realArray.size();i++) {
      textArea.append(realArray.get(i)+"\n");
      System.out.println(i);
    } 
    System.out.println("hi");
  }
  
  
  
  private static void createAndShowGUI() { // creates the GUI
    
    
    JFrame frame = new JFrame("Rate My Class Application"); // creates a window and labels it Rate My Class
    // allows all the windows and stuff above to be seen
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new RateMyClassView());
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