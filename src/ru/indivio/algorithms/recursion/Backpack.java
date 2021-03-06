package ru.indivio.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private final int maxWeight;
    private int totalPrice;
    private List<Thing> totalList = null;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private  int calcBackpackWeight(List<Thing> items) {
        int sumWeight = 0;
        for (Thing item : items) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    private int calcListPrice(List<Thing> things) {
        int sum = 0;
        for (Thing thing : things) {
            sum += thing.getPrice();
        }
        return sum;
    }

    private void bestList(List<Thing> things) {
        int sumPrice = calcListPrice(things);
        int sumWeight = calcBackpackWeight(things);
        if (sumWeight <= maxWeight && (totalList == null || sumPrice > totalPrice)) {
            totalList = things;
            totalPrice = sumPrice;
        }
    }

    public List<Thing> getTotalList() {
        return totalList;
    }

    public void calcBestList(List<Thing> things) {
        if (things.isEmpty()) {
            return;
        }

        bestList(things);

        for (int i = 0; i < things.size(); i++) {
            List<Thing> copyList = new ArrayList<>(things);
            copyList.remove(i);
            calcBestList(copyList);
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
