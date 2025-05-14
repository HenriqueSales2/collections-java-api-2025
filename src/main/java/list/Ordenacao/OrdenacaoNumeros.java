package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numeros> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(new Numeros(numero));
    }

    public List<Numeros> ordenarAscendente() {
        List<Numeros> numerosAscendentes = new ArrayList<>(numerosList);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Numeros> ordenarDescendente() {
        List<Numeros> numerosDescendentes = new ArrayList<>(numerosList);
        Collections.sort(numerosDescendentes, new ComparatorOrdemDescendente());
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(16);
        ordenacaoNumeros.adicionarNumero(97);
        ordenacaoNumeros.adicionarNumero(53);
        ordenacaoNumeros.adicionarNumero(72);
        ordenacaoNumeros.adicionarNumero(39);
        ordenacaoNumeros.adicionarNumero(25);
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
