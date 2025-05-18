package main.java.set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // atributo
    private Set<Palavras> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(new Palavras(palavra));
    }
    public void removerPalavra(String palavra) {
        Set<Palavras> palavraParaRemover = new HashSet<>();
        for(Palavras p : palavrasSet) {
            if(p.getPalavras().equalsIgnoreCase(palavra)) {
                palavraParaRemover.add(p);
            }
        }
        palavrasSet.removeAll(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        Palavras palavraPresente = null;
        if(!palavrasSet.isEmpty()) {
            for(Palavras p : palavrasSet) {
                if(p.getPalavras().equalsIgnoreCase(palavra)) {
                    palavraPresente = p;
                    System.out.println("A palavra está presente");
                    break;
                }
                else {
                    System.out.println("A palavra não está presente");
                    break;
                }
            }
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Academia");
        conjuntoPalavrasUnicas.adicionarPalavra("Feijao");
        conjuntoPalavrasUnicas.adicionarPalavra("Proteina");
        conjuntoPalavrasUnicas.adicionarPalavra("Regata");
        conjuntoPalavrasUnicas.adicionarPalavra("Musica");
        conjuntoPalavrasUnicas.adicionarPalavra("Gelo");
        conjuntoPalavrasUnicas.verificarPalavra("Academia");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Academia");
        conjuntoPalavrasUnicas.removerPalavra("Feijao");
        conjuntoPalavrasUnicas.removerPalavra("Proteina");
        conjuntoPalavrasUnicas.removerPalavra("Regata");
        conjuntoPalavrasUnicas.verificarPalavra("Regata");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }

}

