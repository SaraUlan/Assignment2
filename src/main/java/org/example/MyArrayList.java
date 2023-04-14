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
        enoughSize = (int) (1.5 * enoughSize);
        Object[] arr2 = new Object[enoughSize];
        for (int i = 0; i< size; i++){
            arr2[i] = arr[i];
        }
    }

}
