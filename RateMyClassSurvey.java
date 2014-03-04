package RateMyClass;
import java.util.ArrayList;

public class RateMyClassSurvey {
  private static ArrayList<String> surveyQuestions = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static Boolean languagebarrier = false; // controls whether or not the user is in the language menu
  public static int level = 1; // controls the level that the user is on (subject, course)
  public static int firstNumber = 0; // first index for selected subject
  public static int lastNumber = 0; // last index for selected subject
  
  // sets survey questions
  public RateMyClassSurvey() {
    surveyQuestions.add("\nSurvey Questions\n");
    surveyQuestions.add("On a scale of 1-10, how hard was/is the course overall?");
    surveyQuestions.add("On average, how much homework did/do you have for this course?");
    surveyQuestions.add("On a scale of 1-10, how engaged did/do you feel in this course?");
    surveyQuestions.add("On a scale of 1-10, how much did you enjoy the class?");
    surveyQuestions.add("Would you recommend this course to someone else?");
  }
  
  // returns array of subject courses based on user input
  public static ArrayList<String> pickSubject(String text) {  
    
    String newText = text.toLowerCase(); // takes user input (text) and changes it to lowercase
    if (newText.equals("math")) { // if the user typed math
      level++; // add one to the level counter
      firstNumber = 0; // sets variable to first index number of subject "math"
      lastNumber = 14;
      return RateMyClassSave.getArray(0,13); //returns getArray method which is an ArrayList of Strings from specified indexes (0,13) in allCourses ArrayList.
    }
    else if (newText.equals("science")) {
      level++;
      firstNumber = 14;
      lastNumber = 25;
      return RateMyClassSave.getArray(14,24);
    }
    else if (newText.equals("english")) {
      level++;
      firstNumber = 25;
      lastNumber = 45;
      return RateMyClassSave.getArray(25,44);
    }
    else if (newText.equals("language")) {
      level = 1;
      languagebarrier = true;
      firstNumber = 135;
      lastNumber = 142;
      return RateMyClassSave.getArray(135,141);
    }
    else if (newText.equals("social studies")) {
      level++;
      firstNumber = 45;
      lastNumber = 60;
      return RateMyClassSave.getArray(45,59);
    }
    else if (newText.equals("art")) {
      level++;
      firstNumber = 60;
      return RateMyClassSave.getArray(60,76);
    }
    else if (newText.equals("pe")) {
      level++;
      firstNumber = 77;
      lastNumber = 89;
      return RateMyClassSave.getArray(77,88);
    }
    else if (newText.equals("chinese") && languagebarrier == true) {
      level++;
      firstNumber = 89;
      lastNumber = 99;
      return RateMyClassSave.getArray(89,98);
    }
    else if (newText.equals("japanese") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      firstNumber = 99;
      lastNumber = 109;
      return RateMyClassSave.getArray(99,108);
    }
    else if (newText.equals("french") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      firstNumber = 109;
      lastNumber = 119;
      return RateMyClassSave.getArray(109,118);
    }
    else if (newText.equals("spanish") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      firstNumber = 119;
      lastNumber = 129;
      return RateMyClassSave.getArray(119,128);
    }
    else if (newText.equals("hawaiian") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      firstNumber = 129;
      lastNumber = 135;
      return RateMyClassSave.getArray(129,134);
    }
    else { 
      return null;
    }
    
  }
  
  /* public static ArrayList<String> surveyQuestion(String newText) {
   if (RateMyClassDriver.surveyNumber == 1) return surveyQuestions;
   else if (RateMyClassDriver.surveyNumber == 2) return surveyQuestions;
   else if (RateMyClassDriver.surveyNumber == 3) return surveyQuestions;
   else if (RateMyClassDriver.surveyNumber == 4) return surveyQuestions;
   else if (RateMyClassDriver.surveyNumber == 5) return surveyQuestions;   
   else return null;
   }  */
  
  
  // returns the first index number for whatever subject was picked
  public static int getfirstNumber() {
    return firstNumber;
  }
}


