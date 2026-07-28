import java.util.Arrays;

class Solution {
    public boolean isPalindrome(ListNode head) {
        int[] newArray = new int[100000];

        if (head == null || head.next == null) {
            return true;
        }

        int k = 0;
        while (head != null) {
            newArray[k] = head.val;
            head = head.next;
            k++;
        }

        int[] reversed = new int[k];

        int j = 0;
        for (int i = k - 1; i >= 0; i--) {
            reversed[j] = newArray[i];
            j++;
        }

        return Arrays.equals(reversed, Arrays.copyOf(newArray, k));
    }
}