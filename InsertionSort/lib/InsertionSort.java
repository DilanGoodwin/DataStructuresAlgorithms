package lib;

public class InsertionSort {
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
