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
}
