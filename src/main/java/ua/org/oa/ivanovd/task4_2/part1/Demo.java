package ua.org.oa.ivanovd.task4_2.part1;

import java.util.Arrays;

/**
 * Created by Администратор on 02.06.2016.
 */
public class Demo {
    public static void main(String[] args) {
        MyDeque<Number> deque1 = new MyDequeImpl<Number>();
        deque1.addFirst(433);
        deque1.addLast(8.88);
        deque1.addLast(11);
        deque1.addFirst(-12);

        MyDeque<Number> deque2 = new MyDequeImpl<Number>();
        deque2.addFirst(-12);
        deque2.addLast(11);
        deque2.addFirst(8.88);

        System.out.println(deque1.toString());
        System.out.println("List contains 433 --> " + deque1.contains(433));
        System.out.println("List contains " + deque2.toString() + " --> " + deque1.containsAll(deque2));
        System.out.println("Size: " + deque1.size());
        System.out.println("An array with elements: " + Arrays.asList(deque1.toArray()));
        System.out.println();
        System.out.println("Getting element from the beginning without removing: " + deque1.getFirst());
        System.out.println("Getting element from the end without removing: " + deque1.getLast());
        System.out.println(deque1.toString());
        System.out.println();
        System.out.println("Getting element from the beginning with removing: " + deque1.removeFirst());
        System.out.println("Getting element from the end with removing: " + deque1.removeLast());
        System.out.println(deque1.toString());
    }
}
