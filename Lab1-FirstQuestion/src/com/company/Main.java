package com.company;

public class Main {

    public static void main(String[] args) {
	MyLinkedList list = new MyLinkedList();

    list.add(2);
    list.add(0);
    list.add(1);
    list.add(8);
    list.add(0);
    list.add(2);
    list.add(2);
    list.add(1);
    list.add(7);
    list.printList();

    list.delete(2);
    list.printList();

    list.removeAt(2);
    list.printList();

    list.removeAt(3);
    list.printList();


    }
}
