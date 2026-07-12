class Solution {
    public void reverseString(char[] s) {
        char[] new_array = new char[s.length];

        int j = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            new_array[j] = s[i];
            j++;
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = new_array[i];
        }
    }
}