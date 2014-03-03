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
  public static ArrayList<String> realArray = new ArrayList<String>();
  public static boolean isRight;
  
  
  
  // runs the RateView Class
  public static void main(String[] args) {
    endSurvey.add("Thanks for filling out the survey");
    String[] arguments = new String[] {"test"};
    RateMyClassView.main(arguments); //runs view -- main method from RateView class
  }
  
  public static ArrayList<String> getText(String newText) {  
    return RateMyClassSurvey.pickSubject(newText);
    
  }
  
}


