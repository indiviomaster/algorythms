package ru.indivio.algorithms;

import ru.indivio.algorithms.tree.Tree;
import ru.indivio.algorithms.tree.TreeImpl;

import java.util.Random;


public class TestTree20 {
    static Integer  MAX = 25;
    static Integer  MIN = -25;
    static Integer  COL =64;

    public static void main(String[] args) {
        int range[] = new int[MAX-MIN];
        for (int i = 0; i < MAX-MIN; i++) {
            range[i] = MIN +i;
        }

        Random random = new Random();
        Integer element;
        Tree<Integer> tree;
        int countTrue =0;
        boolean flag = false;
        for (int j = 0; j < 20; j++) {
            tree = new TreeImpl<Integer>();
            for (int i = 0; i < COL; i++) {
                element = range[random.nextInt(MAX-MIN)];
                tree.add(element);
            }
            tree.display();
            flag = TreeImpl.isBalanced(tree.getRoot());
            System.out.println(flag);
            if(flag){
                countTrue++;
            }
        }
        System.out.println("Количество сбалансированных деревьев = "+countTrue);

    }


}
