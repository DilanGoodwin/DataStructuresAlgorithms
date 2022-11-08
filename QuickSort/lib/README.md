# Code

```
package lib;

/**
 * QuickSort
 * 
 * Implementation of the Quick sort algorithm within Java programming language
 */
public class QuickSort {
  /**
   * sort
   * @param arrayValues - array of values passed to the method
   * @param startArray - the start index position of the array
   * @param endArray - the end index position of the array
   * @return - ordered array of values returned to program
   * Uses an implementation of the Quick sort algorithm to organise the passed array of values before returning it back to the program
   * It uses a recursive form of method to organise the array before returning it to the program
   */
  public static int[] sort(int[] arrayValues,int startArray,int endArray){
    if(startArray < endArray){
      int pivot=partition(arrayValues,startArray,endArray);
      sort(arrayValues,startArray,pivot-1);
      sort(arrayValues,pivot+1,endArray);
    }
    return arrayValues;
  }

  /**
   * partition
   * @param arrayValues - array of values passed to the method
   * @param startArray - the start index position of the array
   * @param endArray - the end index position of the array
   * @return - index position of middle of the passed array
   * This method changes the position of values within the array and then returns the pointer value for the middle of the array
   * This method is semi recursive as it does not call itself but as it is a method that is only used by the sort method
   * whenever the sort method calls itself the partition method is also called along with it
   */
  private static int partition(int[] arrayValues,int startArray,int endArray){
    int pivot=arrayValues[endArray];
    int i=startArray;

    for(int j=startArray;j<=endArray-1;j++){
      if(arrayValues[j]<=pivot){
        System.out.println(arrayValues[i]+", "+arrayValues[j]);
        int tmp=arrayValues[i];
        arrayValues[i]=arrayValues[j];
        arrayValues[j]=tmp;
        i++;
      }
    }
    System.out.println(arrayValues[i]+", "+arrayValues[endArray]);
    int tmp=arrayValues[i];
    arrayValues[i]=arrayValues[endArray];
    arrayValues[endArray]=tmp;
    return i;
  }

}
```