package br.com.treinaweb.java.collections;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Pessoa> queue = new PriorityQueue<>((p1, p2) -> {
            return p1.getNome().compareTo(p2.getNome());
        });
        queue.add(new Pessoa(3, "ATreinaweb 3"));
        queue.add(new Pessoa(1, "Treinaweb 1"));
        queue.add(new Pessoa(2, "Treinaweb 2"));
        System.out.println(queue);
        while (!queue.isEmpty()) {
            Pessoa p = queue.poll();
            System.out.println();
        }
    }
}
