package RateMyClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.ArrayList;

import java.util.Scanner;

public class RateDriver {
  // lots of instance variables - mostly subjects and courses
  public static Scanner in = new Scanner(System.in);
  public static String courseQuestion = "Which Course area do you want? \n\nMath,  Science,  English,  Language, Social Studies,  Art, or P.E.?\n";
  public static String questionOne = "On a scale of 1-10, how hard was/is the course overall?";
  public static String questionTwo = "On average, how much homework did/do you have for this course?";
  public static String questionThree = "On a scale of 1-10, how engaged did/do you feel in this course?";
  public static String questionFour = "On a scale of 1-10, how much did you enjoy the class?";
  public static String questionFive = "Would you recommend this course to someone else?";
  public static String courseSelection;
  public static ArrayList<String> math = new ArrayList<String>();
  
  // runs the RateView Class
  public static void main(String[] args) {
    
    math.add("test1");
    String[] arguments = new String[] {"test"};
    RateView.main(arguments);

    
  }
  
  public static String getText(String newText) {
    return RateSubjectCourse.pickSubject(newText);
  }
  
  
  
}


