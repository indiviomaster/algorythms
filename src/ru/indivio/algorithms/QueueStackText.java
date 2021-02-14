package ru.indivio.algorithms;

import ru.indivio.algorithms.queue.QueueImpl;
import ru.indivio.algorithms.stack.StackImpl;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueStackText {

    public static void main(String[] args) {

        StackImpl<Character> stackImpl = new StackImpl<>(50);
        QueueImpl<Character> queueImpl = new QueueImpl<>(50);
        String incomeText = "Съешь этих вкусных булочек";

        for (int i = 0; i < incomeText.length(); i++) {
            stackImpl.push(incomeText.charAt(i));
            queueImpl.insert(incomeText.charAt(i));
        }


        System.out.println("---------Ввели-------------------");

        while (!queueImpl.isEmpty()) {
            System.out.print(queueImpl.remove() + " ");
        }

        System.out.println("\n--------Перевернем--------------------");
        while (!stackImpl.isEmpty()) {
            System.out.print(stackImpl.pop());
        }

        System.out.println("\n----------------------------");
    }

}
