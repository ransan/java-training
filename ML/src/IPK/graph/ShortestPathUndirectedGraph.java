package IPK.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class ShortestPathUndirectedGraph {
    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }
        AdjacencyListRepresentation.addEdge(list, 0, 1);
        AdjacencyListRepresentation.addEdge(list, 0, 2);
        AdjacencyListRepresentation.addEdge(list, 1, 2);
        AdjacencyListRepresentation.addEdge(list, 1, 3);
        AdjacencyListRepresentation.addEdge(list, 2, 3);
        shortestPath(list, 4, 0);
    }

    private static void shortestPath(ArrayList<ArrayList<Integer>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices + 1];
        int[] distance = new int[vertices];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            ListIterator<Integer> iter = list.get(poll).listIterator();
            while (iter.hasNext()) {
                int next = iter.next();
                if (!visited[next]) {
                    distance[next] = distance[poll] + 1;
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        for (int i = 0; i < distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
    }
}
