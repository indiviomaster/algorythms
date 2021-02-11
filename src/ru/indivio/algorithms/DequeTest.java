package ru.indivio.algorithms;

import ru.indivio.algorithms.deq.DequeImpl;

public class DequeTest {

    public static void main(String[] args) {

        DequeImpl<Integer> deque = new DequeImpl<>(10);

        for (int i = 0; i < 10; i++) {
            deque.insertRight(i + 1);
        }
        System.out.println(deque);
        for (int i = 0; i < 3; i++) {
            deque.removeRight();
        }
        System.out.println(deque.peekTail());
        System.out.println(deque);

        for (int i = 0; i < 3; i++) {
            deque.removeLeft();

        }
        System.out.println(deque.peekHead());
        System.out.println(deque);

        for (int i = 0; i < 3; i++) {
            deque.insertLeft(i);
        }
        System.out.println(deque);
    }
}
