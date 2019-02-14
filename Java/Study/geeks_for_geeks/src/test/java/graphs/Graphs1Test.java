package graphs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by ravibhushan.k on 29/01/19
 */
public class Graphs1Test {
    Graphs1 graph;

    @Before
    public void setup(){
    }

    @Test
    public void Test1() {
        int V = 5;
        graph = new Graphs1(V);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.print();
    }

    @Test
    public void BFSTest() {
        graph = new Graphs1(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        graph.BFS(2);
    }
}