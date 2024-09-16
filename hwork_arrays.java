import java.util.Arrays;

public class hwork_arrays {

    // Method to calculate the sum of the array elements
    public static int sum(int arr[]) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        return sum;
    }

    // Method to calculate the product of the array elements
    public static int product(int arr[]) {

        int product = 1;

        for (int i = 0; i < arr.length; i++) {

            product *= arr[i];
        }

        return product;
    }

    // method to swap max and min number of an array

    public static void swap(int arr[], int max, int min) {
        int temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };

        int func1 = sum(arr);
        int func2 = product(arr);
        System.out.println("sum of array elements :"+func1);
        System.out.println("product of array elements :"+func2);

        int smallIndex = 0;
        int largeIndex = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < arr[smallIndex]) {
                smallIndex = i;
            }
            if (arr[i] > arr[largeIndex]) {
                largeIndex = i;
            }

        }

        swap(arr, smallIndex, largeIndex);

        System.out.println("swapping max and min array elements: "+Arrays.toString(arr));


         /*
         * another way to write same thing
         * int max = Integer.MIN_VALUE;
         * int min = Integer.MAX_VALUE;
         * 
         * 
         * 
         * int idxmax = 0;
         * int idxmin = 0;
         * 
         * for(int i = 0; i < arr.length;i++){
         * if(arr[i]< min){
         * min = arr[i];
         * idxmin = i;
         * }
         * 
         * if(arr[i]> max){
         * max = arr[i];
         * idxmax = i;
         * }
         * }
         * 
         * 
         * 
         * // Print the maximum and minimum values and their indices
         * System.out.println("Max value: " + max + ", Min value: " + min);
         * System.out.println("Index of max: " + idxmax + ", Index of min: " + idxmin);
         * 
         * // Swap the maximum and minimum values in the array
         * swap(arr, idxmax, idxmin);
         * 
         * // Print the array after swapping
         * System.out.println("Array after swapping: " + Arrays.toString(arr));
         * 
         * 
         * 
         * 
         */

    }
}
