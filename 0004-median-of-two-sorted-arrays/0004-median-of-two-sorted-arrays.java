import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int len = nums1.length + nums2.length;
        int[] newArray = new int[len];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            newArray[k++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            newArray[k++] = nums2[i];
        }
        Arrays.sort(newArray);
        return median(newArray, len);
    }
    private double median(int[] newArray, int len) {

        if (len % 2 != 0) {
            return newArray[len / 2];
        } else {
            return (newArray[len / 2 - 1] + newArray[len / 2]) / 2.0;
        }
    }
}