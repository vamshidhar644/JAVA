package practices;

import java.util.*;

public class ConnectedSum {

    public static void main(String[] args) {
        int graph_nodes = 4;
        List<Integer> graph_from = Arrays.asList(1, 1);
        List<Integer> graph_to = Arrays.asList(2, 4);

        int result = connectedSum(graph_nodes, graph_from, graph_to);
        System.out.println(result);
    }

    static int connectedSum(int graph_nodes, List<Integer> graph_from, List<Integer> graph_to) {
        // Create an adjacency list to represent the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= graph_nodes; i++) {
            adjList.add(new ArrayList<>());
        }

        // Build the adjacency list
        for (int i = 0; i < graph_from.size(); i++) {
            adjList.get(graph_from.get(i)).add(graph_to.get(i));
            adjList.get(graph_to.get(i)).add(graph_from.get(i));
        }

        boolean[] visited = new boolean[graph_nodes + 1];
        int sum = 0;

        // Traverse the graph and calculate connected sums
        for (int i = 1; i <= graph_nodes; i++) {
            if (!visited[i]) {
                long weight = dfs(i, adjList, visited);
                sum += Math.ceil(Math.sqrt(weight));
            }
        }

        return sum;
    }

    static long dfs(int node, List<List<Integer>> adjList, boolean[] visited) {
        visited[node] = true;
        long weight = 1; // Initialize weight for the current node as 1 (each node has weight 7)

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                weight += dfs(neighbor, adjList, visited);
            }
        }

        return weight;
    }
}
