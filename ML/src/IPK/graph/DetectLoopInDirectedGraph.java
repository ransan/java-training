package IPK.graph;

import java.util.ArrayList;
import java.util.ListIterator;

public class DetectLoopInDirectedGraph {
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<Integer>());
        }
        AdjacencyListRepresentation.addDirectedEdge(list, 0, 1);
        AdjacencyListRepresentation.addDirectedEdge(list, 2, 1);
        AdjacencyListRepresentation.addDirectedEdge(list, 2, 3);
        AdjacencyListRepresentation.addDirectedEdge(list, 3, 4);
        AdjacencyListRepresentation.addDirectedEdge(list, 4, 5);
        AdjacencyListRepresentation.addDirectedEdge(list, 5, 3);
        System.out.println(dfs(list, vertices, 0));
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> list, int vertices, int start) {
        boolean[] visited = new boolean[vertices + 1];
        boolean[] stack = new boolean[vertices + 1];
        for (int i = 0; i < vertices; i++) {
            start = i;
            if (dfsRec(list, visited, start, stack)){
                return true;
            }
        }
        return false;
    }

    public static boolean dfsRec(ArrayList<ArrayList<Integer>> list, boolean[] visited, int start, boolean[] stack) {
        visited[start] = true;
        stack[start] = true;
        ListIterator<Integer> iterator = list.get(start).listIterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (visited[next] == false && dfsRec(list, visited, next, stack)) {
                return true;
            } else if (stack[next] == true) {
                return true;
            }
        }
        stack[start] = false;
        return false;
    }

}
