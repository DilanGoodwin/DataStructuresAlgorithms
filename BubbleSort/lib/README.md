# Code
```
package lib;

/**
 * Bubble Sort
 * 
 * Implementation of the Buble sort algirithm within the Java programming language
 */
public class BubbleSort {
  /**
   * sort
   * @param arrayValues - array of values passed to the method
   * @return - ordered array of values returned to program
   * Uses an implementation of the Bubble sort algorithm to organise the passed array of values before returning it back to the program
   */
  public static int[] sort(int[] arrayValues){
    for(int i=0;i<(arrayValues.length-1);i++){
      for(int j=0;j<(arrayValues.length-(1+i));j++){
        if(arrayValues[j]>arrayValues[j+1]){
          int tmp=arrayValues[j+1];
          arrayValues[j+1]=arrayValues[j];
          arrayValues[j]=tmp;
        }
      }
    }
    return arrayValues;
  }
}
```