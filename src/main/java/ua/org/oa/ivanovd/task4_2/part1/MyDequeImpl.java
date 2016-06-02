package ua.org.oa.ivanovd.task4_2.part1;

/**
 * Created by Администратор on 02.06.2016.
 */
public class MyDequeImpl<E> implements MyDeque<E> {

        private static class Node<E> {
            // Хранимый лемент
            E element;

            // Ссылка на следующий элемент списка
            Node<E> next;

            // Ссылка на предыдущий элемент списка
            Node<E> prev;


        }

    private Node first;
    private Node last;
    private int size;

    public MyDequeImpl() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void addFirst(E e) {
        Node node = new Node();
        node.element = e;
        if (size == 0) {
            first = node;
            last = node;
        }
        else {
            first.prev = node;
            node.next = first;
            first = node;
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        Node node = new Node();
        node.element = e;
        if (size == 0) {
            first = node;
            last = node;
        }
        else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        Node current = first;
        E e = (E)current.element;
        if (size == 1){
            current.prev = null;
            current.next = null;
            current.element = null;
            size = 0;
            return e;
        } else {
            current.next.prev = null;
            current.element = null;
            first = current.next;
            current.next = null;
            size--;
            return e;
        }
    }

    @Override
    public E removeLast() {
        Node current = last;
        E e = (E)current.element;
        if (size == 1){
            current.prev = null;
            current.next = null;
            current.element = null;
            size = 0;
            return e;
        } else {
            current.prev.next = null;
            current.element = null;
            last = current.prev;
            current.prev = null;
            size--;
            return e;
        }
    }

    @Override
    public E getFirst() {
        Node current = first;
        return (E)current.element;
    }

    @Override
    public E getLast() {
        Node current = last;
        return (E)current.element;
    }

    @Override
    public boolean contains(Object o) {
        Node current = first;
        while (current != null) {
            if (current.element.equals(o))
                break;
            else
                current = current.next;
        }
        return !(current == null);
    }

    @Override
    public void clear() {
        Node current = first;
        while (current != null) {
            Node t = current.next;
            current.prev = current.next = null;
            current.element = null;
            current = t;
            t = null;
        }
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public Object[] toArray() {
        Node current = first;
        Object[] obj = new Object[size];
        for (int i = 0; i < size; i++) {
            obj[i] = current.element;
            current = current.next;
        }
        return obj;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsAll(MyDeque<? extends E> deque) {
        if (deque.size() > this.size()){
            return false;
        }
        int count = 0;
        for (int i = 0; i < size(); i++){
            for (int j = 0; j < deque.size(); j++){
                if (this.toArray()[i].equals(deque.toArray()[j])){
                    count++;
                }
            }
        }
        return count == deque.size();
    }

    @Override
    public String toString() {
        Node current = first;
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            if (current == last){
                result.append(current.element.toString());
            } else {
                result.append(current.element.toString()).append(", ");
                current = current.next;
            }
        }
        result.append('}');
        return result.toString();
    }
}
