// java revision(arrays)

import java.util.*;

public class revise_arrays_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = in.nextInt();

        int arr[] = new int[size];

        System.out.println("enter " + size + " elements of your array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        // find smallest || largest (values as well as index)

        int small = Integer.MAX_VALUE; // +infinity
        int large = Integer.MIN_VALUE; // -infinity

        int idxs = 0;
        int idxl = 0;

        for (int i = 0; i < arr.length; i++) {
            // finds min
            if (arr[i] < small) {
                small = arr[i];
                idxs = i;
            }

            // find max
            if (arr[i] > large) {
                large = arr[i];
                idxl = i;
            }

        }

        System.out.println("min value: " + small + " \nmax value: " + large);
        System.out.println("index of min value : " + idxs + "\nindex of max value : " + idxl);



         /*
         * 2nd method using inbuilt Min&Max
         * 
         * for (int i = 0; i < arr.length; i++) {
         * 
         * small = Math.min(small, arr[i]);
         * large = Math.max(large, arr[i]);
         * 
         * }
         * 
         * 
         * System.out.println("min value: " + small + " \nmax value: " + large);
         * 
         * 
         * 
         */
        
    }

}
