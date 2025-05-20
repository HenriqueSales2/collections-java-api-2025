package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavras() {
        this.contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavraMap.isEmpty()) {
            contagemPalavraMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavraMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int frequenciaMaxima = 0;
        if(!contagemPalavraMap.isEmpty()) {
            for(Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()) {
                if (entry.getValue() > frequenciaMaxima) {
                    palavraMaisFrequente = entry.getKey();
                    frequenciaMaxima = entry.getValue();
                }
            }
        }
        return palavraMaisFrequente + " | " + frequenciaMaxima;



    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra 0", 0);
        contagemPalavras.adicionarPalavra("Palavra 1", 1);
        contagemPalavras.adicionarPalavra("Palavra 2", 2);
        contagemPalavras.adicionarPalavra("Palavra 3", 3);
        contagemPalavras.adicionarPalavra("Palavra 4", 4);
        contagemPalavras.adicionarPalavra("Palavra 5", 5);
        contagemPalavras.adicionarPalavra("Palavra 6", 6);
        contagemPalavras.adicionarPalavra("Palavra 7", 7);
        contagemPalavras.adicionarPalavra("Palavra 1", 8);
        contagemPalavras.adicionarPalavra("Palavra 1", 9);
        contagemPalavras.adicionarPalavra("Palavra 1", 10);
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("Palavra 2");
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());





    }
}
