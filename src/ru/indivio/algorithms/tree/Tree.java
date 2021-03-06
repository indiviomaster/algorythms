package ru.indivio.algorithms.tree;

public interface Tree<E extends Comparable<? super E>> {

    Node getRoot();

    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER,
    }

    void add(E value);

    boolean contains(E value);

    boolean remove(E value);

    boolean isEmpty();

    int size();

    void display();

    void traverse(TraverseMode mode);

}
