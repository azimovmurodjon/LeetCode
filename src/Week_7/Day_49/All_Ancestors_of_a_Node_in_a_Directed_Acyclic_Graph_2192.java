package Week_7.Day_49;

import java.util.*;

public class All_Ancestors_of_a_Node_in_a_Directed_Acyclic_Graph_2192 {
    // Create necessary class variables.
    private int numVertices; // Number of vertices in the graph
    private List<Integer>[] graph; // Adjacency list representation of graph
    private List<List<Integer>> ancestors; // List to store ancestors for each node

    /**
     * Method to find all ancestors of each node in a directed graph.
     *
     * @param n     The number of nodes in the graph.
     * @param edges An array of directed edges in the graph.
     * @return A list of lists containing all ancestors of each node.
     */
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        // Initialize the graph representation and the ancestor list.
        numVertices = n;
        graph = new List[n];
        Arrays.setAll(graph, i -> new ArrayList<>());
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }
        ancestors = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            ancestors.add(new ArrayList<>());
        }

        // Perform a breadth-first search for each node.
        for (int i = 0; i < n; ++i) {
            bfs(i);
        }
        return ancestors;
    }

    /**
     * Helper method to perform breadth-first search.
     *
     * @param startVertex The starting vertex for BFS.
     */
    private void bfs(int startVertex) {
        Deque<Integer> queue = new ArrayDeque<>(); // Queue for managing BFS traversal
        queue.offer(startVertex);
        boolean[] visited = new boolean[numVertices]; // Keep track of visited vertices
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int adjacentNode : graph[currentNode]) {
                // If the adjacent node hasn't been visited yet,
                // mark it as visited, add it to the queue,
                // and record the current node as its ancestor.
                if (!visited[adjacentNode]) {
                    visited[adjacentNode] = true;
                    queue.offer(adjacentNode);
                    ancestors.get(adjacentNode).add(startVertex);
                }
            }
        }
    }
}
