package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    // Adiciona uma palavra com sua definição ao dicionário
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    // Remove uma palavra do dicionário, se o mapa não estiver vazio
    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    // Mostra todas as palavras e definições armazenadas
    public void mostrarPalavras() {
        System.out.println(dicionarioMap);
    }

    // Busca a definição de uma palavra no dicionário
    public String buscarPorPalavra(String palavra) {
        String definicaoDaPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            definicaoDaPalavra = dicionarioMap.get(palavra);
        }
        return definicaoDaPalavra;
    }

    // Método principal para testar as funcionalidades do dicionário
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Henrique", "Bonito");
        dicionario.adicionarPalavra("Ana", "Princesa");
        dicionario.adicionarPalavra("Gabriel", "Mau garoto");
        dicionario.adicionarPalavra("Maria", "Amor");
        dicionario.adicionarPalavra("Cecilia", "Incrível");
        dicionario.adicionarPalavra("Henrique", "Cachorro");
        dicionario.adicionarPalavra("Henrique", "Fortão"); // Substitui a definição anterior

        dicionario.mostrarPalavras();

        dicionario.removerPalavra("Ana");

        dicionario.mostrarPalavras();

        System.out.println(dicionario.buscarPorPalavra("Ana"));       // Deve imprimir: null
        System.out.println(dicionario.buscarPorPalavra("Henrique"));  // Deve imprimir: Fortão
    }
}
