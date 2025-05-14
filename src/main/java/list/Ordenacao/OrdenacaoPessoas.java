package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        // esse metodo vai entender que ele vai ter que ordernar as pessoas através do metodo comparable na classe Pessoa
        // dessa forma ordenamos pelo comparable
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        // dessa forma ordenamos pelo comparator
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Ana", 17, 1.65);
        ordenacaoPessoas.adicionarPessoa("Joao", 16, 1.70);
        ordenacaoPessoas.adicionarPessoa("Maria", 20, 1.69);
        ordenacaoPessoas.adicionarPessoa("Jose", 13, 1.85);
        ordenacaoPessoas.adicionarPessoa("Eduardo", 27, 1.92);
        ordenacaoPessoas.adicionarPessoa("Renato", 38, 1.81);
        ordenacaoPessoas.adicionarPessoa("Gabriel", 14, 1.64);
        ordenacaoPessoas.adicionarPessoa("Gustavo", 56, 1.76);
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordernarPorAltura());


    }

}
