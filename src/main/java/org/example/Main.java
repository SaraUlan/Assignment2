package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
       MyArrayList arrList = new MyArrayList();
       arrList.add(2);
       arrList.add("Sezim");
       arrList.add("Samat");
       arrList.add(2007);
       System.out.println(arrList.get(0));
       System.out.println(arrList.get(1));
       System.out.println(arrList.get(2));
       System.out.println(arrList.get(3));

       MyLinkedList<Integer> list = new MyLinkedList<Integer>() {
          @Override
          public boolean isEmpty() {
             return false;
          }

          @Override
          public boolean contains(Object o) {
             return false;
          }

          @Override
          public Iterator<Integer> iterator() {
             return null;
          }

          @Override
          public Object[] toArray() {
             return new Object[0];
          }

          @Override
          public <T> T[] toArray(T[] a) {
             return null;
          }

          @Override
          public boolean remove(Object o) {
             return false;
          }

          @Override
          public boolean containsAll(Collection<?> c) {
             return false;
          }

          @Override
          public boolean addAll(Collection<? extends Integer> c) {
             return false;
          }

          @Override
          public boolean addAll(int index, Collection<? extends Integer> c) {
             return false;
          }

          @Override
          public boolean removeAll(Collection<?> c) {
             return false;
          }

          @Override
          public boolean retainAll(Collection<?> c) {
             return false;
          }

          @Override
          public void clear() {

          }

          @Override
          public Integer get (int index){
             TODO:
             return null;
          }

          @Override
          public Integer set(int index, Integer element) {
             return null;
          }

          @Override
          public void add(int index, Integer element) {

          }

          @Override
          public Integer remove(int index){
             TODO:
             return null;
          }

          @Override
          public int indexOf(Object o) {
             return 0;
          }

          @Override
          public int lastIndexOf(Object o) {
             return 0;
          }

          @Override
          public ListIterator<Integer> listIterator() {
             return null;
          }

          @Override
          public ListIterator<Integer> listIterator(int index) {
             return null;
          }

          @Override
          public List<Integer> subList(int fromIndex, int toIndex) {
             return null;
          }
       };
       list.add(12);
       list.add(25);
       list.add(45);
       list.add(23);
       System.out.println(list.get(0));
       System.out.println(list.get(1));
       System.out.println(list.get(2));
       System.out.println(list.get(3));
    }

    }
