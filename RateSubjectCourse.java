package RateMyClass;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class RateSubjectCourse { //deals w/ stuff
  //will hold information from the surveys. 
  //and course selection
  public static String mathCourses = "\nAlg 1 \nGeometry \nGeometry H. \nAlg 2 \nAlg 2 H. \nPre-Calc \nAdv. Pre-Calc \nAdv. Pre-Calc H. \nAP Calc AB \nAP Calc BC \nDiff. Calc\nIntro to Computer Science\nAP Computer Science";
  public static String scienceCourses = "\nBiology\nBiology H.\nAP Bio\nChemistry\nChemistry H.\nAP Chem\nPhysics\nPhysics H.\nAP Physics 1 & 2\nAP Physics C";
  public static String englishCourses = "\nEnglish 1AB\nEnglish 2AB\nAmerican Lit";
  public static String socialCourses = "\nISS\nContemp. Issues\nWorld Civ.\nHawaiian Culture\nMedieval History\nAsian History\nUS History\nAP US History\nEuropean History\nAP European History"; 
  public static String languageCourses = "\nChinese\nJapanese\nFrench\nSpanish\nHawaiian";
  public static String chineseCourses = "\nMandarin 1\nMandarin 2\nMandarin 2 H.\nMandarin 3\nMandarin 3 H.\nMandarin 4\nMandarin 4 H.\nMandarin 5\nMandarin 5 H.";
  public static String japaneseCourses = "\nJapanese 1\nJapanese 2\nJapanese 2 H.\nJapanese 3\nJapanese 3 H.\nJapanese 4\nJapanese 4 H.\nJapanese 5\nJapanese 5 H.";
  public static String artCourses = "\nJapanese 1\nJapanese 2\nJapanese 2 H.\nJapanese 3\nJapanese 3 H.\nJapanese 4\nJapanese 4 H.\nJapanese 5\nJapanese 5 H.";
  public static String peCourses = "\nJapanese 1\nJapanese 2\nJapanese 2 H.\nJapanese 3\nJapanese 3 H.\nJapanese 4\nJapanese 4 H.\nJapanese 5\nJapanese 5 H.";
  public static Boolean language = false;
  
  public static int level = 1;
  
  
  public RateSubjectCourse() {
  }
  
  public static String pickSubject(String text) {   
    String newText = text;
    String pickedSubject = "";
    if (language) {
      pickedSubject = (pickLanguage(newText));
    }
    
    else if (newText.equals("math")) {
      pickedSubject = ("\nMATH\n-----------------------------\n" + mathCourses);
      level = 2;
      
    }
    else if (newText.equals("science")) {
      pickedSubject = ("\nSCIENCE\n-----------------------------\n" + scienceCourses);
      
    }
    else if (newText.equals("english")) {
      pickedSubject = ("\nENGLISH\n-----------------------------\n" + englishCourses);
    }
    else if (newText.equals("social studies")) {
      pickedSubject = ("\nSOCIAL STUDIES\n-----------------------------\n" + socialCourses);
    }
    else if (newText.equals("language")) {
      pickedSubject = ("\nLANGUAGE\n-----------------------------\n" + languageCourses);
      language = true;
    }
    
    else if (newText.equals("art")) {
      pickedSubject = ("\nART\n-----------------------------\n" + artCourses);
      
    }
    else if (newText.equals("pe")) {
      pickedSubject = ("\nPE\n-----------------------------\n" + peCourses);
    }
    return pickedSubject;
  }
  
//picks a language
  public static String pickLanguage(String text) {
    String newText = text;
    String pickedLanguage = "";
    if (newText.equals("chinese")) {
      pickedLanguage = ("\nCHINESE\n-----------------------------\n" + chineseCourses);
      language = false;
      level = 2;
    }
    
    else if (newText.equals("japanese")) {
      pickedLanguage = ("\nJAPANESE\n-----------------------------\n" + japaneseCourses);
      
    }
    return pickedLanguage;
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
