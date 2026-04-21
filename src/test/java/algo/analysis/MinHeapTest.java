package algo.analysis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void testFindMin() {
        MinHeap<Integer> heap = new MinHeap<>(10);
        heap.insert(5);
        heap.insert(2);
        heap.insert(8);
        heap.insert(1);
        assertEquals(1,heap.findMin());
        System.out.println(heap);
    }

    @Test
    void testExtractMin() {
        MinHeap<Integer> heap = new MinHeap<>(10);
        heap.insert(5);
        heap.insert(2);
        heap.insert(8);
        heap.insert(1);
        assertEquals(1,heap.extractMin());
        assertEquals(2,heap.extractMin());
        assertEquals(5,heap.extractMin());
        assertEquals(8,heap.extractMin());

        Exception exception = assertThrows(IllegalStateException.class, heap::extractMin);
        assertEquals("Heap is empty", exception.getMessage());
        System.out.println(heap);
    }
}