import lib.CountingSort;

/**
 * DemoApp
 * Program shows an unorganised list and then a list that has been organised by the counting sort algorithm
 */
public class DemoApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Unsorted Array");
        int[] numbersArray={0, 2, 7, 7, 7, 7, 7, 7, 6, 8, 9, 1, 7, 9, 4, 7, 0, 1, 6, 3};
        for(int i=0;i<numbersArray.length;i++){
            if(i==numbersArray.length-1){
                System.out.print(numbersArray[i]);
            }else{
                System.out.print(numbersArray[i]+", ");
            }
        }

        System.out.println("\n");

        System.out.println("Sorted Array");
        int[] numbersArraySorted=CountingSort.sort(numbersArray);
        for(int i=0;i<numbersArraySorted.length;i++){
            if(i==numbersArraySorted.length-1){
                System.out.print(numbersArraySorted[i]);
            }else{
                System.out.print(numbersArraySorted[i]+", ");
            }
        }
    }
}
