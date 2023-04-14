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
    public E get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.element;
    }
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for(int i = 0;i < index; i++){
            current = current.next;
        }
        if(current.previous != null){
            current.previous.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null){
            current.next.previous = current.previous;
        } else {
            tail = current.previous;
        }
        size--;
        return current.element;
    }
}
