package RateMyClass;

import java.util.Scanner;

public class RateDriver {
  
  public static Scanner in = new Scanner(System.in);
  public static String courseQuestion = "Which Course area do you want? Math, Sciece, English, Social Studies, Art, or P.E.?";
  public static String questionOne = "On a scale of 1-10, how hard was/is the course overall?";
  public static String questionTwo = "On average, how much homework did/do you have for this course?";
  public static String questionThree = "On a scale of 1-10, how engaged did/do you feel in this course?";
  public static String questionFour = "On a scale of 1-10, how much did you enjoy the class?";
  public static String questionFive = "Would you recommend this course to someone else?";
  public static String courseSelection;
  public static String mathCourses = "\n\n1. Alg 1 \n2. Geometry \n3. Geometry H. \n4. Alg 2 \n5. Alg 2 H. \n6. Pre-Calc \n7. Adv. Pre-Calc \n8. Adv. Pre-Calc H. \n9. AP Calc AB \n10. AP Calc BC \n11. Diff. Calc";
  public static String scienceCourses = "\n\n1. Biology\n2. Biology H.\n3. AP Bio\n4. Chemistry\n5. Chemistry H.\n6. AP Chem\n7. Physics\n8. Physics H.\n9. AP Physics 1 & 2\n10. AP Physics C";
  public static String englishCourses = "\n\n1. English 1AB\n2. English 2AB\n3. American Lit";
  public static String socialCourses = "\n\n1. ISS\n2. Contemp. Issues\n3. World Civ.\n4. Hawaiian Culture\5. Medieval History\n6. Asian History\n7. US History\n8. AP US History\n9. European History\n10. AP European History"; 
  
  
  public static void main(String[] args) {
    String[] arguments = new String[] {"test"};
    RateView.main(arguments);
    
  }
}


