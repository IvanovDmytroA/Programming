package ua.org.oa.ivanovd.task4_2.part2;

import java.util.Iterator;

/**
 * Created by Администратор on 02.06.2016.
 */
public class Demo {
    public static void main(String[] args) {
        MyDeque<Number> deque = new MyDequeImpl<Number>();
        deque.addFirst(433);
        deque.addLast(8.88);
        deque.addLast(2);
        deque.addFirst(-44);

        System.out.println(deque.toString());

        System.out.println();

        for (Number element : deque) {
            System.out.println(element);
        }

        System.out.println();

        Iterator<Number> it = deque.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
