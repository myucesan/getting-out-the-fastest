
import java.io.*;
import java.nio.charset.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MainTest {

    @Test
    public void example() {
        int n = 7;
        int m = 7;
        int s = 1;
        int t = 5;
        Set<Node> nodes = new HashSet<>();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        nodes.add(n4);
        nodes.add(n5);
        nodes.add(n6);
        nodes.add(n7);
        Set<Edge> edges = new HashSet<>();
        Edge e = new Edge(1, 2, 2);
        n1.outgoingEdges.add(e);
        edges.add(e);
        e = new Edge(2, 3, 100);
        n2.outgoingEdges.add(e);
        edges.add(e);
        e = new Edge(3, 4, 10);
        n3.outgoingEdges.add(e);
        edges.add(e);
        e = new Edge(4, 5, 10);
        n4.outgoingEdges.add(e);
        edges.add(e);
        e = new Edge(2, 6, 10);
        n2.outgoingEdges.add(e);
        edges.add(e);
        e = new Edge(6, 7, 10);
        n6.outgoingEdges.add(e);
        edges.add(e);
        e = new Edge(7, 4, 80);
        n7.outgoingEdges.add(e);
        edges.add(e);
        Assertions.assertEquals(118, Solution.getMeOuttaHere(n, m, s, t, nodes, edges));
    }
}
