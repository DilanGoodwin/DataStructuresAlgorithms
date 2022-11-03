package lib;

public class SelectionSort {
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
