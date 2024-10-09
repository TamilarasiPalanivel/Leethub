class Solution {
    public int minAddToMakeValid(String s) {
        // Variables to track unbalanced parentheses
        int open = 0, close = 0;
        
        // Iterate through the string
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++; // Found an opening parenthesis
            } else {
                if (open > 0) {
                    open--; // Found a closing parenthesis that matches an opening one
                } else {
                    close++; // Found a closing parenthesis without a match
                }
            }
        }
        
        // Total unbalanced parentheses is the sum of unmatched opening and closing
        return open + close;
    }
}
