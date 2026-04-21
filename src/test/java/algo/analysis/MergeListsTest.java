package algo.analysis;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeListsTest {

    @Test
    void testMerge() {
        List<Integer> l1 = List.of(2,4,6,8);
        List<Integer> l2 = List.of(1,3,5,7);
        assertEquals(List.of(1,2,3,4,5,6,7,8),
                new MergeLists().merge(l1,l2));
    }
}