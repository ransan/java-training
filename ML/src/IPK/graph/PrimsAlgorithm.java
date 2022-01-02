package IPK.graph;

import java.util.Arrays;

public class PrimsAlgorithm {
    public static void main(String[] args) {
        int vertices = 4;
        int[][] graph = new int[vertices][vertices];
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 0, 1, 5);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 0, 2, 8);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 1, 2, 10);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 1, 3, 15);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 2, 3, 20);
        shortestPath(graph, vertices);
    }

    private static void shortestPath(int[][] graph, int vertices) {
        int res = 0;
        int[] weights = new int[vertices];
        Arrays.fill(weights, Integer.MAX_VALUE);
        weights[0] = 0;
        boolean[] InMst = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            int u = -1;
            for (int j = 0; j < vertices; j++) {
                if (!InMst[j] && (u == -1 || weights[j] < weights[u])) {
                    u = j;
                }
            }
            InMst[u] = true;
            res += weights[u];
            for (int k = 0; k < vertices; k++) {
                if (!InMst[k] && graph[u][k] != 0) {
                    weights[k] = Math.min(weights[k], graph[u][k]);
                }
            }
        }
        System.out.println(res);
    }
}
