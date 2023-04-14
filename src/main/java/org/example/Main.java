package org.example;

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
    }
}