// Aliya Petranik -- Rate My Class 2014
package RateMyClass;
import java.util.ArrayList;

// This class mostly deals with saving survey information and holding course information
public class RateMyClassSave {
  private static ArrayList<String> allCourses = new ArrayList<String>(); // holds all the courses in the application
  public static ArrayList<String> sendBack = new ArrayList<String>(); // used for the purpose of adding to and then returning - so I can call from other classes. 
  private static ArrayList<Double> question1 = new ArrayList<Double>(); //arraylist of data values for question 1 - holds averages for each course
  private static ArrayList<Double> question2 = new ArrayList<Double>();
  private static ArrayList<Double> question3 = new ArrayList<Double>();
  private static ArrayList<Double> question4 = new ArrayList<Double>();
  private static int index = 0; // keeps track of index of user's course
  private static ArrayList<Integer> numEntries1 = new ArrayList<Integer>(); //holds number of times user has takes survey for each course
  private static ArrayList<Integer> numEntries2 = new ArrayList<Integer>();
  private static ArrayList<Integer> numEntries3= new ArrayList<Integer>();
  private static ArrayList<Integer> numEntries4 = new ArrayList<Integer>();
  public static ArrayList<String> courseQuestions = new ArrayList<String>(); // holds original home screen words - used for when the user types 'back'
  public static Boolean isCourse = false; //keeps track if the user has selected a course
  
  // adds all courses to allCourses arraylist
  // holds and defaults values for survey questions and number of entries
  public static void defaulting () { 
    sendBack.add(RateMyClassDriver.courseQuestion);
    // MATH: 0-13
    allCourses.add(new String("MATH -------\n"));
    allCourses.add(new String("Algebra 1"));
    allCourses.add(new String("Geometry"));
    allCourses.add(new String("Geometry h."));
    allCourses.add(new String("Algebra 2"));
    allCourses.add(new String("Algebra 2 h."));
    allCourses.add(new String("Pre-Calculus"));
    allCourses.add(new String("Advanced Pre-Calculus"));
    allCourses.add(new String("Advanced Pre-Calculus H."));
    allCourses.add(new String("AP Calculus AB"));
    allCourses.add(new String("AP Calculus BC"));
    allCourses.add(new String("Differential Calculus"));
    allCourses.add(new String("Intro to Computer Science"));
    allCourses.add(new String("AP Computer Science"));
    
    //SCIENCE 14-24
    allCourses.add(new String("SCIENCE\n------------------\n"));
    allCourses.add(new String("Biology"));
    allCourses.add(new String("Biology H."));
    allCourses.add(new String("AP Biology"));
    allCourses.add(new String("Chemistry"));
    allCourses.add(new String("Chemistry h."));
    allCourses.add(new String("AP Chemistry"));
    allCourses.add(new String("Physics"));
    allCourses.add(new String("Physics H."));
    allCourses.add(new String("AP Physics 1/2"));
    allCourses.add(new String("AP Physics C"));
    
    //ENGLISH 25-44
    allCourses.add(new String("ENGLISH\n------------------\n"));
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
    allCourses.add(new String("Journalism"));
    allCourses.add(new String("Science Fiction"));
    
    //SOCIAL STUDIES 45-59
    allCourses.add(new String("SOCIAL STUDIES\n------------------\n"));
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
    
    courseQuestions.add("Which Course area do you want? \n\nMath,  Science,  English, Social Studies,  Art, or P.E.?\n\n\n\n\n** Please use same spelling as words on screen");
    RateMyClassDriver.empty.add(""); //empty array -- just in case
    
    //defaults question1 values (40 values -- max number of courses)
    for (int k = 0; k < 40;k++) { 
      question1.add(0.0);
      question2.add(0.0);
      question3.add(0.0);
      question4.add(0.0);
    }
    
    for (int k = 1; k < 40;k++) {
      numEntries1.add(1);
      numEntries2.add(1);
      numEntries3.add(1);
      numEntries4.add(1);
    }
  }
  
  //takes 2 indexs and returns arraylist filled with courses between those 2 indexs (eg: math 0-13)
  public static ArrayList<String> getArray(int numberOne,int numberTwo) {
    String tempString = "";
    for (int i = numberOne; i < (numberTwo+1);i++) { //adds to empty arraylist each course for that specific subject (math)
      tempString = allCourses.get(i);
      sendBack.add(tempString);
    }
    return sendBack;
  }
  
  // takes survey info and saves it
  public static void inputSurvey (int surveyvalue, String course, int questionnum) {
    String bigArray = "";
    int temp;
    // if they have just selected a course
    if (questionnum == 0) { 
      //finds the index of the user's course in allCourses
      for (int i = 0; i < allCourses.size()-1; i++) {
        if (allCourses.get(i).equals(course)) {
          index = i;
        }
      }
    }
    // if they are currently filling out the survey, the average their input with the current interval
    else {
      average(surveyvalue, questionnum); 
    }
  }
  
  //is only called when user has typed in answer to last question in survey
  public static ArrayList<String> outputSurvey (int surveyValue1,int surveyValue2,int surveyValue3,int surveyValue4) {
    ArrayList<String> output = new ArrayList<String>(); // final output that holds averages for each question for selected course
    
    output.add("AVERAGES FOR YOUR COURSE\n\nTo start over, type 'back'\n\n");
    output.add("QUESTION 1: On a scale of 1-10, how hard was/is the course overall?\n"+ question1.get(index));   
    output.add("\nQUESTION 2: On a scale of 1-10, how much homework did/do you have for this course?\n"+ question2.get(index));    
    output.add("\nQUESTION 3: On a scale of 1-10, how engaged did/do you feel in this course?\n"+ question3.get(index));    
    output.add("\nQUESTION 4: On a scale of 1-10, how much did you enjoy the class?\n"+ question4.get(index));
    return output;
  }
  
  // averages user input with survey values already in arraylist
  public static void average(int surveyValue, int questionnum) {
    double tempNum = 1;
    double tempNum2 = 1;
    double tempNum3 = 1;
    
    // same for all questions
    if (questionnum == 1) { // if question number 1
      tempNum = question1.get(index); //set tempNum equal to the value first question at the index of the user's selected course
      tempNum2 = (tempNum)*(numEntries1.get(index)); //set tempNum2 = to original x the number of entries -- this way to expands the value so I can add and divide later
      tempNum3 = (tempNum2+ surveyValue)/(numEntries1.get(index)); //sets tempNum3 =( expanded original + user input ) divided by number of entries 
      question1.set(index, tempNum3); //sets the index for the user's course in question 1 equal to the new average
      numEntries1.set(index, numEntries1.get(index) + 1); // adds 1 to number of entries
      
    }
    //same as question 1
    else if (questionnum == 2) {
      tempNum = question2.get(index);
      tempNum2 = (tempNum)*(numEntries2.get(index));
      tempNum3 = (tempNum2+ surveyValue)/(numEntries2.get(index));
      question2.set(index, tempNum3);
      numEntries2.set(index, numEntries2.get(index) + 1);
    }
    else if (questionnum == 3) {
      tempNum = question3.get(index);
      tempNum2 = (tempNum)*(numEntries3.get(index));
      tempNum3 = (tempNum2+ surveyValue)/(numEntries3.get(index));
      question3.set(index, tempNum3);
      numEntries3.set(index, numEntries3.get(index) + 1);
    }
    else if (questionnum == 4) {
      tempNum = question4.get(index);
      tempNum2 = (tempNum)*(numEntries4.get(index));
      tempNum3 = (tempNum2+ surveyValue)/(numEntries4.get(index));
      question4.set(index, tempNum3);
      numEntries4.set(index, numEntries4.get(index) + 1);
    }
  }
  
  // checks to see if the text is a real course in allCourses ArrayList
  // Doesn't have a return type because I call it in the survey class and it crashes sometimes if I call a method and check instead of just a variable. 
  public static void isCourseTrue (String text) {
    text = text.toLowerCase(); //sets to lowercase
    for (int p = 0; p < allCourses.size()-1; p++) { //goes through each index in allCourses arraylist and checks to see if text is equal to any of them
      if (allCourses.get(p).toLowerCase().equals(text)) { // if it does equal true, then sets isCourse boolean to true.
        isCourse = true;
      }
      else {}
    }
  }
}



