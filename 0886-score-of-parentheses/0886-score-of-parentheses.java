class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); 

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int top = stack.pop(); 
                int newTop = stack.pop() + Math.max(2 * top, 1);
                stack.push(newTop); 
            }
        }
        return stack.pop(); 
    }
}
