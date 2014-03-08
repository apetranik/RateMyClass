// Rate My Class Driver
package RateMyClass;
import java.util.ArrayList;

public class RateMyClassDriver {
  public static String courseQuestion = "Which Course area do you want? \n\nMath,  Science,  English, Social Studies,  Art, or P.E.?\n\n\n\n\n** Please use same spelling as words on screen";
  public static int surveyNumber = 0;
  public static ArrayList<String> endSurvey = new ArrayList<String>();
  public static String levelText = "";

  
  // runs the RateView Class
  public static void main(String[] args) {
    RateMyClassSave.defaulting();
    endSurvey.add("Thanks for filling out the survey");
    String[] arguments = new String[] {"test"};
    RateMyClassView.main(arguments); //runs view -- main method from RateView class
  }
  // takes user input text from RateMyClassView and returns an ArrayList of strings to display
  public static ArrayList<String> getText(String newText) {  
    return RateMyClassSurvey.pickSubject(newText);
  }
}


