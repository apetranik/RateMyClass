// Aliya Petranik -- Rate My Class 2014
// Driver
package RateMyClass;
import java.util.ArrayList;

public class RateMyClassDriver {
  // String with words for default screen of app
  public static String courseQuestion = "Which Course area do you want?  Math,  Science,  English or Social Studies?\n\nType 'back' at any point to return to the start\n\n\n\n\n** Please use same spelling as words on screen";

  public static ArrayList<String> empty = new ArrayList<String>();
  public static Boolean remember = true;
  public static String[] arguments = new String[] {""};
  
  // runs the RateView Class
  public static void main(String[] args) {
    if (remember == true) {
      System.out.println("defaulting");
      RateMyClassSave.defaulting(); // calls method in Save class that defaults values for arraylists that control the courses and adding values for the survey
      remember = false; 
    }
    else {}
    RateMyClassView.main(arguments); //runs view -- main method from RateView class
  }
  
  // takes user input text from RateMyClassView and returns an ArrayList of strings to display
  public static ArrayList<String> getText(String newText) {  
    if (newText.equals("back")) { //if user types 'back', it calls the main method. 
      RateMyClassSurvey.surveylevel = 0; //sets survey level back to 0 so it doesn't start off on a weird question number
      main(arguments); //calls maind method
      return empty;
      
    }
    else {
      return RateMyClassSurvey.pickSubject(newText); // otherwise -- this goes (normal) - returns what to display
    }
    
  }
}


