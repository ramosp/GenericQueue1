package edu.gcccd.csis;
import java.util.EmptyStackException;

import org.junit.*;


public class GenericQueueTest {
    public static void main(String[] args) {
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        //Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        GenericQueue<Double> doubleStack = new GenericQueue<>(5);
        //GenericQueue<Integer> integerStack = new GenericQueue<>();

        testEnqueue("genericQueue", doubleStack, doubleElements);
        testDequeue("genericQueue", doubleStack);

        //testEnqueue("integerStack", integerStack, integerElements);
        //testDequeue("integerStack", integerStack);

        System.out.println(length(doubleStack));

    }

    @Test
    public static <E> void testEnqueue(String name, GenericQueue<E> GenericQueue, E[] elements) {
        System.out.printf("%nEnqueueing elements onto %s%n", name);

        for ( E element : elements) {
            System.out.printf("%s ", element);
            GenericQueue.enqueue(element);
        }
    }

    @Test
    public static <E> void testDequeue(String name, GenericQueue<E> GenericQueue) {
        try {
            System.out.printf("%nDequeueing elements from %s%n", name);
            E dequeueValue;

            while (true) {
                dequeueValue = GenericQueue.dequeue();
                System.out.printf("%s ", dequeueValue);
            }
        }
        catch(EmptyStackException emptyStackException) {
            System.out.println();
        }
        }
    public static String length(GenericQueue<Double> doubleElements) {
        return ("Queue size: " +  doubleElements.size());
    }
}