package ru.indivio.algorithms.deq;

import ru.indivio.algorithms.queue.IQueue;

public interface IDeque<E> extends IQueue<E> {

        boolean insertLeft(E value);
        boolean insertRight(E value);
        E removeLeft();
        E removeRight();
        E peekTail();
}
