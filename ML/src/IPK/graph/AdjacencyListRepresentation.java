package IPK.graph;

import java.util.ArrayList;

/**
 * 0 -> 1
 * 0 -> 2
 * 1 -> 2
 * 1 -> 3
 * 2 -> 0
 * 2 -> 1
 * 3 -> 1
 */
public class AdjacencyListRepresentation {
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }
        addEdge(adjacencyList, 0, 1);
        addEdge(adjacencyList, 0, 2);
        addEdge(adjacencyList, 1, 2);
        addEdge(adjacencyList, 1, 3);
        System.out.println(adjacencyList);
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adjacencyList, int u, int v) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }
}
