package IPK.graph;

import java.util.ArrayList;
import java.util.ListIterator;

public class DetectLoopInUndirectedGraph {
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<Integer>());
        }
        AdjacencyListRepresentation.addEdge(list, 0, 1);
        AdjacencyListRepresentation.addEdge(list, 1, 2);
        AdjacencyListRepresentation.addEdge(list, 1, 3);
        AdjacencyListRepresentation.addEdge(list, 2, 3);
        AdjacencyListRepresentation.addEdge(list, 2, 4);
        AdjacencyListRepresentation.addEdge(list, 4, 5);
        System.out.println(dfs(list, vertices, 0));
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices + 1];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfsRec(list, visited, start, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfsRec(ArrayList<ArrayList<Integer>> list, boolean[] visited, int start, int parent) {
        visited[start] = true;
        ListIterator<Integer> iterator = list.get(start).listIterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next != parent) {
                if (visited[next]) {
                    return true;
                } else {
                    parent = start;
                    if (dfsRec(list, visited, next, parent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
