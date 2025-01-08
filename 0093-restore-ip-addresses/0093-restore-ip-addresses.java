import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> current, List<String> result) {
        if (current.size() == 4) {
            if (start == s.length()) {
                result.add(String.join(".", current)); 
            }
            return;
        }

        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) break; 

            String segment = s.substring(start, start + len);
            if (isValidSegment(segment)) {
                current.add(segment);
                backtrack(s, start + len, current, result);
                current.remove(current.size() - 1); 
            }
        }
    }

    private boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.startsWith("0")) return false;
        int value = Integer.parseInt(segment);
        return value >= 0 && value <= 255;
    }
}
