package br.com.treinaweb.java.collections.comparadores;

import br.com.treinaweb.java.collections.models.Pessoa;

import java.util.Comparator;

public class PessoaTamanhoNomeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        // 0: o1 == o2
        if (o1.getNome().length() == o2.getNome().length()) {
            return 0;
        }
        // -1: o1 < o2
        if (o1.getNome().length() < o2.getNome().length()) {
            return -1;
        }
        // 1: o1 > o2
        return 0;
    }

}
