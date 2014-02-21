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

public class RateSurvey { //deals w/ stuff
  //will hold information from the surveys. 
  
  
  public static String questionOne[] = new String[] {"\nSurvey Questions\n","On a scale of 1-10, how hard was/is the course overall?"};
  public static String questionTwo[] = new String[] {"On average, how much homework did/do you have for this course?"};
  public static String questionThree[] = new String[] {"On a scale of 1-10, how engaged did/do you feel in this course?"};
  public static String questionFour[] = new String[] {"On a scale of 1-10, how much did you enjoy the class?"};
  public static String questionFive[] = new String[] {"Would you recommend this course to someone else?"};
  public static boolean survey = false;
  public static boolean languagebarrier = true;
  public static int level = 1;
  public static String math[] = new String[] {"MATH\n---------------------","Algebra 1","Geometry","Geometry H","Algebra 2","Algebra 2 H","Pre-Calculus","Advanced Pre-Calculus","Advanced Pre-Calculus H","AP Calculus AB","AP Calculus BC","Differential Calculus","Intro to Computer Science","AP Computer Science"}; //13
  public static String science[] = new String[] {"SCIENCE\n---------------------","Biology","Biology H.","AP Biology","Chemistry","Chemistry H.","AP Chemistry","Physics","Physics H","AP Physics 1/2","AP Physics C"}; //10
  public static String english[] = new String[] {"ENGLISH\n---------------------","English 1AB","English 2AB","American Lit: American Voices","American Lit: Jazz Age","American Lit: Nature","American Lit: Dreams and Disillusion","American Lit: Writing the Self","American Lit: American Studies","American Lit Honors","Arts and Letters","The Bible as Literature","British Literature","Buddhist Philosophy and the Game of Go","Composition","Creative Writing","Crime and Punishment","Fiction and Film","Journalsim","Science Fiction"}; //19
  public static String social[] = new String[] {"SOCIAL STUDIES\n---------------------","ISS","Contemporary Issues","World Civilizations","Hawaiian Culture","Hawaiian Culture 2","Medieval History","Asian History","US History","AP US History","AP US Government and Politics","European History","European History Through the Arts","AP European History","CapSEEDS"}; //14
  public static String language[] = new String[] {"LANGUAGE\n---------------------","Chinese","Japanese","French","Spanish","Hawaiian"};
  public static String art[] = new String[] {"ART\n---------------------","Drawing 1","Drawing 2","Life Drawing","Painting 1","Painting 2","Printmaking","Color Digital Photography","Black and White Film","Photography 2","Digital Art","Digital Video","Ceramics: Handbuilding","Ceramics: Wheel Throwing 1","Ceramics: Wheel Throwing 2","Glass Blowing 1","Glass Blowing 2"}; //16
  public static String pe[] = new String[] {"PE\n---------------------","Lifetime Fitness","ISPE: Basic Yoga Plus","ISPE: Field Sports","ISPE: Indoor Sports","ISPE: PEP","ISPE: Raquetball/Tennis","ISPE: Water Sports","ISPE: Yoga 1","ISPE: Yoga 2","ASPE"}; //10
  public static String chinese[] = new String[] {"CHINESE\n---------------------","Chinese 1","Chinese 2","Chinese 2H","Chinese 3","Chinese 3H","Chinese 4","Chinese 4H","Chinese 5","Chinese 5H"}; //9
  public static String japanese[] = new String[] {"JAPANESE\n---------------------","Japanese 1","Japanese 2","Japanese 2H","Japanese 3","Japanese 3H","Japanese 4","Japanese 4H","Japanese 5","Japanese 5H"}; //9
  public static String french[] = new String[] {"FRENCH\n---------------------","French 1","French 2","French 2H","French 3","French 3H","French 4","French 4H","French 5","French 5 AP"}; //9
  public static String spanish[] = new String[] {"SPANISH\n---------------------","Spanish 1","Spanish 2","Spanish 2H","Spanish 3","Spanish 3H","Spanish 4","Spanish 4H","Spanish 5","Spanish 5H"}; //9
  public static String hawaiian[] = new String[] {"HAWAIIAN\n---------------------","Hawaii 1","Hawaiian 2","Hawaiian 3","Hawaiian 4"}; //4
  
  
  public RateSurvey() {
  }
  
  public static String[] pickSubject(String text) {     
    String newText = text.toLowerCase();
    if (newText.equals("math")) {
      RateDriver.levelText = newText;
      level++;
      return math;
    }
    else if (newText.equals("science")) {
      RateDriver.levelText = newText;
      level++;
      return science;
    }
    else if (newText.equals("english")) {
      RateDriver.levelText = newText;
      level++;
      return english;
    }
    else if (newText.equals("language")) {

      level = 1;
      languagebarrier = true;
      return language;
    }
    else if (newText.equals("social studies")) {
      RateDriver.levelText = newText;
      level++;
      return social;
    }
    else if (newText.equals("art")) {
      RateDriver.levelText = newText;
      level++;
      return art;
    }
    else if (newText.equals("pe")) {
      RateDriver.levelText = newText;
      level++;
      return pe;
    }
    else if (newText.equals("chinese") && languagebarrier == true) {
      RateDriver.levelText = newText;
      level++;
      return chinese;
    }
    else if (newText.equals("japanese") && languagebarrier == true) {
      RateDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return japanese;
    }
    else if (newText.equals("french") && languagebarrier == true) {
      RateDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return french;
    }
    else if (newText.equals("spanish") && languagebarrier == true) {
      RateDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return spanish;
    }
    else if (newText.equals("hawaiian") && languagebarrier == true) {
      RateDriver.levelText = newText;
      level++;
      languagebarrier = false;
      return hawaiian;
    }
    else { 
      return null;
    }
    
  }
  public static void surveySave(String newText) {
    String courseID;
    int rating;
    if (RateDriver.surveyNumber == 1) {
      courseID = newText;
    }
    else {
      rating = Integer.parseInt(newText); 
    }
  }
  
  public static String[] surveyQuestion(String newText) {

    if (RateDriver.surveyNumber == 1) return questionOne;
    
    else if (RateDriver.surveyNumber == 2) return questionTwo;
    
    else if (RateDriver.surveyNumber == 3) return questionThree;
    
    else if (RateDriver.surveyNumber == 4) return questionFour;
    
    else if (RateDriver.surveyNumber == 5) return questionFive;   
    
    else return null;
  }
}


