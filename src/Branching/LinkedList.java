package Branching;

/**
 * Created by Jonathan McDevitt on 2017-03-20.
 */
public class LinkedList<T> {
    private Node<T> head, tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public LinkedList(T data) {
        head = tail = new Node<>(data);
        size = 1;
    }

    public int size() {
        return size;
    }

    public T remove(T data) {
        Node<T> curr = head;
        while(curr != null && !curr.getData().equals(data)) {
            curr = curr.getNext();
        }
        if(curr == null) {
            return null;
        } else {
            T val = curr.getData();
            if(curr.getPrev() == null){
                head = curr.getNext();
                head.setPrev(null);
                curr.setNext(null);
            } else if (curr.getNext() == null) {
                tail = curr.getPrev();
                tail.setNext(null);
                curr.setPrev(null);
            } else {
                Node<T> prev = curr.getPrev();
                Node<T> next = curr.getNext();
                prev.setNext(curr.getNext());
                next.setPrev(curr.getPrev());
                curr.setNext(null);
                curr.setPrev(null);
            }
            size--;
            return val;

    private boolean isEmpty() {
        return size==0;
    }

    public void add(T data) {
        add(new Node<>(data));
    }

    private void add(Node<T> data) {
        if(isEmpty()) {
            head = tail = data;
        } else {
            tail.setNext(data);
            data.setPrev(tail);
            tail = data;

        }
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
