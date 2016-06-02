package ua.org.oa.ivanovd.task4_2.part3;

/**
 * Created by Администратор on 02.06.2016.
 */
public class Demo {
    public static void main(String[] args) {

        MyDeque<Number> deque = new MyDequeImpl<Number>();
        deque.addFirst(433);
        deque.addLast(8.88);
        deque.addLast(11);
        deque.addFirst(-43);

        System.out.println(deque.toString());

        System.out.println();

        ListIterator<Number> listIt = deque.listIterator();

        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        System.out.println();

        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }

    }
}
