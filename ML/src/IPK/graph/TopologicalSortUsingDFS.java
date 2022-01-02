package IPK.graph;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Stack;

public class TopologicalSortUsingDFS {
    public static void main(String[] args) {
        final int vertices = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }

        AdjacencyListRepresentation.addDirectedEdge(list, 0, 1);
        AdjacencyListRepresentation.addDirectedEdge(list, 1, 3);
        AdjacencyListRepresentation.addDirectedEdge(list, 2, 3);
        AdjacencyListRepresentation.addDirectedEdge(list, 2, 4);
        AdjacencyListRepresentation.addDirectedEdge(list, 3, 4);
        dfs(list, 0, vertices);
    }

    private static void dfs(ArrayList<ArrayList<Integer>> list, int start, int vertices) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfsRec(list, visited, i, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static void dfsRec(ArrayList<ArrayList<Integer>> list, boolean[] visited, int start, Stack<Integer> stack) {
        visited[start] = true;
        ListIterator<Integer> iter = list.get(start).listIterator();
        while (iter.hasNext()) {
            int next = iter.next();
            if (!visited[next]) {
                dfsRec(list, visited, next, stack);
            }
        }
        stack.push(start);
    }
}
