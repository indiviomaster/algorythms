package ru.indivio.algorithms;

import ru.indivio.algorithms.hashtable.HashTable;
import ru.indivio.algorithms.hashtable.Product;
import ru.indivio.algorithms.hashtable.TailHashTableImpl;

public class TailHashTableTest {

    public static void main(String[] args) {

        HashTable<Product, Integer> hashTable = new TailHashTableImpl<>(10);

        hashTable.put(new Product(1, "Orange"), 150);
        hashTable.put(new Product(11, "Bananas"), 100);
        hashTable.put(new Product(12, "Banana"), 100);
        hashTable.put(new Product(22, "Carrot"), 228);
        hashTable.put(new Product(23, "Potato"), 67);
        hashTable.put(new Product(37, "Mango"), 100);
        hashTable.put(new Product(64, "Lemon"), 250);
        hashTable.put(new Product(54, "Milk"), 120);
        hashTable.put(new Product(76, "Papaya"), 100);
        hashTable.put(new Product(85, "Lime"), 120);
        hashTable.put(new Product(98, "Cheese"), 100);
        hashTable.put(new Product(90, "Sweety"), 10);

        System.out.println("Size is " + hashTable.size());
        hashTable.display();

        System.out.println("Cost potato is " + hashTable.get(new Product(23, "Potato")));
        System.out.println("Cost carrot is " + hashTable.get(new Product(22, "Carrot")));

        hashTable.remove(new Product(23, "Potato"));
        hashTable.remove(new Product(12, "Banana"));

        System.out.println("Cost potato is " + hashTable.get(new Product(23, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Product(12, "Banana")));


        hashTable.display();
    }
}

