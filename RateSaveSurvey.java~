package RateMyClass;
import java.awt.*;
import java.util.ArrayList;

public class RateSaveSurvey {
  
  public static int[][] survey = new int[6][40];
  public static int[] surveyOne = new int[40];
  public static int[] surveyTwo = new int[40];
  public static int[] surveyThree = new int[40];
  public static int[] surveyFour = new int[40];
  public static int[] surveyFive = new int[40];
  
  public RateSaveSurvey() {
    survey[0] = surveyOne;
    survey[1] = surveyTwo;
    survey[2] = surveyThree;
    survey[3] = surveyFour;
    survey[4] = surveyFive;
    
    
  }
  public static int findNumber(String course, int currentQuestion) {
    String newCourse = course.toLowerCase();
    
    if (RateDriver.levelText.equals("math")) {
      for (int i = 0; i < RateSurvey.math.length-1;i++) {
        if (newCourse.equals(RateSurvey.math[i])) return survey[currentQuestion][i];
      }
    }
    
    else if (RateDriver.levelText.equals("science")) {
      for (int i = 0; i < RateSurvey.science.length-1;i++) {
        if (newCourse.equals(RateSurvey.science[i])) return survey[currentQuestion][i];
        
      }
    }
    else if (RateDriver.levelText.equals("english")) {
      for (int i = 0; i < RateSurvey.english.length-1;i++) {
        if (newCourse.equals(RateSurvey.english[i])) return survey[currentQuestion][i];
        
      }
    }
    else if (RateDriver.levelText.equals("social studies")) {
      for (int i = 0; i < RateSurvey.social.length-1;i++) {
        if (newCourse.equals(RateSurvey.social[i]))  return survey[currentQuestion][i];
      }
    }
    else if (RateDriver.levelText.equals("art")) {
      for (int i = 0; i < RateSurvey.art.length-1;i++) {
        if (newCourse.equals(RateSurvey.art[i])) return survey[currentQuestion][i];
      } 
    }
    else if (RateDriver.levelText.equals("pe")) {
      for (int i = 0; i < RateSurvey.pe.length-1;i++) {
        if (newCourse.equals(RateSurvey.pe[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateDriver.levelText.equals("chinese")) {
      for (int i = 0; i < RateSurvey.chinese.length-1;i++) {
        if (newCourse.equals(RateSurvey.chinese[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateDriver.levelText.equals("japanese")) {
      for (int i = 0; i < RateSurvey.japanese.length-1;i++) {
        if (newCourse.equals(RateSurvey.japanese[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateDriver.levelText.equals("french")) {
      for (int i = 0; i < RateSurvey.french.length-1;i++) {
        if (newCourse.equals(RateSurvey.french[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateDriver.levelText.equals("spanish")) {
      for (int i = 0; i < RateSurvey.spanish.length-1;i++) {
        if (newCourse.equals(RateSurvey.spanish[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateDriver.levelText.equals("hawaiian")) {
      for (int i = 0; i < RateSurvey.hawaiian.length-1;i++) {
        if (newCourse.equals(RateSurvey.hawaiian[i])) return survey[currentQuestion][i];
      }
    }
    return 100;
  }
}

