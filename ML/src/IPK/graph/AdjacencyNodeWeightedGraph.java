package IPK.graph;

public class AdjacencyNodeWeightedGraph {
    private final int vertex;
    private final int weight;

    public AdjacencyNodeWeightedGraph(final int vertex, final int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public int getVertex() {
        return this.vertex;
    }

    public int getWeight() {
        return this.weight;
    }

}
