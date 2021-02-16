package ru.indivio.algorithms;

import ru.indivio.algorithms.list.LinkedList;
import ru.indivio.algorithms.list.SimpleLinkedListImpl;
import ru.indivio.algorithms.list.SimpleListIterator;

public class IteratorTest {
    public static void main(String[] args) {
        SimpleListIteratorTest();

        ListIteratorTest();
    }


    private static void SimpleListIteratorTest() {
        SimpleLinkedListImpl<String> list = new SimpleLinkedListImpl<>();

        list.insertFirst("Vovk");
        list.insertFirst("Olga");
        list.insertFirst("Olesya");
        list.insertFirst("Kostya");
        list.insertFirst("Dimitrius");
        list.insertFirst("Alex");

        list.display();
        list.removeFirst();

        System.out.println("======Foreach=====");

        for(String s: list) {
            System.out.print(s+" ");
        }
    }

    private static void ListIteratorTest() {
        LinkedList<String> list = new SimpleLinkedListImpl<>();
        list.insertFirst("F");
        list.insertFirst("E");
        list.insertFirst("D");
        list.insertFirst("C");
        list.insertFirst("B");
        list.insertFirst("A");


        SimpleListIterator<String> iterator = (SimpleListIterator<String>) list.iterator();
        System.out.println(iterator.next()); //A
        iterator.next(); //B
        iterator.insertAfter("After");
        System.out.println(iterator.next()); //C
        iterator.remove(); //D - удален
        System.out.println(iterator.next()); //Е
        iterator.remove();//F - удален
        iterator.insertBefore("Before");
        iterator.reset();
        iterator.remove();//A - Удален
        System.out.println(iterator.next()); //B

        for(String s: list) {
            System.out.print(s+" ");
        }
    }
}