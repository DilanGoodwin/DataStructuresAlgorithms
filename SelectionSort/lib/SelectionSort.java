package lib;

/**
 * SelectionSort
 * 
 * Implementation of the Selection sort algorithm within the JAva programming language
 */
public class SelectionSort {
  /**
   * sort
   * @param arrayValues - array of values passed to the method
   * @return - ordered array of values returned to the program
   * Uses an implementation of the selection sort algorithm to organise the passed array of values before returning it back to the program
   */
  public static int[] sort(int[] arrayValues){
    for(int i=0;i<arrayValues.length-1;i++){
      int minIndex=i;
      for(int j=i+1;j<arrayValues.length;j++){
        if(arrayValues[j]<arrayValues[minIndex]){
          minIndex=j;
        }
      }
      int tmp=arrayValues[minIndex];
      arrayValues[minIndex]=arrayValues[i];
      arrayValues[i]=tmp;
    }
    return arrayValues;
  }
}
