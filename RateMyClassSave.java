package RateMyClass;
import java.util.ArrayList;

public class RateMyClassSave {
  private static ArrayList<String> allCourses = new ArrayList<String>();
  public static ArrayList<String> sendBack = new ArrayList<String>();
  private static ArrayList<Double> question1 = new ArrayList<Double>();
  private static ArrayList<Double> question2 = new ArrayList<Double>();
  private static ArrayList<Double> question3 = new ArrayList<Double>();
  private static ArrayList<Double> question4 = new ArrayList<Double>();
  private static int index = 0;
  private static ArrayList<Integer> numEntries1 = new ArrayList<Integer>();
  private static ArrayList<Integer> numEntries2 = new ArrayList<Integer>();
  private static ArrayList<Integer> numEntries3= new ArrayList<Integer>();
  private static ArrayList<Integer> numEntries4 = new ArrayList<Integer>();
  public static Boolean isCourse = false;
  
  public RateMyClassSave() {
    
  }
  public static void defaulting () {
    sendBack.add(RateMyClassDriver.courseQuestion);
    // MATH: 0-13
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nMATH -------\n"));
    allCourses.add(new String("algebra 1"));
    allCourses.add(new String("geometry"));
    allCourses.add(new String("geometry h."));
    allCourses.add(new String("algebra 2"));
    allCourses.add(new String("algebra 2 h."));
    allCourses.add(new String("pre-calculus"));
    allCourses.add(new String("advanced pre-calculus"));
    allCourses.add(new String("advanced pre-calculus h."));
    allCourses.add(new String("ap calculus ab"));
    allCourses.add(new String("ap calculus bc"));
    allCourses.add(new String("differential calculus"));
    allCourses.add(new String("intro to computer science"));
    allCourses.add(new String("ap computer science"));
    
    //SCIENCE 14-24
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nSCIENCE -------\n"));
    allCourses.add(new String("biology"));
    allCourses.add(new String("biology h."));
    allCourses.add(new String("ap biology"));
    allCourses.add(new String("chemistry"));
    allCourses.add(new String("chemistry h."));
    allCourses.add(new String("ap chemistry"));
    allCourses.add(new String("physics"));
    allCourses.add(new String("physics h."));
    allCourses.add(new String("ap physics 1/2"));
    allCourses.add(new String("ap physics c"));
    
    //ENGLISH 25-44
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nENGLISH -------\n"));
    allCourses.add(new String("English 1AB"));
    allCourses.add(new String("English 2AB"));
    allCourses.add(new String("American Lit: American Voices"));
    allCourses.add(new String("American Lit: Jazz Age"));
    allCourses.add(new String("American Lit: Nature"));
    allCourses.add(new String("American Lit: Dreams and Disillusion"));
    allCourses.add(new String("American Lit: Writing the Self"));
    allCourses.add(new String("American Lit: American Studies"));
    allCourses.add(new String("American Lit Honors"));
    allCourses.add(new String("Arts and Letters"));
    allCourses.add(new String("The Bible as Literature"));
    allCourses.add(new String("British Literature"));
    allCourses.add(new String("Buddhist Philosophy and the Game of Go"));
    allCourses.add(new String("Composition"));
    allCourses.add(new String("Creative Writing"));
    allCourses.add(new String("Crime and Punishment"));
    allCourses.add(new String("Fiction and Film"));
    allCourses.add(new String("Journalsim"));
    allCourses.add(new String("Science Fiction"));
    
    //SOCIAL STUDIES 45-59
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nSOCIAL STUDIES -------\n"));
    allCourses.add(new String("ISS"));
    allCourses.add(new String("Contemporary Issues"));
    allCourses.add(new String("World Civilizations"));
    allCourses.add(new String("Hawaiian Culture"));
    allCourses.add(new String("Hawaiian Culture 2"));
    allCourses.add(new String("Medieval History"));
    allCourses.add(new String("Asian History"));
    allCourses.add(new String("US History"));
    allCourses.add(new String("AP US History"));
    allCourses.add(new String("AP US Government and Politics"));
    allCourses.add(new String("European History"));
    allCourses.add(new String("European History Through the Arts"));
    allCourses.add(new String("AP European History"));
    allCourses.add(new String("CapSEEDS"));
    
    //ART 60-76
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nART -------\n"));
    allCourses.add(new String("Drawing 1"));
    allCourses.add(new String("Drawing 2"));
    allCourses.add(new String("Life Drawing"));
    allCourses.add(new String("Painting 1"));
    allCourses.add(new String("Painting 2"));
    allCourses.add(new String("Printmaking"));
    allCourses.add(new String("Color Digital Photography"));
    allCourses.add(new String("Black and White Film"));
    allCourses.add(new String("Photography 2"));
    allCourses.add(new String("Digital Art"));
    allCourses.add(new String("Digital Video"));
    allCourses.add(new String("Ceramics: Handbuilding"));
    allCourses.add(new String("Ceramics: Wheel Throwing 1"));
    allCourses.add(new String("Ceramics: Wheel Throwing 2"));
    allCourses.add(new String("Glass Blowing 1"));
    allCourses.add(new String("Glass Blowing 2"));
    
    //PE 77-88
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nPE -------\n"));
    allCourses.add(new String("Lifetime Fitness"));
    allCourses.add(new String("ISPE: Basic Yoga Plus"));
    allCourses.add(new String("ISPE: Field Sports"));
    allCourses.add(new String("ISPE: Indoor Sports"));
    allCourses.add(new String("ISPE: PEP"));
    allCourses.add(new String("ISPE: Racquetball/Tennis"));
    allCourses.add(new String("ISPE: Water Sports"));
    allCourses.add(new String("ISPE: Yoga 1"));
    allCourses.add(new String("ISPE: Yoga 2"));
    allCourses.add(new String("ASPE"));
    
    //CHINESE 89-98
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nCHINESE -------\n"));
    allCourses.add(new String("Chinese 1"));
    allCourses.add(new String("Chinese 2"));
    allCourses.add(new String("Chinese 2H"));
    allCourses.add(new String("Chinese 3"));
    allCourses.add(new String("Chinese 3H"));
    allCourses.add(new String("Chinese 4"));
    allCourses.add(new String("Chinese 4H"));
    allCourses.add(new String("Chinese 5"));
    allCourses.add(new String("Chinese 5H"));
    
    //JAPANESE 99-108
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nJAPANESE -------\n"));
    allCourses.add(new String("Japanese 1"));
    allCourses.add(new String("Japanese 2"));
    allCourses.add(new String("Japanese 2H"));
    allCourses.add(new String("Japanese 3"));
    allCourses.add(new String("Japanese 3H"));
    allCourses.add(new String("Japanese 4"));
    allCourses.add(new String("Japanese 4H"));
    allCourses.add(new String("Japanese 5"));
    allCourses.add(new String("Japanese 5H"));
    
    //FRENCH 109-118
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nFRENCH -------\n"));
    allCourses.add(new String("French 1"));
    allCourses.add(new String("French 2"));
    allCourses.add(new String("French 2H"));
    allCourses.add(new String("French 3"));
    allCourses.add(new String("French 3H"));
    allCourses.add(new String("French 4"));
    allCourses.add(new String("French 4H"));
    allCourses.add(new String("French 5"));
    allCourses.add(new String("French 5 AP"));
    
    //SPANISH 119-128
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nSPANISH -------\n"));
    allCourses.add(new String("Spanish 1"));
    allCourses.add(new String("Spanish 2"));
    allCourses.add(new String("Spanish 2H"));
    allCourses.add(new String("Spanish 3"));
    allCourses.add(new String("Spanish 3H"));
    allCourses.add(new String("Spanish 4"));
    allCourses.add(new String("Spanish 4H"));
    allCourses.add(new String("Spanish 5"));
    allCourses.add(new String("Spanish 5H"));
    
    //HAWAIIAN 129-134
    allCourses.add(new String("\n\n\n\n\n\n\n\n\n\n\n\nHAWAIIAN -------\n"));
    allCourses.add(new String("Hawaiian 1"));
    allCourses.add(new String("Hawaiian 2"));
    allCourses.add(new String("Hawaiian 3"));
    allCourses.add(new String("Hawaiian 4"));
    
    //LANGUAGE 135-141
    allCourses.add(new String("LANGUAGE -------\n"));
    allCourses.add(new String("Chinese"));
    allCourses.add(new String("Japanese"));
    allCourses.add(new String("French"));
    allCourses.add(new String("Spanish"));
    allCourses.add(new String("Hawaiian"));
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question1.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);
    question2.add(0.0);;
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question3.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    question4.add(0.0);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries1.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries2.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries3.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    numEntries4.add(1);
    
    RateMyClassSurvey.surveyQuestion1.add("\nSurvey Questions - \n\n\nOn a scale of 1-10, how hard was the course overall?\n");
    RateMyClassSurvey.surveyQuestion2.add("On a scale of 1-10, how much homework did you have for this course?\n");
    RateMyClassSurvey.surveyQuestion3.add("On a scale of 1-10, how engaged did you feel in this course?\n");
    RateMyClassSurvey.surveyQuestion4.add("On a scale of 1-10, how much did you enjoy the class?");
    RateMyClassSurvey.thanksFor.add("Thanks for taking the survey, here on the results for, \b" + RateMyClassSurvey.courseSelected+"\b:"); 
    RateMyClassSurvey.questionFinal.add("");
  }
  
  public static ArrayList<String> getArray(int numberOne,int numberTwo) {
    String tempString = "";
    for (int i = numberOne; i < (numberTwo+1);i++) {     
      tempString = allCourses.get(i);
      sendBack.add(tempString);
    }
    return sendBack;
  }
  
  public static void inputSurvey (int surveyvalue, String course, int questionnum) {
    String bigArray = "";
    int temp;
    if (questionnum == 0) { 
      for (int i = 0; i < allCourses.size()-1; i++) {
        if (allCourses.get(i).equals(course)) {
          index = i;
        }
      }
    }
    else {
      
      double temp2 = average(surveyvalue, questionnum);
      
      question1.set(index,temp2);
      
      temp = numEntries1.get(index) + 1;
      numEntries1.set(index, temp);
    }
    System.out.println(question1.get(0));
    
  }
  
  public static ArrayList<String> outputSurvey (int surveyValue1,int surveyValue2,int surveyValue3,int surveyValue4) {
    ArrayList<String> output = new ArrayList<String>();
    
    output.add("AVERAGES FOR ALL SELECTED COURSE (1-10)\n\n");
    
    output.add("QUESTION 1: On a scale of 1-10, how hard was/is the course overall?\n"+ question1.get(index));
    
    output.add("\nQUESTION 2: On a scale of 1-10, how much homework did/do you have for this course?\n"+ question2.get(index));
    
    output.add("\nQUESTION 3: On a scale of 1-10, how engaged did/do you feel in this course?\n"+ question3.get(index));
    
    output.add("\nQUESTION 4: On a scale of 1-10, how much did you enjoy the class?\n"+ question4.get(index));
    return output;
  }
  
  public static double average(int surveyValue, int questionnum) {
    double tempNum = 1;
    double tempNum2 = 1;
    double tempNum3 = 1;
    if (questionnum == 1) {
      tempNum = question1.get(index);
      System.out.println(tempNum);
      tempNum2 = (tempNum)*(numEntries1.get(index));
      System.out.println(tempNum2);
      tempNum3 = (tempNum2+ surveyValue)/numEntries1.get(index);
      System.out.println(tempNum3);
      question1.set(index, tempNum3);
      
      
    }
    else if (questionnum == 2) {
      tempNum = question2.get(index);
      tempNum2 = tempNum*numEntries2.get(index);
      tempNum3 = (tempNum2+ surveyValue)/numEntries2.get(index);
      question2.set(index,tempNum3);
    }
    else if (questionnum == 3) {
      tempNum = question3.get(index);
      tempNum2 = tempNum*numEntries3.get(index);
      tempNum3 = (tempNum2+ surveyValue)/numEntries3.get(index);
      question3.set(index,tempNum3);
    }
    else if (questionnum == 4) {
      tempNum = question4.get(index);
      tempNum2 = tempNum*numEntries4.get(index);
      tempNum3 = (tempNum2+ surveyValue)/numEntries4.get(index);
      question4.set(index,tempNum3);
    }
    return tempNum3;
    
    
  }
  public static void isCourseTrue (String text) {
    text = text.toLowerCase();
    for (int p = 0; p < allCourses.size()-1; p++) {
      if (allCourses.get(p).equals(text)) {
        isCourse = true;
      }
      else {}
    }
  }
}



