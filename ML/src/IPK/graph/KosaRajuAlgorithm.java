package IPK.graph;

import java.util.Arrays;
import java.util.Stack;

public class KosaRajuAlgorithm {
    public static void main(String[] args) {
        int vertices = 6;
        int[][] graph = new int[vertices][vertices];
        /**
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 0, 1, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 1, 2, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 2, 0, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 1, 3, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 3, 4, 1);
        kosaraju(graph, vertices, 0);

         */
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 0, 1, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 1, 2, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 2, 3, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 3, 0, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 3, 4, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 4, 5, 1);
        AdjacencyListRepresentation.addWeightedDirectedMatrixGraphEdge(graph, 5, 4, 1);
        kosaraju(graph, vertices, 0);
    }

    private static void kosaraju(int[][] graph, int vertices, int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(graph, vertices, visited, i, stack);
            }
        }

        int[][] result = transposeMatrix(graph, vertices);

        Arrays.fill(visited, false);
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if (!visited[vertex]) {
                dfs(result, vertices, visited, vertex);
                System.out.println();
            }
        }
    }

    private static int[][] transposeMatrix(int[][] graph, int vertices) {
        int[][] result = new int[vertices][vertices];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                result[i][j] = graph[j][i];
            }
        }
        return result;
    }

    private static void dfs(int[][] graph, int vertices, boolean[] visited, int start, Stack<Integer> stack) {
        visited[start] = true;
        for (int i = 0; i < vertices; i++) {
            int next = graph[start][i];
            if (!visited[i] && next == 1) {
                dfs(graph, vertices, visited, i, stack);
            }
        }
        stack.push(start);
    }

    private static void dfs(int[][] graph, int vertices, boolean[] visited, int start) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < vertices; i++) {
            int next = graph[start][i];
            if (!visited[i] && next == 1) {
                dfs(graph, vertices, visited, i);
            }
        }
    }
}
