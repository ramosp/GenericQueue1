package edu.gcccd.csis;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericQueue<E> {
    private final ArrayList<E> elements;

    public GenericQueue() {
        this(10);
    }

    public GenericQueue(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<E>(initCapacity);
    }

    public void enqueue(E enqueueValue) {
        elements.add(enqueueValue);
}
    public E dequeue() {
        if (elements.isEmpty())
            throw new EmptyStackException();
        return elements.remove(elements.size() - 1);
    }

    public int size() {
        return elements.size();
    }
}