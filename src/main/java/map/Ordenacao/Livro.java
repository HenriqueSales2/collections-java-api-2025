package main.java.map.Ordenacao;


import java.util.Comparator;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }



    @Override
    public String toString() {
        return "Titulo: " + titulo + " | " + "Autor: " + autor + " | " + "Preço: " + preco + "\n";
    }

}

class ComparatorPorPreco implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco());
    }
}
