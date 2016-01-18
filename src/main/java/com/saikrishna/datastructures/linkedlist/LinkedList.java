package com.saikrishna.datastructures.linkedlist;

/**
 * Created by SaiKrishnaKishore on 1/14/2016.
 */
public class LinkedList<T> {

    private Node head;

    /**
     * Method to add an object to the linked list
     *
     * @param object The object to add
     */
    public void add(T object) {
        head = new Node(object, head);
    }

    /**
     * Method to add an object to the first of list
     * @param object The object to add
     */
    public void addFirst(T object) {
        add(object);
    }

    /**
     * Method to add an object at the end of list
     * @param object The object to add
     */
    public void addLast(T object) {
        if (head == null) {
            head = new Node(object, null);
            return;
        }
        Node currentNode = head;
        while(currentNode != null && currentNode.next == null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(object, null);
    }

    /**
     * Method to check if an element exists
     *
     * @param object the element to check
     * @return The index of the object if exists else -1
     */
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

    /**
     * Method to get a node by index
     *
     * @param index The index of the node to get
     * @return The date at the node
     */
    public T get(int index) {
        if (head == null) {
            return null;
        }

        Node currentNode = head;
        int i = 0;

        // Navigating to the node
        while (i < index && currentNode.next != null) {
            currentNode = currentNode.next;
            i++;
        }

        if (index == i) {
            return (T) currentNode.data;
        }
        return null;
    }

    /**
     * Method to remove a node by index
     * @param index The node index to be removed
     */
    public void remove(int index) {
        if (head == null) {
            return;
        }

        Node currentNode = head;

        // Navigating to the (n-1)th node
        for (int i = 0; i < index && currentNode != null; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
        }
    }

    /**
     * Method to get the size of linked list
     *
     * @return size of linked list
     */
    public int size() {
        int size = 0;
        Node currentNode = head;
        while(currentNode != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    /**
     * Method to reverse the linked list
     */
    public void reverse() {
        if (head == null) {
            return;
        }
        Node prev = null;
        Node currentNode = head;
        Node next;
        while(currentNode != null) {
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }
        this.head = prev;
    }

    /**
     * Method to verify if loop exists in the list
     *
     * @return true if loop exists and false if not
     */
    public boolean checkLoop() {
        Node fastPointer = head;
        Node slowPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null && slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return (slowPointer == fastPointer);
    }

    /**
     * Method to check and remove loop if exists
     */
    public void checkAndRemoveLoop() {
        Node fastPointer = head;
        Node slowPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null && slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        // if the two pointers are same then there is a cycle
        if (slowPointer == fastPointer) {
            // Resetting one of the pointers
            fastPointer = head;

            // Moving the pointers just one step before intersection
            while (fastPointer.next != slowPointer.next) {
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }

            Node start = fastPointer.next;
            fastPointer = start;

            while (fastPointer.next != start) {
                fastPointer = fastPointer.next;
            }

            // Breaking the cycle
            fastPointer.next = null;
        }
    }

    public void rotateLeft(int units) {
        if (head == null) {
            return;
        }
        units = units % size();
        if (units == 0) {
            return;
        }
        Node currentNode = head;
        Node prev = null;
        while (units > 0) {
            prev = currentNode;
            currentNode = currentNode.next;
            units--;
        }
        prev.next = null;
        Node returnHead = currentNode;

        while (currentNode != null && currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = this.head;
        this.head = returnHead;
    }

    @Override
    public String toString() {
        return "["+ (head != null ? head.toString() : "") +"]";
    }

    private class Node {
        public Node next;
        public T data;

        public Node(T data, Node next) {
            this.next = next;
            this.data = data;
        }

        @Override
        public String toString() {
            return data + ((next != null) ? (" -> " + next.toString()) : "");
        }
    }
}
