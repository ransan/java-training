package IPK.graph;

import java.util.*;

public class TopologicalSortUsingKhanAlgorithm {
    public static void main(String[] args) {
        int vertices = 3;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            list.add(new ArrayList<>());
        }
        AdjacencyListRepresentation.addDirectedEdge(list, 0, 1);
        AdjacencyListRepresentation.addDirectedEdge(list, 1, 2);
        AdjacencyListRepresentation.addDirectedEdge(list, 2, 0);
        khanAlgorithm(list, vertices);
    }

    private static void khanAlgorithm(ArrayList<ArrayList<Integer>> list, int vertices) {
        int[] inDegree = new int[vertices];
        /**
         * step 1: form inDegree
         */
        formInDegree(inDegree, vertices, list);

        /**
         * Step 2 : form a queue if inDegree equals 0
         */
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> topo = new LinkedList<>();
        int count = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topo.add(node);
            ListIterator<Integer> iter = list.get(node).listIterator();
            while (iter.hasNext()) {
                int next = iter.next();
                if (--inDegree[next] == 0) {
                    queue.add(next);
                }
            }
            count++;
        }
        if (count != vertices) {
            System.out.println("Cycle Detected");
            return;
        }
        for (int i = 0; i < vertices; i++) {
            System.out.print(topo.get(i) + " ");
        }
    }

    private static void formInDegree(int[] inDegree, int vertices, ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < vertices; i++) {
            for (int node : list.get(i)) {
                inDegree[node]++;
            }
        }
    }
}
