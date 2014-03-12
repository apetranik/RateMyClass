// Aliya Petranik -- Rate My Class 2014
package RateMyClass;
import java.util.ArrayList;

public class RateMyClassSurvey {
  public static ArrayList<String> surveyQuestion1 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> surveyQuestion2 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> surveyQuestion3 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> surveyQuestion4 = new ArrayList<String>(); // ArrayList of the 5 survey questions
  public static ArrayList<String> thanksFor = new ArrayList<String>();
  private static int surveyNumber1; // holds current value for user input for question 1 on survey
  private static int surveyNumber2;
  private static int surveyNumber3;
  private static int surveyNumber4;
  public static boolean courseDone = false; //keeps track of whether course has been chosen
  public static ArrayList<String> temp = new ArrayList<String>(); //empty empty arraylist for adding to and then returning
  public static ArrayList<String> temp2 = new ArrayList<String>(); //empty empty arraylist for adding to and then returning
  public static boolean isOver = false; //keeps track if user input for survey is over 10
  public static Boolean languagebarrier = false; // controls whether or not the user is in the language menu
  public static Boolean hasSelected = false;  //if user has selected a subject
  public static int firstNumber = 0; // first index for selected subject
  public static int lastNumber = 0; // last index for selected subject
  public static int level = 0; //keeps track of level that user is on -- if they have passed the subject selection level
  public static int surveylevel = 0; //keeps track of survey question number
  public static String courseSelected = ""; //holds the text for the user's selected text
  
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
    // if the user has alread selected a subject and what they typed in is a valid course and it wasn't back --
    else if (hasSelected==true && RateMyClassSave.isCourse == true && !(newText.equals("back"))) {
      if (courseDone) { // if they have selected a course
        String temptext = newText;
        if (isOver == false) { //if what they entered wasn't over 10
          surveylevel++; //add one to the questionnumber
          courseDone = false; //sets course done back to false
        }
        else {}
        return sendSurvey(surveylevel, text); //
      }
      else {
        courseSelected = newText;
        surveylevel++;
        return sendSurvey(surveylevel, courseSelected);
      }
      
      
    }
    // if a subject has already been selected, but what the user typed in was not a course -
    else if (hasSelected == true && RateMyClassSave.isCourse == false && !(newText.equals("back"))) {
      return RateMyClassSave.getArray(firstNumber, lastNumber-1);
    }
    // if the user typed 'back'
    else if (newText.equals("back")) {
      return RateMyClassSave.courseQuestions;
    }
    // if the user tries to type in something random on the home screen
    else {
      return RateMyClassSave.sendBack;
    }
  }
  // takes text and returns correct survey question based on current user level. Also saves user input for survey questions
  public static ArrayList<String> sendSurvey (int lev, String text) {
    //temp arraylist gets filled w/ survey questions
    temp.add("\nSurvey Questions - \n\n\nOn a scale of 1-10, how hard was the course overall?\n");
    temp.add("On a scale from 1-10, how much homework did you have?\n");
    temp.add("On a scale of 1-10, how engaged did you feel in this course?\n");
    temp.add("On a scale of 1-10, how much did you enjoy the class?");
    temp.add("Thanks for taking the survey, here on the results for, \b");
    
    String oldText = "";
    if (lev == 1) { //if user has just selected a course (q. 1)
      RateMyClassSave.isCourseTrue(text); //calls method that checks if what the user typed in was a real course
      
      if (isInteger(text) == false || RateMyClassSave.isCourse) {   // if what the user typed in is text (isInteger == false) and it is a real course
        oldText = text;
        temp2.add(temp.get(0)); // adds first survey question to temp2 arraylist
        RateMyClassSave.inputSurvey(0, oldText, 0); //calls inputSurvey that saves user input. Because the user hasn't inputed anything, it just saves the course string
        return temp2; // returns arraylist w/ 1st survey question
      }
      else {
        return RateMyClassSave.getArray(firstNumber,lastNumber); //if the user didn't type in a course, returns what is already on screen -- list of courses, determined by subject selected (math, science)
      }
    }
    
    else if (lev == 2) {  // if on second question (this is where the user starts inputing numbers)
      
      if (isInteger(text)) { // if what the user inputs is a real number
        surveyNumber1 = Integer.parseInt(text); //then turn that string into a number
        if (surveyNumber1 <= 10) { //if the number is less or equal to 10 (scale of 1-10)
          RateMyClassSave.inputSurvey(surveyNumber1, oldText, 1); //save what the user inputed -- calls inputSurvey()
          temp2.add(temp.get(1)); //add survey question 2 to temp2 arraylist
          isOver = false; //sets isOver back to false just in case the user had typed in a number over 10 earlier
          return temp2; // returns question number 2
        }
        else {
          isOver = true; // if the number was over 10, isOver is set to true
          temp2.clear(); 
          temp2.add(temp.get(0)); //adds question 1, which is current question -- basically doesn't go onto the next question
          return temp2; // returns question number 1
        }
      }
      else return temp2; // this shouldn't ever have to get called, but if it does, it returns empty arraylist;
      
    }
    //same as level == 2
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
    //same as level == 3
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
    //same as level == 4
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
  public static boolean isInteger(String str) {
    try { 
      Integer.parseInt(str); 
    } catch(NumberFormatException e) { 
      return false; // if the string is actually a string
    }
    return true; //if string can be parsed into an int
  }
  
  // checks if what the user typed in is a real subject -- only used on home screen
  public static boolean isSubject(String text) {
    if (text.toLowerCase().equals("math")) return true;
    else if (text.toLowerCase().equals("science")) return true;
    else if (text.toLowerCase().equals("english")) return true;
    else if (text.toLowerCase().equals("social studies")) return true;
    else return false; 
    
  }
  
}





