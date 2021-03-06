package ru.indivio.algorithms;

import ru.indivio.algorithms.recursion.Backpack;
import ru.indivio.algorithms.recursion.Thing;

import java.util.ArrayList;
import java.util.List;

public class BackPackTest {
    public static void main(String[] args) {

        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Спички",   1, 60));
        things.add(new Thing("Соль", 2, 50));
        things.add(new Thing("Вода", 4, 150));
        things.add(new Thing("Телефон", 2, 1000));
        things.add(new Thing("Яблоко", 1, 40));
        things.add(new Thing("Свитер", 4, 1000));
        things.add(new Thing("Мясо", 3, 500));
        things.add(new Thing("Часы", 2, 1500));
        things.add(new Thing("Топор", 6, 3500));


        Backpack backpack = new Backpack(10);
        backpack.calcBestList(things);

        for (Thing item : backpack.getTotalList()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
        System.out.println("Total price = " + backpack.getTotalPrice());
    }

}
