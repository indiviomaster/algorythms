package ru.indivio.algorithms.hashtable;

import java.util.LinkedList;

public class TailHashTableImpl<K, V> implements HashTable<K, V> {

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }
    }

    //Элементы основного массива -> LinkedList
    private final LinkedList<Item<K, V>>[] dataArray;
    private int size;

    @SuppressWarnings("unchecked")
    public TailHashTableImpl(int maxSize) {

        this.dataArray = new LinkedList[maxSize];
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = new LinkedList<>();
        }
    }

    //формирование хешключа относительно размера массива
    private int hashFunc(K key) {
        return key.hashCode() % dataArray.length;
    }

    @Override
    public boolean put(K key, V value) {
        int arrayIndex = hashFunc(key); // индекс основного массива
        int listIndex = indexOf(key);   // ключ
        if (listIndex != -1) {
            dataArray[arrayIndex].get(listIndex).value = value;
            return true;
        }
        dataArray[arrayIndex].add(new Item<>(key, value));
        size++;
        return true;
    }

    @Override
    public V get(K key) {
        int arrayIndex = hashFunc(key);
        int listIndex = indexOf(key);
        return listIndex != -1 ? dataArray[arrayIndex].get(listIndex).value : null;
    }

    @Override
    public V remove(K key) {
        int arrayIndex = hashFunc(key);
        int listIndex = indexOf(key);
        if (listIndex == -1) {
            return null;
        }

        Item<K, V> item = dataArray[arrayIndex].remove(listIndex);
        size--;
        return item.value;
    }

    private int indexOf(K key) {
        int listIndex = hashFunc(key);
        LinkedList<Item<K, V>> items = dataArray[listIndex];
        for (int i = 0; i < items.size(); i++) {
            Item<K, V> item = items.get(i);
            if (item.key.equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public void display() {
        System.out.println("Tail Hash Table:");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.printf("%d = [%s]", i, dataArray[i]);
            System.out.println();
        }
    }
}
