package Branching;

/**
 * Created by Jonathan McDevitt on 2017-03-20.
 */
public class LinkedList<T> {
    private Node<T> head, tail;
    private int size;

    public LinkedList() {

    }

    public int size() {
        return size;
    }

    private class Node<T> {
        private T data;
        private Node<T> next, prev;

        public Node(T data) {
            this.data = data;
            next = prev = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }
}