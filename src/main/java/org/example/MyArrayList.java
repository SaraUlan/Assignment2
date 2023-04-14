package org.example;

public class MyArrayList<T> {
    private Object[] arr;
    private int enoughSize = 10;
    private int size = 0;
    public MyArrayList() { arr = new Object[enoughSize];}
    public void add(T newItem){
        if(size == enoughSize){
            increaseArr();
        }
        arr[size++] = newItem;
    }
    private void increaseArr(){
        enoughSize = (int) (2 * enoughSize);
        Object[] arr2 = new Object[enoughSize];
        for (int i = 0; i< size; i++){
            arr2[i] = arr[i];
        }
    }
    public T get(int ind) {return (T) arr[ind];}
    public void remove(int ind){
        if (ind < 0 || ind >= size){
            throw new IndexOutOfBoundsException();
        }
        for(int i = ind; i < size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = null;
        size--;
    }

}
