import lib.ShellSort;

/**
 * DemoApp
 * Program shows an unorganised list and then a list that has been organised by the shell sort algorithm
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Unsorted Array");
        int[] numbersArray={744, 434, 37, 405, 186, 846, 913, 121, 130, 261, 782, 712, 7, 65, 528, 171, 885, 709, 91, 637, 876, 926, 392, 941, 320, 999, 265, 242, 364, 373, 131, 827, 480, 123, 492, 752, 217, 275, 522, 544, 487, 458, 203, 479, 362, 943, 250, 556, 421, 384, 831, 909, 661, 480, 80, 775, 315, 905, 587, 494, 349, 298, 902, 796, 19, 565, 869, 74, 740, 792, 122, 721, 777, 901, 723, 203, 145, 984, 965, 483, 804, 301, 431, 766, 76, 364, 521, 284, 973, 338, 219, 647, 228, 717, 562, 207, 949, 667, 309, 511, 175, 336, 22, 471, 595, 58, 700, 119, 674, 138, 220, 117, 572, 738, 888, 292, 452, 525, 936, 177, 624, 119, 621, 11, 927, 755, 125, 438, 780, 915, 552, 347, 215, 623, 649, 712, 586, 661, 512, 103, 296, 577, 524, 238, 33, 785, 358, 651, 587, 112, 632, 90, 499, 37, 220, 60, 9, 383, 74, 421, 737, 527, 137, 611, 630, 522, 335, 206, 17, 122, 220, 440, 743, 552, 544, 138, 232, 863, 708, 72, 820, 304, 918, 922, 848, 662, 614, 40, 854, 725, 421, 882, 195, 772, 878, 593, 489, 212, 924, 709};
        for(int i=0;i<numbersArray.length;i++){
            if(i==numbersArray.length-1){
                System.out.print(numbersArray[i]);
            }else{
                System.out.print(numbersArray[i]+", ");
            }
        }

        System.out.println("\n");

        System.out.println("Sorted Array");
        int[] numbersArraySorted=ShellSort.sort(numbersArray);
        for(int i=0;i<numbersArraySorted.length;i++){
            if(i==numbersArraySorted.length-1){
                System.out.print(numbersArraySorted[i]);
            }else{
                System.out.print(numbersArraySorted[i]+", ");
            }
        }
    }
}
