package RateMyClass;
import java.util.ArrayList;

public class RateMyClassSave {
  private static ArrayList<String> allCourses = new ArrayList<String>();
  public static ArrayList<String> sendBack = new ArrayList<String>();
  public RateMyClassSave() {

  }
  public static ArrayList<String> getArray(int numberOne,int numberTwo) {
        
    // MATH: 0-13
    allCourses.add(new String("MATH -------\n"));
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
    allCourses.add(new String("SCIENCE -------\n"));
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
    allCourses.add(new String("ENGLISH -------\n"));
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
    allCourses.add(new String("SOCIAL STUDIES -------\n"));
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
    allCourses.add(new String("ART -------\n"));
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
    allCourses.add(new String("PE -------\n"));
    allCourses.add(new String("Lifetime Fitness"));
    allCourses.add(new String("ISPE: Basic Yoga Plus"));
    allCourses.add(new String("ISPE: Field Sports"));
    allCourses.add(new String("ISPE: Indoor Sports"));
    allCourses.add(new String("ISPE: PEP"));
    allCourses.add(new String("ISPE: Raquetball/Tennis"));
    allCourses.add(new String("ISPE: Water Sports"));
    allCourses.add(new String("ISPE: Yoga 1"));
    allCourses.add(new String("ISPE: Yoga 2"));
    allCourses.add(new String("ASPE"));
    
    //CHINESE 89-98
    allCourses.add(new String("CHINESE -------\n"));
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
    allCourses.add(new String("JAPANESE -------\n"));
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
    allCourses.add(new String("FRENCH -------\n"));
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
    allCourses.add(new String("SPANISH -------\n"));
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
    allCourses.add(new String("HAWAIIAN -------\n"));
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
    
    String tempString = "";
    for (int i = numberOne; i < (numberTwo+1);i++) {     
      tempString = allCourses.get(i);
      sendBack.add(tempString);
    }
    return sendBack;
  }
}

