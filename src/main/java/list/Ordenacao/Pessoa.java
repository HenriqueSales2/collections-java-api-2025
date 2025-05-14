package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    // atributo
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    // vamos usar o Collections.sort() para chamar esse metodo aqui
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "nome: " + nome + "| idade: " + idade + "| altura: " + altura + "|\n";
    }


}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa primeiraIdade, Pessoa segundaIdade) {
        return Double.compare(primeiraIdade.getAltura(), segundaIdade.getAltura());
    }
}
