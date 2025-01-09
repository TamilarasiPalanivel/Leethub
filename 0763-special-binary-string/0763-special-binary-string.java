import java.util.*;

class Solution {
    public String makeLargestSpecial(String s) {
        if (s.length() <= 2) return s;
        
        List<String> specialStrings = new ArrayList<>();
        int count = 0;  
        int start = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;
            
            if (count == 0) {
                String inner = makeLargestSpecial(s.substring(start + 1, i));
                specialStrings.add("1" + inner + "0");
                start = i + 1;
            }
        }
        
        specialStrings.sort(Collections.reverseOrder());
        
        StringBuilder result = new StringBuilder();
        for (String str : specialStrings) {
            result.append(str);
        }
        
        return result.toString();
    }
}
