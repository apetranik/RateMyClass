package RateMyClass;
import java.awt.*;
import java.util.ArrayList;

public class RateMyClassSave {
  
  public static int[][] survey = new int[6][40];
  public static int[] surveyOne = new int[40];
  public static int[] surveyTwo = new int[40];
  public static int[] surveyThree = new int[40];
  public static int[] surveyFour = new int[40];
  public static int[] surveyFive = new int[40];
  
  public RateMyClassSave() {
    survey[0] = surveyOne;
    survey[1] = surveyTwo;
    survey[2] = surveyThree;
    survey[3] = surveyFour;
    survey[4] = surveyFive;
    
    
  }
  public static int findNumber(String course, int currentQuestion) {
    String newCourse = course.toLowerCase();
    
    if (RateMyClassDriver.levelText.equals("math")) {
      for (int i = 0; i < RateMyClassSurvey.math.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.math[i])) return survey[currentQuestion][i];
      }
    }
    
    else if (RateMyClassDriver.levelText.equals("science")) {
      for (int i = 0; i < RateMyClassSurvey.science.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.science[i])) return survey[currentQuestion][i];
        
      }
    }
    else if (RateMyClassDriver.levelText.equals("english")) {
      for (int i = 0; i < RateMyClassSurvey.english.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.english[i])) return survey[currentQuestion][i];
        
      }
    }
    else if (RateMyClassDriver.levelText.equals("social studies")) {
      for (int i = 0; i < RateMyClassSurvey.social.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.social[i]))  return survey[currentQuestion][i];
      }
    }
    else if (RateMyClassDriver.levelText.equals("art")) {
      for (int i = 0; i < RateMyClassSurvey.art.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.art[i])) return survey[currentQuestion][i];
      } 
    }
    else if (RateMyClassDriver.levelText.equals("pe")) {
      for (int i = 0; i < RateMyClassSurvey.pe.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.pe[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateMyClassDriver.levelText.equals("chinese")) {
      for (int i = 0; i < RateMyClassSurvey.chinese.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.chinese[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateMyClassDriver.levelText.equals("japanese")) {
      for (int i = 0; i < RateMyClassSurvey.japanese.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.japanese[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateMyClassDriver.levelText.equals("french")) {
      for (int i = 0; i < RateMyClassSurvey.french.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.french[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateMyClassDriver.levelText.equals("spanish")) {
      for (int i = 0; i < RateMyClassSurvey.spanish.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.spanish[i])) return survey[currentQuestion][i];
      }
    }
    else if (RateMyClassDriver.levelText.equals("hawaiian")) {
      for (int i = 0; i < RateMyClassSurvey.hawaiian.length-1;i++) {
        if (newCourse.equals(RateMyClassSurvey.hawaiian[i])) return survey[currentQuestion][i];
      }
    }
    return 100;
  }
}

