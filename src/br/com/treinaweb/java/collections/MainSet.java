package br.com.treinaweb.java.collections;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<Pessoa> set = new HashSet<Pessoa>();
        set.add(new Pessoa(1, "Treinaweb 1"));
        set.add(new Pessoa(2, "Treinaweb 2"));
        System.out.println(set);
        set.add(new Pessoa(2, "Treinaweb 2"));
        System.out.println(set);
    }

}
