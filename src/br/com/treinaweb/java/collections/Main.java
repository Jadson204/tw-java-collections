package br.com.treinaweb.java.collections;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa(1, "Treinaweb 1"));
        pessoas.add(new Pessoa(2, "Treinaweb 2"));
        System.out.println(pessoas.toString());
    }
}