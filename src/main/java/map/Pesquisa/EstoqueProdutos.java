package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> mapaProdutos;

    public EstoqueProdutos() {
        this.mapaProdutos = new HashMap<>();
    }

    // Adiciona um produto ao estoque
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        mapaProdutos.put(codigo, new Produto(nome, preco, quantidade));
    }

    // Mostra todos os produtos do estoque
    public void mostrarProdutos() {
        System.out.println(mapaProdutos);
    }

    // Calcula o valor total de todos os produtos no estoque (preço * quantidade)
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!mapaProdutos.isEmpty()) {
            for (Produto p : mapaProdutos.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    // Retorna o produto mais caro (com maior preço unitário)
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!mapaProdutos.isEmpty()) {
            for (Produto p : mapaProdutos.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    // Retorna o produto mais barato (com menor preço unitário)
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!mapaProdutos.isEmpty()) {
            for (Produto p : mapaProdutos.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    // Retorna o produto com o maior valor total no estoque (preço * quantidade)
    public Produto obterProdutoComMaiorValorTotalNoEstoque() {
        Produto produtoMaiorValorTotal = null;
        double maiorValorTotal = 0d;
        if (!mapaProdutos.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : mapaProdutos.entrySet()) {
                double valorTotalProduto = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorTotalProduto > maiorValorTotal) {
                    maiorValorTotal = valorTotalProduto;
                    produtoMaiorValorTotal = entry.getValue();
                }
            }
        }
        return produtoMaiorValorTotal;
    }

    // Método principal para testar as funcionalidades
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(123456, "Produto 1", 12, 2);
        estoque.adicionarProduto(654321, "Produto 2", 45, 1);
        estoque.adicionarProduto(123654, "Produto 3", 5, 6);
        estoque.adicionarProduto(654123, "Produto 4", 10, 4);
        estoque.adicionarProduto(111111, "Produto 5", 20, 3);

        estoque.mostrarProdutos();

        System.out.println("O valor total dos produtos no estoque é: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior valor total no estoque: " + estoque.obterProdutoComMaiorValorTotalNoEstoque());
    }
}
