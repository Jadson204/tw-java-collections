package br.com.treinaweb.java.collections;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {
        NavigableSet<Pessoa> set = new TreeSet<Pessoa>();
        set.add(new Pessoa(2, "Treinaweb 2"));
        set.add(new Pessoa(3, "Treinaweb 3"));
        set.add(new Pessoa(4, "Treinaweb 4"));
        set.add(new Pessoa(1, "Abel"));
        Pessoa teste = set.higher(new Pessoa(2, "Treinaweb 2"));
        System.out.println(teste);
        //set.add(null);
//        System.out.println(set);
//        set.add(new Pessoa(2, "Treinaweb 2"));
//        System.out.println(set);
//        for (Pessoa p : set) {
//            System.out.println(p);
//        }
    }

}
