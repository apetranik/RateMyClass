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
  
  public RateMyClassSurvey() {
    surveyQuestions.add("\nSurvey Questions\n");
    surveyQuestions.add("On a scale of 1-10, how hard was/is the course overall?");
    surveyQuestions.add("On average, how much homework did/do you have for this course?");
    surveyQuestions.add("On a scale of 1-10, how engaged did/do you feel in this course?");
    surveyQuestions.add("On a scale of 1-10, how much did you enjoy the class?");
    surveyQuestions.add("Would you recommend this course to someone else?");
  }
  
  public static ArrayList pickSubject(String text) {     
    String newText = text.toLowerCase();
    if (newText.equals("math")) {
      RateMyClassDriver.levelText = newText;
      level++;
      return RateMyClassSave.getArray(0,12);
    }
    else if (newText.equals("science")) {
      RateMyClassDriver.levelText = newText;
      level++;
      return RateMyClassSave.getArray(13,22);
    }
    else if (newText.equals("english")) {
      RateMyClassDriver.levelText = newText;
      level++;
      return RateMyClassSave.getArray(23,41);
    }
    else if (newText.equals("language")) {
      
      level = 1;
      languagebarrier = true;
      return RateMyClassSave.getArray(122,126);
    }
    else if (newText.equals("social studies")) {
      RateMyClassDriver.levelText = newText;
      level++;
      return RateMyClassSave.getArray(42,55);
    }
    else if (newText.equals("art")) {
      RateMyClassDriver.levelText = newText;
      level++;
      return RateMyClassSave.getArray(56,71);
    }
    else if (newText.equals("pe")) {
      RateMyClassDriver.levelText = newText;
      level++;
      return RateMyClassSave.getArray(72,81);
    }
    else if (newText.equals("chinese") && languagebarrier == true) {
      RateMyClassDriver.levelText = newText;
      level++;
      return RateMyClassSave.getArray(82,90);
    }
    else if (newText.equals("japanese") && languagebarrier == true) {
      RateMyClassDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return RateMyClassSave.getArray(91,99);
    }
    else if (newText.equals("french") && languagebarrier == true) {
      RateMyClassDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return RateMyClassSave.getArray(100,108);
    }
    else if (newText.equals("spanish") && languagebarrier == true) {
      RateMyClassDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return RateMyClassSave.getArray(109,117);
    }
    else if (newText.equals("hawaiian") && languagebarrier == true) {
      RateMyClassDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return RateMyClassSave.getArray(118,121);
    }
    else { 
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
  
  public static ArrayList surveyQuestion(String newText) {
    
    if (RateMyClassDriver.surveyNumber == 1) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 2) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 3) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 4) return surveyQuestions;
    
    else if (RateMyClassDriver.surveyNumber == 5) return surveyQuestions;   
    
    else return null;
  }
}


