import java.util.Arrays;

public class SortingAlgorithms {
//Selection sort on an Array
    public static void selectionSort(int[] arr) {
        //Length of the array
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < n; j++) {
                //if smaller, update the index
                if (arr[j] < arr[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            //if smaller not in lowest, swap
            if (lowestIndex != i) {
                swap(arr, i, lowestIndex);
            }
        }
    }

//Two given indices in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//Test the selection sort algorithm
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 9, 4, 7, 6};
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
