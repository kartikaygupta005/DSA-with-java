class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stacks = new Stack<>();
        Stack<Character> stackt = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stacks.isEmpty()) {
                    stacks.pop();
                }
            } else {
                stacks.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!stackt.isEmpty()) {
                    stackt.pop();
                }
            } else {
                stackt.push(t.charAt(i));
            }
        }

        return stacks.equals(stackt);
    }
}