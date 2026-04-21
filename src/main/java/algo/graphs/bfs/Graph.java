package algo.graphs.bfs;

import java.util.*;

public class Graph {
    private int vertices;
    private List<List<Integer>> adj;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            adj.add(new ArrayList<>());
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); //added both ways for undirected edge
    }

    public List<Integer> bfs(int start) {
        //visited[] is not needed in a tree. As there are no cycle,
        //no risk of getting into infinite loops
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return result;
    }

    public List<Integer> dfs(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        visited[start] = true;
        stack.push(start);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            result.add(node);
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        return result;
    }
}
