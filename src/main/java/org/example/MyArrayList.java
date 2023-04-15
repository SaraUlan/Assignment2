package org.example;

public class MyArrayList<E> {
    private Object[] arr;
    private int enoughSize = 10;
    private int size = 0;
    public MyArrayList() { arr = new Object[enoughSize];}
    public void add(E newItem){
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
    public E get(int index) {return (E) arr[index];}
    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        for(int i = index; i < size-1;i++){
            arr[i] = arr[i+1];
        }
        arr[size-1] = null;
        size--;
    }
    public int getSize() { return size;}

}
