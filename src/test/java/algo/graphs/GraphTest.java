package algo.graphs;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testaddEdge() {
        Graph<Integer> g = new Graph<>();
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);

        assertEquals(List.of(2,3),g.getNeighbors(1));
    }
}