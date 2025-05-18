package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        produtoSet.add(new Produto(nome,cod,preco,quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        // adicionei o TreeSet para deixar organizado por nome
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto 4", 1l, 15d, 5);
        cadastroProdutos.adicionarProduto("Produto 3", 2l, 19d, 2);
        cadastroProdutos.adicionarProduto("Produto 2", 1l, 47d, 3);
        cadastroProdutos.adicionarProduto("Produto 1", 9l, 10d, 7);
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }


}
