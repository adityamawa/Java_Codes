public class linearSearch {

    public static int lsearch(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 2, 7, 8, 1, 2, 5 };
        int target = 5;

        int ans = lsearch(arr, target);
        if (ans == -1) {
            System.out.println("target not found !!");
        } else {
            System.out.println("index of target : " + ans);

        }

    }

}
