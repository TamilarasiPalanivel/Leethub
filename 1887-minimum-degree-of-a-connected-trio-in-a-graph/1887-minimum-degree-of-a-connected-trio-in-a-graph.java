import java.util.*;

class Solution {
    public int minTrioDegree(int n, int[][] edges) {
        int[][] graph = new int[n + 1][n + 1]; // Adjacency matrix
        int[] degree = new int[n + 1]; // Degree of each node

        // Build graph and compute degree
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph[u][v] = 1;
            graph[v][u] = 1;
            degree[u]++;
            degree[v]++;
        }

        int minDegree = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (graph[i][j] == 1) { 
                    for (int k = j + 1; k <= n; k++) {
                        if (graph[i][k] == 1 && graph[j][k] == 1) { 
                            int trioDegree = degree[i] + degree[j] + degree[k] - 6;
                            minDegree = Math.min(minDegree, trioDegree);
                        }
                    }
                }
            }
        }

        return (minDegree == Integer.MAX_VALUE) ? -1 : minDegree;
    }
}
