package RateMyClass;
import java.util.Scanner;

public class RateQuestions {
  
  public static Scanner in = new Scanner(System.in);
  public static String courseQuestion = "Which Course area do you want? Math, Sciece, English, Social Studies, Art, or P.E.?";
  public static String questionOne = "On a scale of 1-10, how hard was/is the course overall?";
  public static String questionTwo = "On average, how much homework did/do you have for this course?";
  public static String questionThree = "On a scale of 1-10, how engaged did/do you feel in this course?";
  public static String questionFour = "On a scale of 1-10, how much did you enjoy the class?";
  public static String questionFive = "Would you recommend this course to someone else?";
  public static int courseNumber;
  public static String course;
  
  public static String question() {
    return questionOne;
    
  }
  public static int courseSelection() {
    course = in.nextLine();
    course = course.toLowerCase();
    if (course.equals("math")) {
      courseNumber = 0;
    }
    else if (course.equals("science")) {
      courseNumber = 1;
    }
    else if (course.equals("english")) {
      courseNumber = 2;
    }
    
    else if (course.equals("social studies")) {
      courseNumber = 3;
    }
    
    else if (course.equals("art")) {
      courseNumber = 4;
    }
    else if (course.equals("pe")) {
      courseNumber = 5;
    }
    return courseNumber;

  }
  
}

