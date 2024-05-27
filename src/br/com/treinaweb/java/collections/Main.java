package br.com.treinaweb.java.collections;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa(1, "Treinaweb 1"));
        pessoas.add(new Pessoa(2, "Treinaweb 2"));

        System.out.println("Com FOR:");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            System.out.println(p);
        }
        System.out.println("Com ITERATOR");
        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
        while (iteratorPessoa.hasNext()) {
            Pessoa p = iteratorPessoa.next();
            System.out.println(p);
        }

        System.out.println("Com FOR-EACH");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        System.out.println("FIM!");
    }
}