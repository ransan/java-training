package IPK.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Stack;

public class ShortestPathInDAG {
    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<AdjacencyNodeWeightedGraph>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }

        AdjacencyListRepresentation.addWeightedDirectedGraphEdge(list, 0, 1, 1);
        AdjacencyListRepresentation.addWeightedDirectedGraphEdge(list, 1, 2, 3);
        AdjacencyListRepresentation.addWeightedDirectedGraphEdge(list, 1, 3, 2);
        AdjacencyListRepresentation.addWeightedDirectedGraphEdge(list, 2, 3, 4);
        shortestPath(list, vertices, 1);
    }

    private static void shortestPath(ArrayList<ArrayList<AdjacencyNodeWeightedGraph>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        doTopologicalSort(list, visited, vertices, stack);
        int[] distance = new int[vertices];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        while (!stack.isEmpty()) {
            int element = stack.pop();
            ListIterator<AdjacencyNodeWeightedGraph> iter;
            if (distance[element] != Integer.MAX_VALUE) {
                iter = list.get(element).listIterator();
                while (iter.hasNext()) {
                    AdjacencyNodeWeightedGraph next = iter.next();
                    if (distance[next.getVertex()] > distance[element] + next.getWeight()) {
                        distance[next.getVertex()] = distance[element] + next.getWeight();
                    }
                }
            }
        }
        for (int i = 0; i < vertices; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("INF ");
            } else {
                System.out.println(distance[i] + " ");
            }
        }
    }

    private static void doTopologicalSort(ArrayList<ArrayList<AdjacencyNodeWeightedGraph>> list, boolean[] visited, int vertices, Stack<Integer> stack) {
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(list, visited, i, stack);
            }
        }
    }

    private static void dfs(ArrayList<ArrayList<AdjacencyNodeWeightedGraph>> list, boolean[] visited, int start, Stack<Integer> stack) {
        visited[start] = true;
        ListIterator<AdjacencyNodeWeightedGraph> iter = list.get(start).listIterator();
        while (iter.hasNext()) {
            AdjacencyNodeWeightedGraph next = iter.next();
            if (!visited[next.getVertex()]) {
                dfs(list, visited, next.getVertex(), stack);
            }
        }
        stack.push(start);
    }
}
