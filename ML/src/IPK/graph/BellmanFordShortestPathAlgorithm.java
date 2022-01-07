package IPK.graph;

import java.util.Arrays;

public class BellmanFordShortestPathAlgorithm {
    int V;
    int E;
    Edge[] edges;

    public BellmanFordShortestPathAlgorithm(int V, int E) {
        this.V = V;
        this.E = E;
        this.edges = new Edge[E];
        for (int i = 0; i < E; i++) {
            edges[i] = new Edge();
        }
    }

    public static void main(String[] args) {
        BellmanFordShortestPathAlgorithm bellmanFordShortestPathAlgorithm = new BellmanFordShortestPathAlgorithm(4, 5);
        bellmanFordShortestPathAlgorithm.edges[0].src = 0;
        bellmanFordShortestPathAlgorithm.edges[0].des = 1;
        bellmanFordShortestPathAlgorithm.edges[0].weight = 1;

        bellmanFordShortestPathAlgorithm.edges[1].src = 0;
        bellmanFordShortestPathAlgorithm.edges[1].des = 2;
        bellmanFordShortestPathAlgorithm.edges[1].weight = 4;

        bellmanFordShortestPathAlgorithm.edges[2].src = 1;
        bellmanFordShortestPathAlgorithm.edges[2].des = 2;
        bellmanFordShortestPathAlgorithm.edges[2].weight = -3;

        bellmanFordShortestPathAlgorithm.edges[3].src = 1;
        bellmanFordShortestPathAlgorithm.edges[3].des = 3;
        bellmanFordShortestPathAlgorithm.edges[3].weight = 2;

        bellmanFordShortestPathAlgorithm.edges[4].src = 2;
        bellmanFordShortestPathAlgorithm.edges[4].des = 3;
        bellmanFordShortestPathAlgorithm.edges[4].weight = 3;

        bellmanFord(bellmanFordShortestPathAlgorithm, 0);
    }

    private static void bellmanFord(BellmanFordShortestPathAlgorithm bellmanFordShortestPathAlgorithm, int start) {
        int vertices = bellmanFordShortestPathAlgorithm.V;
        int edge = bellmanFordShortestPathAlgorithm.E;
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;
        for (int count = 1; count < vertices - 1; count++) {
            for (int i = 0; i < edge; i++) {
                int u = bellmanFordShortestPathAlgorithm.edges[i].src;
                int v = bellmanFordShortestPathAlgorithm.edges[i].des;
                int weight = bellmanFordShortestPathAlgorithm.edges[i].weight;
                if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                }
            }

            for (int i = 0; i < edge; i++) {
                int u = bellmanFordShortestPathAlgorithm.edges[i].src;
                int v = bellmanFordShortestPathAlgorithm.edges[i].des;
                int weight = bellmanFordShortestPathAlgorithm.edges[i].weight;
                if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                    System.out.println("Graph contains negative value cycle");
                }
            }
        }

        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }

    }


    class Edge {
        int src;
        int des;
        int weight;

        public Edge() {
            this.src = 0;
            this.des = 0;
            this.weight = 0;
        }
    }
}
