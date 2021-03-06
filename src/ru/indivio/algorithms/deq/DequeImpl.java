package ru.indivio.algorithms.deq;

import ru.indivio.algorithms.queue.QueueImpl;

import java.util.Arrays;

public class DequeImpl<E> extends QueueImpl<E> implements IDeque<E> {

    public DequeImpl(int size) {
        super(size);
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()) {
            return false;
        }
        if (this.head == DEFAULT_HEAD)
            this.head = this.data.length;

        this.data[--this.head] = value;
        this.size++;

        return true;
    }

    @Override
    public E removeLeft() {
        return super.remove();
    }

    @Override
    public boolean insertRight(E value) {
        return  super.insert(value);
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return  null;
        }
        if (this.tail == DEFAULT_TAIL)

            this.tail = this.data.length - 1;
        this.size--;

        E removedValue = this.data[tail];
        this.data[tail--] = null;

        return removedValue;
    }

    @Override
    public E peekTail() {
        return this.data[this.tail];
    }

    @Override
    public String toString() {
        return "DequeImpl{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
