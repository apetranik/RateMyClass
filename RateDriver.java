package RateMyClass;

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
  public static String mathCourses = "\nAlg 1 \nGeometry \nGeometry H. \nAlg 2 \nAlg 2 H. \nPre-Calc \nAdv. Pre-Calc \nAdv. Pre-Calc H. \nAP Calc AB \nAP Calc BC \nDiff. Calc";
  public static String scienceCourses = "\nBiology\nBiology H.\nAP Bio\nChemistry\nChemistry H.\nAP Chem\nPhysics\nPhysics H.\nAP Physics 1 & 2\nAP Physics C";
  public static String englishCourses = "\nEnglish 1AB\nEnglish 2AB\nAmerican Lit";
  public static String socialCourses = "\nISS\nContemp. Issues\nWorld Civ.\nHawaiian Culture\nMedieval History\nAsian History\nUS History\nAP US History\nEuropean History\nAP European History"; 
  public static String language1 = "\nChinese\nJapanese\nFrench\nSpanish\nHawaiian";
  public static String languageChinese = "\nMandarin 1\nMandarin 2\nMandarin 2 H.\nMandarin 3\nMandarin 3 H.\nMandarin 4\nMandarin 4 H.\nMandarin 5\nMandarin 5 H.";
  public static String languageJapanese = "\nJapanese 1\nJapanese 2\nJapanese 2 H.\nJapanese 3\nJapanese 3 H.\nJapanese 4\nJapanese 4 H.\nJapanese 5\nJapanese 5 H.";
  
  // runs the RateView Class
  public static void main(String[] args) {
    String[] arguments = new String[] {"test"};
    RateView.main(arguments);
    
  }
}


