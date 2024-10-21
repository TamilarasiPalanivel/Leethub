class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0; // Store the maximum length of substring without repeating characters
        int start = 0;     // Left pointer for the sliding window
        
        // Iterate through the string using the right pointer (end of the window)
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            // If the current character has been seen and its last occurrence is within the window
            if (map.containsKey(currentChar)) {
                // Move the left pointer 'start' to the right of the last occurrence of currentChar
                start = Math.max(start, map.get(currentChar) + 1);
            }
            
            // Update the last seen index of the current character
            map.put(currentChar, end);
            
            // Calculate the length of the current window and update maxLength
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        // Return the maximum length of the substring without repeating characters
        return maxLength;
    }
}