package RateMyClass;
import java.util.ArrayList;

public class RateMyClassSurvey {
  private static ArrayList<String> surveyQuestion1 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  private static ArrayList<String> surveyQuestion2 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  private static ArrayList<String> surveyQuestion3 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  private static ArrayList<String> surveyQuestion4 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  private static ArrayList<String> thanksFor = new ArrayList<String>();
  private static int surveyNumber1;
  private static int surveyNumber2;
  private static int surveyNumber3;
  private static int surveyNumber4;
  
  public static Boolean languagebarrier = false; // controls whether or not the user is in the language menu
  public static Boolean hasSelected = false; 
  public static int firstNumber = 0; // first index for selected subject
  public static int lastNumber = 0; // last index for selected subject
  public static int level = 1;
  public static int surveylevel = 0;
  public static String courseSelected = "";
  public static ArrayList<String> questionFinal = new ArrayList<String>();
  
  // sets survey questions
  public RateMyClassSurvey() {
    
  }
  
  // returns array of subject courses based on user input
  public static ArrayList<String> pickSubject(String text) {  
    surveyQuestion1.add("\nSurvey Questions - \n\nOn a scale of 1-10, how hard was/is the course overall?\n");
    surveyQuestion2.add("On a scale of 1-10, how much homework did/do you have for this course?\n");
    surveyQuestion3.add("On a scale of 1-10, how engaged did/do you feel in this course?\n");
    surveyQuestion4.add("On a scale of 1-10, how much did you enjoy the class?");
    thanksFor.add("Thanks for taking the survey, here on the results for, \b" + courseSelected+"\b:"); 
    questionFinal.add("");
    String newText = text.toLowerCase(); // takes user input (text) and changes it to lowercase
    if (newText.equals("math")) { // if the user typed math
      firstNumber = 0; // sets variable to first index number of subject "math"
      lastNumber = 14;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(0,13); //returns getArray method which is an ArrayList of Strings from specified indexes (0,13) in allCourses ArrayList.
    }
    else if (newText.equals("science")) {
      firstNumber = 14;
      lastNumber = 25;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(14,24);
    }
    else if (newText.equals("english")) {
      firstNumber = 25;
      lastNumber = 45;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(25,44);
    }
    else if (newText.equals("language")) {
      languagebarrier = true;
      firstNumber = 135;
      lastNumber = 142;
      
      return RateMyClassSave.getArray(135,141);
    }
    else if (newText.equals("social studies")) {
      firstNumber = 45;
      lastNumber = 60;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(45,59);
    }
    else if (newText.equals("art")) {
      firstNumber = 60;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(60,76);
    }
    else if (newText.equals("pe")) {
      firstNumber = 77;
      lastNumber = 89;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(77,88);
    }
    else if (newText.equals("chinese") && languagebarrier == true) {
      firstNumber = 89;
      lastNumber = 99;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(89,98);
    }
    else if (newText.equals("japanese") && languagebarrier == true) {
      languagebarrier = false;
      firstNumber = 99;
      lastNumber = 109;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(99,108);
    }
    else if (newText.equals("french") && languagebarrier == true) {
      languagebarrier = false;
      firstNumber = 109;
      lastNumber = 119;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(109,118);
    }
    else if (newText.equals("spanish") && languagebarrier == true) {
      languagebarrier = false;
      firstNumber = 119;
      lastNumber = 129;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(119,128);
    }
    else if (newText.equals("hawaiian") && languagebarrier == true) {
      languagebarrier = false;
      firstNumber = 129;
      lastNumber = 135;
      level++;
      hasSelected = true; 
      return RateMyClassSave.getArray(129,134);
    }
    else if (hasSelected) {
      courseSelected = newText; 
      surveylevel++;
      return sendSurvey(surveylevel, newText);
      
    }
    else return RateMyClassSave.sendBack;
  }
  
  public static ArrayList<String> sendSurvey (int lev, String text) {
    if (lev == 1) {
      return surveyQuestion1; 
    }
    else if (lev == 2) {
      surveyNumber1 = Integer.parseInt(text);
      RateMyClassSave.inputSurvey(surveyNumber1, courseSelected, 1);
      return surveyQuestion2; 
    }
    else if (lev == 3) {
      surveyNumber2 = Integer.parseInt(text);
      RateMyClassSave.inputSurvey(surveyNumber2, courseSelected, 2);
      return surveyQuestion3; 
    }
    else if (lev == 4) {
      surveyNumber3 = Integer.parseInt(text);
      RateMyClassSave.inputSurvey(surveyNumber3, courseSelected, 3);
      return surveyQuestion4; 
    }
    else if (lev == 5) {
      System.out.println("hi");
      surveyNumber4 = Integer.parseInt(text);
      RateMyClassSave.inputSurvey(surveyNumber4, courseSelected, 4);
      return RateMyClassSave.outputSurvey(surveyNumber1, surveyNumber2, surveyNumber3, surveyNumber4); 
    }
    else return null;
  }
  

}


// returns the first index number for whatever subject was picked



