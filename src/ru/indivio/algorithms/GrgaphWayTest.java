package ru.indivio.algorithms;

import ru.indivio.algorithms.graph.Graph;

public class GrgaphWayTest {

    public static void main(String[] args) {
        WayDfs();
    }

    private static void WayDfs() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Тамбов");
        graph.addVertex("Липецк");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");

        graph.addEdges("Москва","Тула");
        graph.addEdges("Тула","Липецк");
        graph.addEdges("Липецк","Воронеж");

        graph.addEdges("Москва","Рязань");
        graph.addEdges("Рязань","Тамбов");
        //graph.addEdges("Тамбов","Саратов");
        graph.addEdges("Саратов","Воронеж");

        //graph.addEdges("Москва","Липецк");
        graph.addEdges("Рязань","Липецк");

        graph.addEdges("Москва","Калуга");
        graph.addEdges("Калуга","Орел");
        graph.addEdges("Орел","Курск");
        graph.addEdges("Курск","Воронеж");

        System.out.println(graph.findWay("Москва","Саратов"));

    }

}
