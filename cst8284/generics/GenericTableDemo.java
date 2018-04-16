/**
 * 
 */
package cst8284.generics;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//import cst8284.solidObject.Circle;
//import cst8284.solidObject.Rectangle;
//import cst8284.solidObject.Square;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Apr 16, 2018  
 */
public class GenericTableDemo {
  
  private static String[] myStrings = {"myString",new String("myString"),"myString"};
  private static ArrayList<BasicShape> basicShapes = new ArrayList<>();
  private static ArrayList<SolidObject> solidObjects = new ArrayList<>();
  
  public GenericTableDemo() {
  }
  
  public static void main(String[] args) {
    
    Table tb = new Table();
    
    // Integers
    // tb.displayEqualityTable(new ArrayList<Integer>(Arrays.asList(1,2,2,1)));

    // Strings 
    // tb.displayEqualityTable(new ArrayList<String>(Arrays.asList( myStrings )));
    
    // BasicShapes
    /*
    basicShapes.add(new Circle(3));
    basicShapes.add(new Square(6));
    basicShapes.add(new Rectangle(10, 9));
    basicShapes.add(new Rectangle(3, 6));
    tb.displayEqualityTable(basicShapes);
    */
    
    // SolidObjects 
    solidObjects.add(new SolidObject<BasicShape>(new Circle(3), 5));
    solidObjects.add(new SolidObject<BasicShape>(new Rectangle(10, 9), 2));
    solidObjects.add(new SolidObject<BasicShape>(new Rectangle(3, 6), 10));
    solidObjects.add(new SolidObject<BasicShape>(new Square(6)));
    tb.displayEqualityTable(solidObjects);
    
  }

}
