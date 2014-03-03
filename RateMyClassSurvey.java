package RateMyClass;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import java.util.ArrayList;

public class RateMyClassSurvey { //deals w/ stuff
  //will hold information from the surveys. 
  
  private static ArrayList<String> surveyQuestions = new ArrayList<String>();
  public static Boolean languagebarrier = false;
  public static int level = 1; //controls the level that the user is on (subject, course)
  private static ArrayList<String> finalArray = new ArrayList<String>();
  private static int firstNumber;
  
  
  public RateMyClassSurvey() {
    surveyQuestions.add("\nSurvey Questions\n");
    surveyQuestions.add("On a scale of 1-10, how hard was/is the course overall?");
    surveyQuestions.add("On average, how much homework did/do you have for this course?");
    surveyQuestions.add("On a scale of 1-10, how engaged did/do you feel in this course?");
    surveyQuestions.add("On a scale of 1-10, how much did you enjoy the class?");
    surveyQuestions.add("Would you recommend this course to someone else?");
  }
  
  public static ArrayList<String> pickSubject(String text) {     
    String newText = text.toLowerCase();
    if (newText.equals("math")) {
      level++;
      finalArray = RateMyClassSave.getArray(0,13);
      RateMyClassDriver.isRight = true;
      firstNumber = 0;
      return finalArray;
      
    }
    else if (newText.equals("science")) {
      level++;
      RateMyClassDriver.isRight = true;
      firstNumber = 14;
      return RateMyClassSave.getArray(14,24);
    }
    else if (newText.equals("english")) {
      level++;
      RateMyClassDriver.isRight = true;
      finalArray = RateMyClassSave.getArray(25,44);
      firstNumber = 25;
      return finalArray;
    }
    else if (newText.equals("language")) {
      level = 1;
      RateMyClassDriver.isRight = true;
      languagebarrier = true;
      firstNumber = 135;
      return RateMyClassSave.getArray(135,141);
    }
    else if (newText.equals("social studies")) {
      level++;
      RateMyClassDriver.isRight = true;
      firstNumber = 45;
      return RateMyClassSave.getArray(45,59);
    }
    else if (newText.equals("art")) {
      level++;
      RateMyClassDriver.isRight = true;
      firstNumber = 60;
      return RateMyClassSave.getArray(60,76);
    }
    else if (newText.equals("pe")) {
      level++;
      RateMyClassDriver.isRight = true;
      firstNumber = 77;
      return RateMyClassSave.getArray(77,88);
    }
    else if (newText.equals("chinese") && languagebarrier == true) {
      level++;
      RateMyClassDriver.isRight = true;
      firstNumber = 89;
      return RateMyClassSave.getArray(89,98);
    }
    else if (newText.equals("japanese") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      RateMyClassDriver.isRight = true;
      firstNumber = 99;
      return RateMyClassSave.getArray(99,108);
    }
    else if (newText.equals("french") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      RateMyClassDriver.isRight = true;
      firstNumber = 109;
      return RateMyClassSave.getArray(109,118);
    }
    else if (newText.equals("spanish") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      RateMyClassDriver.isRight = true;
      firstNumber = 119;
      return RateMyClassSave.getArray(119,128);
    }
    else if (newText.equals("hawaiian") && languagebarrier == true) {
      level++;
      languagebarrier = false;
      RateMyClassDriver.isRight = true;
      firstNumber = 129;
      return RateMyClassSave.getArray(129,134);
    }
    else { 
      RateMyClassDriver.isRight = false;
      return null;
    }
    
  }
  public static void surveySave(String newText) {
    String courseID;
    int rating;
    if (RateMyClassDriver.surveyNumber == 1) {
      courseID = newText;
    }
    else {
      rating = Integer.parseInt(newText); 
    }
  }
  
  public static ArrayList<String> surveyQuestion(String newText) {
    
    if (RateMyClassDriver.surveyNumber == 1) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 2) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 3) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 4) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 5) return surveyQuestions;   
    
    else return null;
  }
  public static int getfirstNumber() {
    return firstNumber;
  }
}


