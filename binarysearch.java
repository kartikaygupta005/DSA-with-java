import java.util.Arrays;

public class binarysearch {

    public static int element(int arrayss[], int key) {
        Arrays.sort(arrayss);   // sort first

        int start = 0;
        int end = arrayss.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // ✅ safe calculation

            if (arrayss[mid] == key) {
                return mid;
            } 
            else if (arrayss[mid] < key) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arrayss[] = {1, 5, 8, 6, 7, 9, 41, 7, 6, 52, 4, 5, 8};
        int key = 41;

        System.out.println("Element found at index: " + element(arrayss, key));
    }
}