import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RateView extends JPanel implements ActionListener {
  public static String courseQuestion = "\n Which Course area do you want? Math, Sciece, English, Social Studies, Art, or P.E.?";
  public static String text;
  protected JTextField textField;
  protected JTextArea textArea;
  
  public RateView() {
    super(new GridBagLayout());
        
    textArea = new JTextArea(courseQuestion, 40, 80);
    
    textArea.setEditable(false);
    
    JScrollPane scrollPane = new JScrollPane(textArea);
    
    textField = new JTextField(80);
    
    textField.addActionListener(this);

  
    GridBagConstraints gridcon = new GridBagConstraints();
    gridcon.gridwidth = GridBagConstraints.REMAINDER;
    
    gridcon.fill = GridBagConstraints.BOTH;
    
    gridcon.weightx = 1.0;
    gridcon.weighty = 1.0;
    
    add(scrollPane, gridcon);
    
    gridcon.fill = GridBagConstraints.HORIZONTAL;
    
    
    
    add(textField, gridcon);
    
  }
  
  public void actionPerformed(ActionEvent evt) { //what happens to the stuff that is typed in
    text = textField.getText();
    textArea.append(text);
    textField.selectAll();
    if (text.equals("math")) {
      System.out.println("it works!"); //just tests to make sure. It does!
    }

  }
 
  private static void createAndShowGUI() {
    // creates a window and calls it Rate My Class at the top
    JFrame frame = new JFrame("Rate My Class");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(new RateView());
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    // just displays the GUI like in grid world how it has to say "Show grid"
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}