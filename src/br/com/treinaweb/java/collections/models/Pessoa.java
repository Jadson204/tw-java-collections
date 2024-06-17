package br.com.treinaweb.java.collections.models;

public class Pessoa {

    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa pessoa)) return false;

        if (getId() != pessoa.getId()) return false;
        return getNome() != null ? getNome().equals(pessoa.getNome()) : pessoa.getNome() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getNome() != null ? getNome().hashCode() : 0);
        return result;
    }
}
