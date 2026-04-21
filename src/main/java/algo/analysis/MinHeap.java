package algo.analysis;

import java.util.Arrays;

/**
 * Design goal - A heap only cares about the root. Everything else exists purely to keep that root correct
 *and cheap to maintain. <br/><br/>
 *
 * Time complexity
 * <ul>
 *  <li> insert → O(log n) </li>
 *  <li> extract-min/max → O(log n) </li>
 *  <li> peek → O(1)</li>
 * </ul>
 *
 *
 * 0 based indexing
 * <ul>
 *     <li> Parent -> floor((i-1)/2) </li>
 *     <li> Left child -> 2i+1 </li>
 *     <li> Right child -> 2i+2</li>
 * </ul>
 * */
public class MinHeap<T extends Comparable<T>> {
    private T[] heap;
    private int size;
    private final int capacity;

    @SuppressWarnings("unchecked")
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = (T[]) new Comparable[capacity];
        this.size = 0;
    }

    public void insert(T value){
        if(size == capacity)
            throw new IllegalStateException("Heap is full");

        heap[size] = value;
        heapifyUp(size);
        size++;
    }

    private void heapifyUp(int i){
        while(i>0){
            int parent = (i-1)/2;
            if(heap[i].compareTo(heap[parent]) >= 0)
                break;
            swap(i,parent);
            i = parent;
        }
    }

    private void swap(int i, int j){
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public T findMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    public T extractMin(){
        if(size == 0)
            throw new IllegalStateException("Heap is empty");
        T min = heap[0];
        heap[0] = heap[size-1]; //last element of heap comes to root
        heap[size-1]=null; //last place is emptied
        size--;

        heapifyDown(0); //adjust the new element
        return min;
    }

    //smallest element goes down
    private void heapifyDown(int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            //smallest among given node and its children
            if (left < size && heap[left].compareTo(heap[smallest]) < 0)
                smallest = left;

            if (right < size && heap[right].compareTo(heap[smallest]) < 0)
                smallest = right;

            if (smallest == i)
                break;

            swap(i, smallest);
            i = smallest;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(heap);
    }
}
