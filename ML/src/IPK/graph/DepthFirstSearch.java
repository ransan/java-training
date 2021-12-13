package IPK.graph;

import java.util.ArrayList;
import java.util.ListIterator;

public class DepthFirstSearch {

    public static void main(String[] args) {
        int vertices = 7;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<Integer>());
        }
        AdjacencyListRepresentation.addEdge(list, 0, 1);
        AdjacencyListRepresentation.addEdge(list, 0, 4);
        AdjacencyListRepresentation.addEdge(list, 1, 2);
        AdjacencyListRepresentation.addEdge(list, 2, 3);
        AdjacencyListRepresentation.addEdge(list, 4, 5);
        AdjacencyListRepresentation.addEdge(list, 4, 6);
        AdjacencyListRepresentation.addEdge(list, 5, 6);
        dfs(list, vertices, 3);

        System.out.println();

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(new ArrayList<Integer>());
        }

        AdjacencyListRepresentation.addEdge(list1, 0, 1);
        AdjacencyListRepresentation.addEdge(list1, 0, 2);
        AdjacencyListRepresentation.addEdge(list1, 1, 2);
        AdjacencyListRepresentation.addEdge(list1, 3, 4);

        disConnectedGraphDfs(list1, 5, 0);
        System.out.println();
        disConnectedGraphCountDfs(list1, 5, 0);
    }

    /**
     * DFS for connected graph
     *
     * @param list
     * @param vertices
     * @param start
     */
    private static void dfs(ArrayList<ArrayList<Integer>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices + 1];
        dfsRec(list, visited, start);
    }

    /**
     * DFS for dis-connected graph
     *
     * @param list
     * @param vertices
     * @param start
     */
    private static void disConnectedGraphDfs(ArrayList<ArrayList<Integer>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices + 1];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfsRec(list, visited, i);
            }
        }
    }

    /**
     * Disconnected graph count
     *
     * @param list
     * @param vertices
     * @param start
     */
    private static void disConnectedGraphCountDfs(ArrayList<ArrayList<Integer>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices + 1];
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfsRec(list, visited, i);
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }


    private static void dfsRec(ArrayList<ArrayList<Integer>> list, boolean[] visited, int start) {
        visited[start] = true;
        System.out.print(start + " ");
        ListIterator<Integer> iter = list.get(start).listIterator();
        while (iter.hasNext()) {
            int data = iter.next();
            if (!visited[data]) {
                dfsRec(list, visited, data);
            }
        }
    }
}
