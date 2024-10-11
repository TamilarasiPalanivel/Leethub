import java.util.*;

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        
        // Step 1: Prepare a list of friends with their arrival and leaving times.
        int[][] friends = new int[n][3];  // [arrival, leaving, index]
        for (int i = 0; i < n; i++) {
            friends[i] = new int[] {times[i][0], times[i][1], i};
        }
        
        // Step 2: Sort friends by arrival time.
        Arrays.sort(friends, (a, b) -> a[0] - b[0]);
        
        // Step 3: Use a min-heap to track available chairs (smallest first).
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.add(i);  // Initially all chairs are available.
        }
        
        // Step 4: Use another min-heap to track when friends leave and their chairs become free.
        // This heap stores pairs (leavingTime, chairNumber).
        PriorityQueue<int[]> leavingFriends = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        // Step 5: Process each friend based on their arrival time.
        for (int[] friend : friends) {
            int arrivalTime = friend[0];
            int leavingTime = friend[1];
            int friendIndex = friend[2];
            
            // Free chairs of friends who have already left by the current arrival time.
            while (!leavingFriends.isEmpty() && leavingFriends.peek()[0] <= arrivalTime) {
                availableChairs.add(leavingFriends.poll()[1]);
            }
            
            // Allocate the smallest available chair to the current friend.
            int assignedChair = availableChairs.poll();
            
            // If this is the target friend, return their chair number.
            if (friendIndex == targetFriend) {
                return assignedChair;
            }
            
            // Record when this friend will leave and free their chair.
            leavingFriends.add(new int[] {leavingTime, assignedChair});
        }
        
        // This line should not be reached as targetFriend is guaranteed to exist.
        return -1;
    }
}
