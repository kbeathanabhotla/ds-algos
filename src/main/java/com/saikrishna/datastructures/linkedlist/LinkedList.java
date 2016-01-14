package com.saikrishna.datastructures.linkedlist;

/**
 * Created by SaiKrishnaKishore on 1/14/2016.
 */
public class LinkedList<T> {

    private Node<T> head;

    public void add(T object) {
        if (head == null) {
            head = new Node<T>(object, null);
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node<T>(object, null);
    }

    public void addFirst(T object) {
        head = (head == null) ? new Node<T>(object, null) : new Node(object, head.next);
    }

    public void addLast(T object) {
        add(object);
    }

    public int exists(T object) {
        int index = -1, currentIndex = 0;
        Node currentNode = head;
        while(currentNode != null) {
            if (currentNode.data.equals(object)) {
                index = currentIndex;
                break;
            }
            currentIndex++;
        }
        return index;
    }

    // TODO: implement this
    private T get(int index) {
        if (head == null) {
            return null;
        }
        Node currentNode = head;
        while (currentNode != null && index >= 0) {

        }
        return null;
    }

    // TODO: implement this
    public void remove(int number) {

    }

    public int size() {
        int size = 0;
        Node currentNode = head;
        while(currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    //TODO: have to implement
    public void reverse() {
        if (head == null) {
            return;
        }
        /*Node prev = null;
        Node currentNode = head;
        while(currentNode != null) {
            Node temp = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = temp;
        }*/
    }

    @Override
    public String toString() {
        return "["+ (head != null ? head.toString() : "") +"]";
    }

    private class Node<T> {
        public Node<T> next;
        public T data;

        public Node(T data, Node<T> next) {
            this.next = next;
            this.data = data;
        }

        @Override
        public String toString() {
            return data + ((next != null) ? (" -> " + next.toString()) : "");
        }
    }
}
