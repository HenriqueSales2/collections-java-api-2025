package main.java.list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompra {
    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();

        for(Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public void calculaValorTotal() {
        double valorTotal = 0.0;

        for (Item i : itemList) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }

        System.out.println("Valor total do carrinho: R$" + valorTotal);
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionarItem("Arroz" , 20, 2);
        carrinhoDeCompra.exibirItens();
        carrinhoDeCompra.removerItem("Arroz");
        carrinhoDeCompra.exibirItens();
        carrinhoDeCompra.adicionarItem("Feijao", 10, 5);
        carrinhoDeCompra.adicionarItem("Contra File", 50, 1);
        carrinhoDeCompra.adicionarItem("Pepsi", 10, 2);
        carrinhoDeCompra.exibirItens();
        carrinhoDeCompra.calculaValorTotal();
        carrinhoDeCompra.adicionarItem("Coca-Cola", 8, 5);
        carrinhoDeCompra.calculaValorTotal();
        carrinhoDeCompra.removerItem("Feijao");
        carrinhoDeCompra.removerItem("Contra File");
        carrinhoDeCompra.exibirItens();
        carrinhoDeCompra.calculaValorTotal();
    }


}
