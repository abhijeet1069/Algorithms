package algo.ds.priorityQueue;

import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueueDS<T> {
    private static final int DEFAULT_CAPACITY = 11;
    private Object[] heap;
    private int size;
    @SuppressWarnings("unused")
	private final Comparator<? super T> comparator; // must me T or any parent of T

    public PriorityQueueDS() {
        this(null, DEFAULT_CAPACITY);
    }

    public PriorityQueueDS(Comparator<? super T> comparator){
        this(comparator, DEFAULT_CAPACITY);
    }

    public PriorityQueueDS(Comparator<? super T> comparator, int initialCapacity){
        if(initialCapacity <= 0)
            throw new IllegalArgumentException("initial capacity > 0  required");
        this.comparator = comparator;
        this.heap = new Object[Math.max(DEFAULT_CAPACITY,initialCapacity)];
        this.size = 0;
    }

    public void insert(T x){
        if(x == null)
            throw new IllegalArgumentException("Cannot insert null elements");
        ensureCapacity(size+1);
        heap[size] = x;
        //siftUp(size++);
    }

    private void ensureCapacity(int minCapacity){
        if(minCapacity <= heap.length)
            return;
        int oldCap = heap.length;
        int newCap = oldCap+(oldCap >> 1);
        if(newCap < minCapacity)
            newCap = minCapacity;
        heap = Arrays.copyOf(heap,newCap);
    }
}
