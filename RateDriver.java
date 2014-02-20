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
  public static String courseQuestion = "Which Course area do you want? \n\nMath,  Science,  English,  Language, Social Studies,  Art, or P.E.?\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n** Please use same spelling as words on screen";
  public static int surveyNumber = 0;
  public static String[] endSurvey = new String[] {"Thanks for filling out the survey!"};
  
  
  
  // runs the RateView Class
  public static void main(String[] args) {
    String[] arguments = new String[] {"test"};
    RateView.main(arguments);  
  }
  
  public static String[] getText(String newText) {  
    if (RateSurvey.level <= 1) {
      RateSurvey.level++;
      return RateSurvey.pickSubject(newText);
    }
    
    else {
      surveyNumber++;
      if (surveyNumber == 5) return endSurvey;
      else {
        RateSurvey.surveySave(newText);
        return RateSurvey.surveyQuestion(newText);
      }
    }
  }

}


