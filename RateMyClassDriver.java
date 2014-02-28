package RateMyClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.util.Scanner;

public class RateMyClassDriver {
  // lots of instance variables - mostly subjects and courses
  public static Scanner in = new Scanner(System.in);
  public static String courseQuestion = "Which Course area do you want? \n\nMath,  Science,  English,  Language, Social Studies,  Art, or P.E.?\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n** Please use same spelling as words on screen";
  public static int surveyNumber = 0;
  public static ArrayList<String> endSurvey = new ArrayList<String>();
  public static String levelText = "";
  
  
  
  // runs the RateView Class
  public static void main(String[] args) {
    endSurvey.add("Thanks for filling out the survey");
    String[] arguments = new String[] {"test"};
    RateMyClassView.main(arguments); //runs view -- main method from RateView class
  }
  
  public static ArrayList getText(String newText) {  
    if (RateMyClassSurvey.level <= 1) { // checks level the user is on (subject or course)
      
      if (RateMyClassSurvey.level == 1) { //if they are still on the first level - then continue adding the new text. -- but create a text variable equal to their input that keeps track of what subject they chose.  
        levelText = newText;
        return RateMyClassSurvey.pickSubject(newText); //returns what the pick subject method returns (String[])
      }
      else return RateMyClassSurvey.pickSubject(newText); // if they are not on the first level, then just continue to pick subject w/o changing the levelText variable
    }  
    else {
      surveyNumber++; // start the course survey
      if (surveyNumber == 5) { //if the survey number is 5 (just finished the last question) -- then return the "Thanks for filling out the survey" text
        return endSurvey; 
      }
      
      else { //if they are still filling out the survey 
        RateMyClassSurvey.surveySave(newText); //calls the surveySave method that saves the users input into the array
        return RateMyClassSurvey.surveyQuestion(newText); //then return the array w/ the proper question number in it
      }
    }
  }
  
}


