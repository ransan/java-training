package IPK.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(new ArrayList<Integer>());
        }

        AdjacencyListRepresentation.addEdge(list, 0, 1);
        AdjacencyListRepresentation.addEdge(list, 0, 2);
        AdjacencyListRepresentation.addEdge(list, 1, 3);
        AdjacencyListRepresentation.addEdge(list, 2, 3);
        AdjacencyListRepresentation.addEdge(list, 4, 5);
        AdjacencyListRepresentation.addEdge(list, 4, 6);

        //bfs(list);
        //bfs(list, 6, 0);
        bfsDisConnectedGraph(list, 7);
        System.out.println();
        countDisConnectedGraphSize(list, 7);

    }

    private static void bfs(ArrayList<ArrayList<Integer>> list) {
        String res = "0";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if (!res.contains(String.valueOf(list.get(i).get(j)))) {
                    res = res + ", " + list.get(i).get(j);
                }
            }
        }
        System.out.println(res);
    }

    /**
     * BFS for connected graph
     *
     * @param list
     * @param vertices
     * @param start
     */
    private static void bfs(ArrayList<ArrayList<Integer>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            System.out.print(poll + " ");
            ListIterator<Integer> iter = list.get(poll).listIterator();
            while (iter.hasNext()) {
                int next = iter.next();
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    private static void bfs(ArrayList<ArrayList<Integer>> list, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            System.out.print(poll + " ");
            ListIterator<Integer> iter = list.get(poll).listIterator();
            while (iter.hasNext()) {
                int next = iter.next();
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    /**
     * BFS for disconnected component
     *
     * @param list
     * @param vertices
     */
    private static void bfsDisConnectedGraph(ArrayList<ArrayList<Integer>> list, int vertices) {
        boolean[] visited = new boolean[vertices + 1];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                bfs(list, i, visited);
            }
        }
    }

    /**
     * count the disconnected Graph
     * @param list
     * @param vertices
     */
    private static void countDisConnectedGraphSize(ArrayList<ArrayList<Integer>> list, int vertices) {
        boolean[] visited = new boolean[vertices + 1];
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                bfs(list, i, visited);
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
