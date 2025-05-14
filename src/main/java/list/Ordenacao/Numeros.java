package main.java.list.Ordenacao;

import java.util.Comparator;

public class Numeros implements Comparable<Numeros> {
    // atributo
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(Numeros numeroAscendente) {
        return Integer.compare(numero, numeroAscendente.getNumeros());
    }


    public int getNumeros() {
        return numero;
    }

    @Override
    public String toString() {
        return "Números: " + numero + "\n";
    }

}

class ComparatorOrdemDescendente implements Comparator<Numeros> {

    @Override
    public int compare(Numeros numerosDescendentes1, Numeros numerosDescendentes2) {
        return Integer.compare(numerosDescendentes2.getNumeros(), numerosDescendentes1.getNumeros());
    }
}
