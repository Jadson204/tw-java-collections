package br.com.treinaweb.java.collections;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.Hashtable;

public class MainHashTable {

    public static void main(String[] args) {
        Hashtable<String, Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>();
        tabelaPessoas.put("legal", new Pessoa(1, "Treinaweb 1"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.put("chato", new Pessoa(2, "Treinaweb 2"));
        System.out.println(tabelaPessoas);
        System.out.println(tabelaPessoas.get("legal"));
        tabelaPessoas.put("legal", new Pessoa(3, "Treinaweb 3"));
        System.out.println(tabelaPessoas.get("legal"));
    }
}
