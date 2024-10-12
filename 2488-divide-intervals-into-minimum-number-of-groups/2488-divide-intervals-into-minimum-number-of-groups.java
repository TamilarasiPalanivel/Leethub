import java.util.*;

class Solution {
    public int minGroups(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1] + 1; 
            map.put(start, map.getOrDefault(start, 0) + 1);
            map.put(end, map.getOrDefault(end, 0) - 1);     
        }

        int maxGroups = 0, activeGroups = 0;
        for (int event : map.values()) {
            activeGroups += event; 
            maxGroups = Math.max(maxGroups, activeGroups); 
        }

        return maxGroups; 
    }
}
