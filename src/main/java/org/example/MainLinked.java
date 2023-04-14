package org.example;

public class MainLinked {
    public static void MainLinked(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>() {
            @Override
            public Integer get (int index){
                TODO:
                return null;
            }
            @Override
            public Integer remove(int index){
                TODO:
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
