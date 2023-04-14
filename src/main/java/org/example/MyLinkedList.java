package org.example;

import java.util.*;

public abstract class MyLinkedList<E> implements List<E> {
    private class Node{
        E element;
        Node next;
        Node previous;
        Node (E element){
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
    public boolean add(E element){
        Node newN = new Node(element);
        if(size == 0){
            head = newN;
        }
        else {
            tail.next = newN;
            newN.previous = tail;
        }
        tail = newN;
        size++;
        return true;
    }
}
