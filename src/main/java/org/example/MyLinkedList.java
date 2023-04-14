package org.example;

import java.util.*;

public abstract class MyLinkedList<E> implements List<E> {
    private class Node{
        E element;
        Node next;
        Node previous;
        Node (E element, Node next, Node previous){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
}
