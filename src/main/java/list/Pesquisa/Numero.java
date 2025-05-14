package main.java.list.Pesquisa;

public class Numero {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    public Numero() {

    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "numeros: " + numero;
    }
}
