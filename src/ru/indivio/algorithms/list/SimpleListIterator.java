package ru.indivio.algorithms.list;

import java.util.Iterator;

public class SimpleListIterator<E> implements Iterator<E> {
    private final SimpleLinkedListImpl<E> list;
    private LinkedList.Node<E> curr;
    private LinkedList.Node<E> prev;

    public SimpleListIterator(SimpleLinkedListImpl<E> list) {
        this.list = list;
        reset();
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }

    @Override
    public E next() {
        E nextValue = curr.item;
        prev = curr;
        curr = curr.next;
        return nextValue;
    }

    @Override
    public void remove() {
        if (prev == null) {
            list.firstElement = curr.next;
            reset();
        } else {
            prev.next = curr.next;
            if (!hasNext()) {
                reset();
            } else {
                curr = curr.next;
            }
        }
    }
    public void reset() {
        curr = list.firstElement;
        prev = null;
    }

    public void insertBefore(E data) {
        LinkedList.Node<E> newNode = new LinkedList.Node<>(data,null);
        if(prev == null) {
            newNode.next = list.firstElement;
            list.firstElement = newNode;
            reset();
        }
        else {
            newNode.next = prev.next;
            prev.next = newNode;
            curr = newNode;
        }

    }


    public void insertAfter(E data) {
        LinkedList.Node<E> newNode = new LinkedList.Node<>(data,null);
        if (list.isEmpty()){
            list.firstElement = newNode;
            curr = newNode;
        } else {
            newNode.next = curr.next;
            curr.next = newNode;
            next();
        }
    }
}
