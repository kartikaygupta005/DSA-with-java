import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        char[] original = p.toCharArray();
        Arrays.sort(original);

        List<Integer> positions = new ArrayList<>();

        for (int j = 0; j <= s.length() - p.length(); j++) {

            char[] subString = s.substring(j, j + p.length()).toCharArray();
            Arrays.sort(subString);

            if (Arrays.equals(subString, original)) {
                positions.add(j);
            }
        }

        return positions;
    }
}