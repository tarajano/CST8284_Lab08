/**
 * 
 */
package cst8284.generics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Manuel Alonso Tarajano (tarajano@gmail.com)
 * Apr 16, 2018  
 */
public class GenericTableDemo {
  
//  static ArrayList arList;
  
  public GenericTableDemo() {
  }
  
  public static void main(String[] args) {
    
    Table tb = new Table();
    
    // Integers
    tb.displayEqualityTable(new ArrayList<Integer>(Arrays.asList(1,2,2,1)));
    
  }

}
