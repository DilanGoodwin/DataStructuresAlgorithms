package lib;

/**
 * CountingSort
 * Implementation of the counting sort algorithm within the Java programming language
 */
public class CountingSort{
  /**
   * sort
   * @param arrayValues - array values passed to the program
   * @return - sorted array values returned to the program
   * Method takes an unordered list of values and then passes them to the rangeValues method
   * rangeValues method returns a number which is used to create an array of that size
   * Values from original array are the sorted into the secondary array
   * Once organised the values are then moved from the secondary array to primary array in sorted order
   * Returns primary array back to the program
   */
  public static int[] sort(int[] arrayValues){
    int[] sortingArray=new int[rangeValues(arrayValues)];

    for(int i=0;i<arrayValues.length;i++){
      sortingArray[arrayValues[i]]++;
    }

    int sortedPosition=0;

    for(int i=0;i<sortingArray.length;i++){
      while(sortingArray[i]>0){
        arrayValues[sortedPosition]=i;
        sortingArray[i]--;
        sortedPosition++;
      }
    }

    return arrayValues;
  }

  /**
   * rangeValues
   * @param arrayValues - array values passed to program
   * @return - range values within the list 
   * Works out the largest number within the array and then adds 1 to it
   * Returning the value to the method
   */
  private static int rangeValues(int[] arrayValues){
    int largestValue=0;
    for(int i=0;i<arrayValues.length;i++){
      if(arrayValues[i]>largestValue){
        largestValue=arrayValues[i];
      }
    }
    return largestValue+1;
  }
}