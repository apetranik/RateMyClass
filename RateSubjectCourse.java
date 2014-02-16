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

public class RateSubjectCourse { //deals w/ stuff
  //will hold information from the surveys. 
  //and course selection
  
  public static String mathCourses = "\nMATH\n-----------------------------\n\nAlg 1 \nGeometry \nGeometry H. \nAlg 2 \nAlg 2 H. \nPre-Calc \nAdv. Pre-Calc \nAdv. Pre-Calc H. \nAP Calc AB \nAP Calc BC \nDiff. Calc\nIntro to Computer Science\nAP Computer Science";
  public static String scienceCourses = "\nSCIENCE\n-----------------------------\n\nBiology\nBiology H.\nAP Bio\nChemistry\nChemistry H.\nAP Chem\nPhysics\nPhysics H.\nAP Physics 1 & 2\nAP Physics C";
  public static String englishCourses = "\nENGLISH\n-----------------------------\n\nEnglish 1AB\nEnglish 2AB\nAmerican Lit";
  public static String socialCourses = "\nSOCIAL STUDIES\n-----------------------------\n\nISS\nContemp. Issues\nWorld Civ.\nHawaiian Culture\nMedieval History\nAsian History\nUS History\nAP US History\nEuropean History\nAP European History"; 
  public static String languageCourses = "\nLANGUAGE\n-----------------------------\n\nChinese\nJapanese\nFrench\nSpanish\nHawaiian";
  public static String artCourses = "\nart\n-----------------------------\n";
  public static String peCourses = "\nPE\n-----------------------------\n";
  public static String chineseCourses = "\nCHINESE\n-----------------------------\n\nMandarin 1\nMandarin 2\nMandarin 2 H.\nMandarin 3\nMandarin 3 H.\nMandarin 4\nMandarin 4 H.\nMandarin 5\nMandarin 5 H.";
  public static String japaneseCourses = "\nJAPANESE\n-----------------------------\n\nJapanese 1\nJapanese 2\nJapanese 2 H.\nJapanese 3\nJapanese 3 H.\nJapanese 4\nJapanese 4 H.\nJapanese 5\nJapanese 5 H.";
  public static Boolean language = false;
  public static int level = 1;
  public static String pickedSubject = "";
  
  
  public RateSubjectCourse() {
  }
  
  public static String pickSubject(String text) { 
    
    String newText = text;
    
    if (language) {
      pickedSubject = (pickLanguage(newText));
    }
    
    else if (newText.equals("math")) {
      pickedSubject = (mathCourses);
      level = 2;
      
    }
    else if (newText.equals("science")) {
      pickedSubject = (scienceCourses);
      
    }
    else if (newText.equals("english")) {
      pickedSubject = (englishCourses);
    }
    else if (newText.equals("social studies")) {
      pickedSubject = (socialCourses);
    }
    else if (newText.equals("language")) {
      pickedSubject = (languageCourses);
      language = true;
    }
    
    else if (newText.equals("art")) {
      pickedSubject = (artCourses);
      
    }
    else if (newText.equals("pe")) {
      pickedSubject = (peCourses);
    }
    else {}
    return pickedSubject;
  }
  
//picks a language
  public static String pickLanguage(String text) {
    String newText = text;
    if (newText.equals("chinese")) {
      pickedSubject = (chineseCourses);
      language = false;
      level = 2;
    }
    
    else if (newText.equals("japanese")) {
      pickedSubject = (japaneseCourses);
      language = false;
      level = 2;
    }
    else {
      
    }
    return pickedSubject;
  }
  public void survey() {
    //runs survey
  }
  
}

/* else if (newText.equals("chinese") && language == true) {
 textArea.setText("\nCHINESE\n-----------------------------\n");
 textArea.append(RateDriver.languageChinese);   
 language = false;
 }
 else if (newText.equals("japanese") && language == true) {
 textArea.setText("\nJAPANESE\n-----------------------------\n");
 textArea.append(RateDriver.languageJapanese);
 }
 */
