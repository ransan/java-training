package IPK.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class BridgesInGraph {
    public static void main(String[] args) {
        int vertices = 6;
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        map.put(3, "D");
        map.put(4, "E");
        map.put(5, "F");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }
        AdjacencyListRepresentation.addEdge(list, 0, 1);
        AdjacencyListRepresentation.addEdge(list, 0, 2);
        AdjacencyListRepresentation.addEdge(list, 1, 2);
        AdjacencyListRepresentation.addEdge(list, 2, 3);
        AdjacencyListRepresentation.addEdge(list, 3, 4);
        AdjacencyListRepresentation.addEdge(list, 3, 5);
        AdjacencyListRepresentation.addEdge(list, 5, 4);
        bridges(list, vertices, map);
    }

    private static void bridges(ArrayList<ArrayList<Integer>> list, int vertices, Map<Integer, String> map) {
        int times = 0;
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        int[] low = new int[vertices];
        int[] discovery = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(list, i, parent, low, discovery, times, visited, map);
                System.out.println();
            }
        }
    }

    private static void dfs(ArrayList<ArrayList<Integer>> list, int start, int[] parent,
                            int[] low, int[] discovery, int times, boolean[] visited, Map<Integer, String> map) {
        visited[start] = true;
        discovery[start] = low[start] = ++times;
        ListIterator<Integer> iter = list.get(start).listIterator();
        while (iter.hasNext()) {
            int next = iter.next();
            if (!visited[next]) {
                parent[next] = start;
                dfs(list, next, parent, low, discovery, times, visited, map);

                low[start] = Math.min(low[start], low[next]);
                if (low[next] > discovery[start]) {
                    System.out.print(map.get(start) + " " + map.get(next) + " ");
                }
            } else if (next != parent[start]) {
                low[start] = Math.min(low[start], discovery[next]);
            }
        }
    }
}
