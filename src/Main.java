import java.util.*;

class Node {

    List<Edge> outgoingEdges;

    int id;

    boolean marked;

    public Node(int id) {
        this.outgoingEdges = new ArrayList<>();
        this.marked = false;
        this.id = id;
    }

    public String toString() {
        return Integer.toString(id);
    }

    @Override
    public int hashCode() {
        return id;
    }
}

class Edge {

    int from, to, weight;

    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return from == edge.from && to == edge.to && weight == edge.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, weight);
    }
}

class Solution {

    /**
     * @param n the number of nodes
     * @param m the number of edges
     * @param s the starting node (1 <= s <= n)
     * @param t the ending node (1 <= t <= n)
     * @param nodes the set of n nodes in the graph.
     * @param edges the set of edges of the graph, with endpoints labelled between 1 and n
     *     inclusive.
     * @return the time required to get out, or -1 if it is not possible to get out.
     */
    public static int getMeOuttaHere(int n, int m, int s, int t, Set<Node> nodes, Set<Edge> edges) {

    }
}
