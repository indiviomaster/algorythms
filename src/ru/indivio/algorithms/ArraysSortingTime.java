package ru.indivio.algorithms;

import java.util.Random;

public class ArraysSortingTime {

    public static void main(String[] args) {
        sortingTime();
    }

    private static void sortingTime() {
//      Для 100000 элементов
//      Время сортировки
//      пузырьком 74 393 мс
//      выбором 27 161 мс
//      вставкой 24 992 мс
        int num = 10000;
//      диапазон чисел для заполнения массивов
        int range = num*100;
        int element;
        Random random = new Random();

//      Создание массив большого размера num элементов .
        Array<Integer> data1 = new ArrayImpl<>(num);
        Array<Integer> data2 = new ArrayImpl<>(num);
        Array<Integer> data3 = new ArrayImpl<>(num);

//      Заполнение массивов случайными числами диапазона range.
        for (int i = 0; i < num; i++) {
            element = random.nextInt(range);
            data1.add(element);
            data2.add(element);
            data3.add(element);
        }

//        data1.display();
//        data2.display();
//        data3.display();

//      Long timerOnBubble = System.nanoTime();
        Long timerOnBubble = System.currentTimeMillis();
        data1.sortBubble();
//      Long timerOffBubble = System.nanoTime();
        Long timerOffBubble = System.currentTimeMillis();
        data2.sortSelect();
//      Long timerOffSelect = System.nanoTime();
        Long timerOffSelect = System.currentTimeMillis();
        data3.sortInsert();
//      Long timerOffInsert = System.nanoTime();
        Long timerOffInsert = System.currentTimeMillis();
        System.out.printf("Для %d элементов \nВремя сортировки \nпузырьком %d мс\nвыбором %d мс\nвставкой %d мс\n",num, timerOffBubble-timerOnBubble,timerOffSelect-timerOffBubble,timerOffInsert-timerOffSelect);
//      data1.display();
//      data2.display();
//      data3.display();
    }
}

