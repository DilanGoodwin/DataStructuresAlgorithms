package lib;

public class BubbleSort {
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
