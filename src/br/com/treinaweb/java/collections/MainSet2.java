package br.com.treinaweb.java.collections;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.HashSet;

public class MainSet2 {

    public static void main(String[] args) {
        HashSet<Pessoa> pessoas = new HashSet<Pessoa>();
        System.out.println(pessoas.add(new Pessoa(1, "Treinaweb 1")));
        System.out.println(pessoas);
        System.out.println(pessoas.add(new Pessoa(2, "Treinaweb 2")));
        System.out.println(pessoas.add(new Pessoa(3, "Treinaweb 3")));
        System.out.println(pessoas.add(new Pessoa(4, "Treinaweb 4")));
        System.out.println(pessoas.add(new Pessoa(5, "Treinaweb 5")));
        System.out.println(pessoas.add(new Pessoa(6, "Treinaweb 6")));
        System.out.println(pessoas.add(new Pessoa(7, "Treinaweb 7")));
        System.out.println(pessoas.add(new Pessoa(8, "Treinaweb 8")));
        System.out.println(pessoas.add(new Pessoa(9, "Treinaweb 9")));
        System.out.println(pessoas.add(new Pessoa(10, "Treinaweb 10")));
        System.out.println(pessoas.add(new Pessoa(11, "Treinaweb 11")));
        System.out.println(pessoas.add(new Pessoa(12, "Treinaweb 12")));
        System.out.println(pessoas.add(new Pessoa(13, "Treinaweb 13")));
        System.out.println(pessoas.add(new Pessoa(14, "Treinaweb 14")));
        System.out.println(pessoas.add(new Pessoa(15, "Treinaweb 15")));
        System.out.println(pessoas.add(new Pessoa(16, "Treinaweb 16")));
        System.out.println(pessoas.add(new Pessoa(17, "Treinaweb 17")));
        System.out.println(pessoas);
    }
}
