package ru.indivio.algorithms.queue;

public interface IQueue<E> {

    boolean insert(E value);

    E remove();

    E peekHead();

    int size();

    boolean isEmpty();

    boolean isFull();

}
