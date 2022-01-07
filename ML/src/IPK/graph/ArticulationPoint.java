package IPK.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArticulationPoint {
    public static void main(String[] args) {
        int vertices = 7;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }

        AdjacencyListRepresentation.addEdge(list, 0, 1);
        AdjacencyListRepresentation.addEdge(list, 0, 3);
        AdjacencyListRepresentation.addEdge(list, 1, 2);
        AdjacencyListRepresentation.addEdge(list, 1, 4);
        AdjacencyListRepresentation.addEdge(list, 2, 3);
        AdjacencyListRepresentation.addEdge(list, 2, 3);
        AdjacencyListRepresentation.addEdge(list, 4, 5);
        AdjacencyListRepresentation.addEdge(list, 4, 6);
        AdjacencyListRepresentation.addEdge(list, 6, 6);
        articulationPoint(list, vertices);
    }

    private static void articulationPoint(ArrayList<ArrayList<Integer>> list, int vertices) {
        int time = 0;
        int[] parent = new int[vertices];
        int[] low = new int[vertices];
        int[] discovery = new int[vertices];
        boolean[] visited = new boolean[vertices];
        boolean[] ap = new boolean[vertices];

        Arrays.fill(parent, -1);

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(list, visited, parent, low, discovery, ap, i, time);
            }
        }

        for (int i = 0; i < vertices; i++) {
            if (ap[i]) {
                System.out.print(i + " ");
            }
        }
    }

    private static void dfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, int[] parent, int[] low, int[] discovery, boolean[] ap, int start, int time) {
        int children = 0;
        visited[start] = true;
        discovery[start] = low[start] = ++time;
        Iterator<Integer> iter = list.get(start).iterator();
        while (iter.hasNext()) {
            int next = iter.next();
            if (!visited[next]) {
                children++;
                parent[next] = start;
                dfs(list, visited, parent, low, discovery, ap, next, time);
                low[start] = Math.min(low[start], low[next]);

                if (parent[start] == -1 && children > 1) {
                    ap[start] = true;
                }
                if (parent[start] != -1 && low[next] >= discovery[start]) {
                    ap[start] = true;
                }
            } else if (next != parent[start]) {
                low[start] = Math.min(low[start], discovery[next]);
            }
        }
    }
}
