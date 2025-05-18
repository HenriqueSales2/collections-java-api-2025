package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Palavras {
    // atributo
    private String palavras;

    public Palavras(String palavras) {
        this.palavras = palavras;
    }

    public String getPalavras() {
        return palavras;
    }


    @Override
    public String toString() {
        return "palavra: " + palavras;
    }
}
