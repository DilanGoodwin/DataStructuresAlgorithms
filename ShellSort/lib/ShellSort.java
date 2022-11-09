package lib;

public class ShellSort {
  /**
   * sort
   * @param arrayValues - array values passed to the program
   * @return - sorted array values returned to the program
   * Method calls on other methods to sort the passed array of values 
   * Also decrements the gapSize each iteration then passes it back to the sortGap method
   * Once the array has been sorted returns it to the program
   */
  public static int[] sort(int[] arrayValues){
    if((arrayValues==null)||(arrayValues.length==0)){
      return arrayValues;
    }else{
      int gapSize=gapSequence(arrayValues.length);

      while(gapSize>=1){
        for(int i=0;i<gapSize;i++){
          sortGap(arrayValues,i,gapSize);
        }
        gapSize=(gapSize-1)/3;
      }
    }
    return arrayValues;
  }

  /**
   * sortGap
   * @param arrayValues - array of values passed to the program
   * @param start - start position of the array values passed
   * @param gapSize - interval size of the values to sort
   * Method goes through the passed array of values at the passed interval sizes
   * If the stored values at the accessed position is greater than the values at the original psotion
   * the two values are swapped and the method moves onto the next value at the provided gap value
   */
  private static void sortGap(int[] arrayValues,int start,int gapSize){
    int index=start;

    while(index<arrayValues.length){
      int currentValue=arrayValues[index];
      int j=index-gapSize;

      while((j>=0)&&(arrayValues[j]>=currentValue)){
        arrayValues[j+gapSize]=arrayValues[j];
        j-=gapSize;
      }

      arrayValues[j+gapSize]=currentValue;
      index+=gapSize;
    }
  }

  /**
   * gapSequence
   * @param arrayLength - length of an array
   * @return - interval gap to leave between values
   * Method uses the algorithm h=3*h+1 to calculate the gap interval to leave between each sorted value
   * The calculated value is then returned to the original method
   */
  private static int gapSequence(int arrayLength){
    int gapSize=1;

    while(gapSize<(arrayLength/3)){
      gapSize=(3*gapSize)+1;
    }
    return gapSize;
  }
}
