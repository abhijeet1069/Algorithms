package algo.graphs;

import algo.graphs.bfs.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class UndirectedGraphTest {

    @Test
    void testBfs() {
        Graph g = new Graph(7);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,5);
        g.addEdge(2,6);

        Assertions.assertEquals(List.of(0,1,2,3,4,5,6),g.bfs(0));
    }
}