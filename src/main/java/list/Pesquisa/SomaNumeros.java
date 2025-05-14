package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }
    public void calcularSoma() {
        double somaTotal = 0;

        for(Numero n : numeroList) {
            somaTotal += n.getNumero();
        }
        System.out.println("O valor total dos numeros: " + somaTotal);
    }

    public void encontrarMaiorNumero() {
        if(!numeroList.isEmpty()) {
            int maior = numeroList.get(0).getNumero();

            for (Numero n : numeroList) {
                if (n.getNumero() > maior) {
                    maior = n.getNumero();
                }

            }
            System.out.println("O maior número é " + maior);

        }
    }
    public void encontrarMenorNumero() {
        if(!numeroList.isEmpty()) {
            int menor = numeroList.get(0).getNumero();

            for (Numero n : numeroList) {
                if (n.getNumero() < menor) {
                    menor = n.getNumero();
                }

            }
            System.out.println("O menor número é " + menor);

        }
    }
    public void exibirNumeros() {
        System.out.println(numeroList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(16);
        somaNumeros.adicionarNumero(18);
        somaNumeros.adicionarNumero(20);
        somaNumeros.calcularSoma();
        somaNumeros.exibirNumeros();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();



    }
}
