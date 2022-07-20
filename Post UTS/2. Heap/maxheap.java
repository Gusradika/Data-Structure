public class maxheap {
    private int[] Heap;
    private int size;
    private int maxsize;

    public maxheap(int maxsize) {
        // This keyword refers to current instance itself
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }

    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void maxHeapify(int pos) {
        if (isLeaf(pos))
            return;

        if (Heap[pos] < Heap[leftChild(pos)]
                || Heap[pos] < Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            } else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    public void insert(int element) {
        Heap[size] = element;

        // Traverse up and fix violated property
        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    public void print() {

        for (int i = 0; i < size / 2; i++) {

            System.out.print("Parent Node : " + Heap[i]);

            if (leftChild(i) < size) // if the child is out of the bound of the array
                System.out.print(" Left Child Node: " + Heap[leftChild(i)]);

            if (rightChild(i) < size) // if the right child index must not be out of the index of the array
                System.out.print(" Right Child Node: " + Heap[rightChild(i)]);

            System.out.println(); // for new line

        }

    }

    public int extractMax() {
        int popped = Heap[0];
        Heap[0] = Heap[--size];
        maxHeapify(0);
        return popped;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        // tugas heap : insert, update, delete dan view heap
        System.out.println("The Max Heap is ");
        maxheap maxHeap = new maxheap(6);
        maxHeap.insert(1);
        maxHeap.insert(10);
        maxHeap.insert(16);
        maxHeap.insert(19);
        maxHeap.insert(3);
        maxHeap.insert(5);
        maxHeap.print();
        System.out.println("The max val is "
                + maxHeap.extractMax());
    }

}
