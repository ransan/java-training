package IPK.graph;

import java.util.Arrays;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        int vertices = 4;
        int[][] graph = new int[vertices][vertices];
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 0, 1, 5);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 0, 2, 10);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 1, 2, 3);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 1, 3, 20);
        AdjacencyListRepresentation.addWeightedUnDirectedMatrixGraphEdge(graph, 2, 3, 2);
        djikstra(graph, 0, vertices);
    }

    private static void djikstra(int[][] graph, int start, int vertices) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        boolean[] fin = new boolean[vertices];
        for (int count = 0; count < vertices - 1; count++) {
            int u = -1;
            for (int i = 0; i < vertices; i++) {
                if (!fin[i] && (u == -1 || distance[u] > distance[i])) {
                    u = i;
                }
            }
            fin[u] = true;
            for (int v = 0; v < vertices; v++) {
                if (!fin[v] && graph[u][v] != 0) {
                    distance[v] = Math.min(distance[v], distance[u] + graph[u][v]);
                }
            }
        }
        for (int i = 0; i < vertices; i++) {
            System.out.print(distance[i] + " ");
        }
    }

}
