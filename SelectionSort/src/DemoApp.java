
import lib.SelectionSort;

/**
 * DemoApp
 * Program shows an unorganised list and then a list that has been organised by the selection sort algorithm
 */
public class DemoApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Unsorted Array");
        int[] numbersArray={22,70,40,40,64,60,60,80,55,20};
        for(int i=0;i<numbersArray.length;i++){
            if(i==numbersArray.length-1){
                System.out.print(numbersArray[i]);
            }else{
                System.out.print(numbersArray[i]+", ");
            }
        }

        System.out.println("\n");

        System.out.println("Sorted Array");
        int[] numbersArraySorted=SelectionSort.sort(numbersArray);
        for(int i=0;i<numbersArraySorted.length;i++){
            if(i==numbersArraySorted.length-1){
                System.out.print(numbersArraySorted[i]);
            }else{
                System.out.print(numbersArraySorted[i]+", ");
            }
        }
    }
}
