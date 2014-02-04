package RateMyClass;
import javax.swing.*;   

public class RateView {
  static String questionOne = RateQuestions.question();
  
  // Create the GUI and show it. 
  
  private static void createAndShowGUI() {
    
    //Create and set up the window.
    JFrame frame = new JFrame("Rate My Class");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Add the "Hello World" label.
    JLabel label = new JLabel(RateQuestions.question());
    frame.getContentPane().add(label);
    
    //Display the window.
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGUI();
      }
    });
  }
}
