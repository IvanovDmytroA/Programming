package ua.org.oa.ivanovd.task4_2.part2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Администратор on 02.06.2016.
 */
public class MyDequeImpl<E> implements MyDeque<E> {

    private static class Node<E> {

        // хранимый элемент
        E element;

        // ссылка на следующий элемент списка
        Node<E> next;

        // ссылка на предыдущий элемент списка
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
    @SuppressWarnings("unchecked")
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
            first = current.next;
            current.next = null;
            current.element = null;
            size--;
            return e;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
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
            last = current.prev;
            current.prev = null;
            current.element = null;
            size--;
            return e;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public E getFirst() {
        Node current = first;
        return (E)current.element;
    }

    @Override
    @SuppressWarnings("unchecked")
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
        return count == this.toArray().length;
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

    @Override
    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<E> {
        Node current = first;
        Node toRemove;
        boolean canRemove = false;
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size();
        }

        @Override
        @SuppressWarnings("unchecked")
        public E next() {
            if(!hasNext()) {
                throw new NoSuchElementException("There is no next element");
            }
            canRemove = true;
            toRemove = current;
            current = current.next;
            index++;
            return (E)toRemove.element;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void remove(){
            if(!canRemove || current == null) {
                throw new IllegalStateException("There are no elements to be removed");
            }

            canRemove = false;

            if (toRemove == first){
                removeFirst();
                index--;
            } else if (toRemove == last) {
                removeLast();
                index--;
            } else {
                toRemove.prev.next = toRemove.next;
                toRemove.next.prev = toRemove.prev;
                toRemove.prev = null;
                toRemove.next = null;
                toRemove.element = null;
                size--;
                index--;
            }
        }

    }
}
