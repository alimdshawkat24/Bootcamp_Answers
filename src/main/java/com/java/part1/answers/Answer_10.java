package com.java.part1.answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Answer_10 {

    static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Vertex implements Comparable<Vertex> {
        int id;
        int distance;

        public Vertex(int id, int distance) {
            this.id = id;
            this.distance = distance;
        }

        @Override
        public int compareTo(Vertex other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    static class Graph {
        int vertices;
        List<List<Edge>> adjacencyList;

        public Graph(int vertices) {
            this.vertices = vertices;
            this.adjacencyList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
            	this.adjacencyList.add(new ArrayList<Edge>());
            }
        }

        public void addEdge(int source, int destination, int weight) {
            adjacencyList.get(source).add(new Edge(destination, weight));
            adjacencyList.get(destination).add(new Edge(source, weight));
        }

        public int[] dijkstra(int source) {
            int[] distances = new int[vertices];
            Arrays.fill(distances, Integer.MAX_VALUE);

            PriorityQueue<Vertex> minHeap = new PriorityQueue<>();
            minHeap.offer(new Vertex(source, 0));
            distances[source] = 0;

            while (!minHeap.isEmpty()) {
                Vertex current = minHeap.poll();

                for (Edge neighbor : adjacencyList.get(current.id)) {
                    int newDistance = distances[current.id] + neighbor.weight;

                    if (newDistance < distances[neighbor.destination]) {
                        distances[neighbor.destination] = newDistance;
                        minHeap.offer(new Vertex(neighbor.destination, newDistance));
                    }
                }
            }

            return distances;
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 7);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 1);

        int source = 0;
        int[] shortestDistances = graph.dijkstra(source);

        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To vertex " + i + ": " + shortestDistances[i]);
        }
    }
}