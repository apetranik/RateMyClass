// Aliya Petranik -- Rate My Class 2014

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
  private static int counter = 0;
  
  
  
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
  // MOST IMPORTANT PART OF CLASS
  public void actionPerformed(ActionEvent evt) { // controls action listener which is called when the user types something in 
    text = textField.getText(); //gets and saves text that the user types in
    textField.selectAll();
    String newText = text.toLowerCase(); // sets text to lowercase 
    realArray.clear();
    realArray = RateMyClassDriver.getText(newText); //sets empty arraylist to equal what method getText returns
    textArea.setText(" "); //clears screen
    // only gets called for the first thing that the user types in becaues index 0 won't get deleted and it holds the text on the home screen. 
    if (counter == 0 && RateMyClassSurvey.isSubject(newText) == true) {
      for (int i = 1; i < realArray.size(); i++) {
        textArea.append(realArray.get(i)+"\n");
      } 
      counter++;
    }
    // displays all other text other than after user's first input
    else {
      // 
      for (int i = 0; i < realArray.size(); i++) {
        textArea.append(realArray.get(i)+"\n"); //goes through realArray and add it to the screen
      } 
    }
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
        createAndShowGUI(); //just runs GUI -- just needs to show it. 
      } 
    });
  }
}
