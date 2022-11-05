# Code
```
package lib;

/**
 * InsertionSort
 * 
 * Implementation of the Insertion sort algorithm within the Java programming language
 */
public class InsertionSort {
  /**
   * sort
   * @param arrayValues - array of values passed to the method
   * @return - ordered array of values returned to the program
   * Uses an implementation of the insertion sort algorithm to organise the passed array of values before returning it back to the program
   */
  public static int[] sort(int[] arrayValues){
    for(int i=0;i<arrayValues.length;i++){
      int current=arrayValues[i];
      int j=i-1;
      while((j>=0)&&(arrayValues[j]>current)){
        arrayValues[j+1]=arrayValues[j];
        j--;
      }
      arrayValues[j+1]=current;
    }
    return arrayValues;
  }
}
```