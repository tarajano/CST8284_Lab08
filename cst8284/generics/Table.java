/**
 * 
 */
package cst8284.generics;

import java.util.ArrayList;

public class Table {
 
  private static int row, col;
  
  public Table() {
  }
  
  public static <E> void displayEqualityTable(ArrayList<E> arList){

    // Print columns headers
    resetRow();
    resetCol();
    for (E e: arList) {
      System.out.print("  " + getClassSimpleName(e) + getRow());
      incRow();
    }
    System.out.println("");

    
    //  Print out each row,starting with the name of the object
    resetRow();
    resetCol();
    for (E eRow: arList){
      System.out.print(getClassSimpleName(eRow) + getRow() + "  ");
      incRow();
      for (E eCol: arList) {
        System.out.print( eRow.equals(eCol) + "  ");
      }
      System.out.println();
    }
    
  }
  
  private static <E> String getClassSimpleName(E e) {
    return e.getClass().getSimpleName();
  }
  
  private static int getRow() {
    return Table.row;
  }

  private static void incRow() {
    Table.row += 1;
  }
  
  private static void resetRow() {
    Table.row = 0;
  }

  private static void resetCol() {
    Table.col = 0;
  }
  
  private static int getCol() {
    return Table.col;
  }

  private static void incCol() {
    Table.col += 1;
  }

}
