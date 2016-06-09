package ua.org.oa.ivanovd.practice3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 03.06.2016.
 */
public class GenericStorage<K, V> {

    private class Node<K,V>{
        private K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    List<Node<K,V>> nodeList = new ArrayList<>();

    public boolean add(K key, V value){
        return nodeList.add(new Node<>(key, value));
    }

    public List<V> getValue(K key){
        List<V> values = new ArrayList<>();
        for (Node<K, V> kvNode : nodeList) {
            if(kvNode.getKey().equals(key)) {
                values.add(kvNode.getValue());
            }
        }
        return values;
    }

    public void remove(V value){
        for (Node<K, V> kvNode : nodeList) {
            if(kvNode.getKey().equals(value)) {
                nodeList.remove(kvNode.getValue());
                nodeList.remove(kvNode.getKey());
            }
        }
    }



}
