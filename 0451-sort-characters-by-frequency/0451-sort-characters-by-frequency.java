class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        while (!map.isEmpty()) {

            int value2 = 0;
            char maxChar = ' ';

            for (char ch : map.keySet()) {
                int value1 = map.get(ch);

                if (value1 > value2) {
                    value2 = value1;
                    maxChar = ch;
                }
            }

            for (int i = 0; i < value2; i++) {
                str.append(maxChar);
            }

            map.remove(maxChar);
        }

        return str.toString();
    }
}