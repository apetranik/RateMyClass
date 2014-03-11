package RateMyClass;
import java.util.ArrayList;

public class RateMyClassSurvey {
  public static ArrayList<String> surveyQuestion1 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> surveyQuestion2 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> surveyQuestion3 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> surveyQuestion4 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> thanksFor = new ArrayList<String>();
  private static int surveyNumber1;
  private static int surveyNumber2;
  private static int surveyNumber3;
  private static int surveyNumber4;
  public static boolean remember2 = true;
  public static boolean courseDone = false;
  public static ArrayList<String> temp = new ArrayList<String>();
  public static     ArrayList<String>temp2 = new ArrayList<String>();
  public static boolean isOver = false; 
  
  public static Boolean languagebarrier = false; // controls whether or not the user is in the language menu
  public static Boolean hasSelected = false; 
  public static int firstNumber = 0; // first index for selected subject
  public static int lastNumber = 0; // last index for selected subject
  public static int level = 0;
  public static int surveylevel = 0;
  public static String courseSelected = "";
  public static ArrayList<String> questionFinal = new ArrayList<String>();
  
  // returns array of subject courses based on user input
  public static ArrayList<String> pickSubject(String text) {  
    
    String newText = text.toLowerCase(); // takes user input (text) and changes it to lowercase
    RateMyClassSave.isCourseTrue(newText);
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
    
    else if (hasSelected==true && RateMyClassSave.isCourse == true && !(newText.equals("back"))) {
      if (courseDone) {
        String temptext = newText;
        if (isOver == false) {
        surveylevel++;
        courseDone = false;
        }
        else {}
        return sendSurvey(surveylevel, text);
      }
      else {
        courseSelected = newText;
        surveylevel++;
        return sendSurvey(surveylevel, courseSelected);
      }
      
      
    }
    else if (hasSelected == true && RateMyClassSave.isCourse == false && !(newText.equals("back"))) {
      return RateMyClassSave.getArray(firstNumber,lastNumber-1);
    }
    else if (newText.equals("back")) {
      return RateMyClassDriver.courseQuestions;
    }
    else {
      return RateMyClassSave.sendBack;
    }
  }
  
  public static ArrayList<String> sendSurvey (int lev, String text) {
    
    temp.add("\nSurvey Questions - \n\n\nOn a scale of 1-10, how hard was the course overall?\n");
    temp.add("On a scale from 1-10, how much homework did you have?\n");
    temp.add("On a scale of 1-10, how engaged did you feel in this course?\n");
    temp.add("On a scale of 1-10, how much did you enjoy the class?");
    temp.add("Thanks for taking the survey, here on the results for, \b");
    
    
    String oldText = text;
    if (lev == 1) {
      RateMyClassSave.isCourseTrue(text);
      if (isInteger(text) == false || RateMyClassSave.isCourse) {  
        oldText = text;
        int surveyNumber0 = 0;   
        temp2.add(temp.get(0));
        RateMyClassSave.inputSurvey(surveyNumber0, oldText, 0);
        isOver = false;
        return temp2;
      }
      else {
        return RateMyClassSave.getArray(firstNumber,lastNumber);
      }
    }
    else if (lev == 2) {  
      if (isInteger(text)) {
        surveyNumber1 = Integer.parseInt(text);
        if (surveyNumber1 <= 10) {
          RateMyClassSave.inputSurvey(surveyNumber1, oldText, 1);
          temp2.add(temp.get(1));
          isOver = false;
          return temp2; 
        }
        else {
          isOver = true;
          temp2.clear();
          temp2.add(temp.get(0));
          return temp2;
        }
      }
      else return temp2;
      
    }
    else if (lev == 3) {
      if (isInteger(text)) {
        surveyNumber2 = Integer.parseInt(text);
        if (surveyNumber2 <= 10) {
          RateMyClassSave.inputSurvey(surveyNumber2, oldText, 2);
          temp2.add(temp.get(2));
          isOver = false;
          return temp2; 
        }
        else {
          isOver = true;
          temp2.clear();
          temp2.add(temp.get(1));
          
          return temp2;
        }
      }
      else return temp2; 
      
    }
    else if (lev == 4) {  
      if (isInteger(text)) {
        surveyNumber3 = Integer.parseInt(text);  
        if (surveyNumber3 <= 10) {
          RateMyClassSave.inputSurvey(surveyNumber3, oldText, 3);
          temp2.add(temp.get(3));
          isOver = false;
          return temp2;
        }
        else {
          isOver = true;
          temp2.clear();
          temp2.add(temp.get(2));
          return temp2;
        }
      }
      else {
        return temp2;
      }
    }
    else if (lev == 5) {
      if (isInteger(text)) {
        surveyNumber4 = Integer.parseInt(text);
        if (surveyNumber4 <= 10) {
          RateMyClassSave.inputSurvey(surveyNumber4, oldText, 4);
          isOver = false;
          return RateMyClassSave.outputSurvey(surveyNumber1, surveyNumber2, surveyNumber3, surveyNumber4); 
        }
        else {
          isOver = true;
          temp2.clear();
          temp2.add(temp.get(3));
          return temp2;
        }
      }
      else {
        temp2.add(temp.get(3));
        return temp2;
      }
    }
    else return null;
  }
// Checks to see if what the user enter is an int or a string -- returns false if a string, true if an int
  public static boolean isInteger(String s) {
    try { 
      Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
      return false; 
    }
    return true;
  }
  public static boolean isSubject(String text) {
    if (text.toLowerCase().equals("math")) return true;
    else if (text.toLowerCase().equals("science")) return true;
    else if (text.toLowerCase().equals("english")) return true;
    else if (text.toLowerCase().equals("social studies")) return true;
    else return false; 
    
  }
  
}





