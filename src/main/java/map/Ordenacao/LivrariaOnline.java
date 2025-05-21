package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livroMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if(livroMap.isEmpty()) {
            livroMap.remove(titulo);
        }
    }

    // nao entendi muito bem esse!!!
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        // Passo 1: Coloca todas as entradas do mapa em uma lista
        List<Map.Entry<String, Livro>> listaLivros = new ArrayList<>(livroMap.entrySet());

        // Passo 2: Cria um comparador simples para comparar os preços dos livros
        Collections.sort(listaLivros, new Comparator<Map.Entry<String, Livro>>() {
            @Override
            public int compare(Map.Entry<String, Livro> e1, Map.Entry<String, Livro> e2) {
                double preco1 = e1.getValue().getPreco();
                double preco2 = e2.getValue().getPreco();
                return Double.compare(preco1, preco2);
            }
        });

        // Passo 3: Cria um novo mapa ordenado
        Map<String, Livro> mapaOrdenado = new LinkedHashMap<>();

        // Passo 4: Adiciona os livros já ordenados no novo mapa
        for (Map.Entry<String, Livro> entry : listaLivros) {
            mapaOrdenado.put(entry.getKey(), entry.getValue());
        }

        return mapaOrdenado;
    }


    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livroPorAutor = new HashMap<>();

        if (!livroMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
                Livro l = entry.getValue();
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.put(entry.getKey(), l);
                }
            }
        }

        return livroPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!livroMap.isEmpty()) {
            for (Livro l : livroMap.values()) {
                if(l.getPreco() > maiorPreco) {
                    livroMaisCaro = l;
                    maiorPreco = l.getPreco();
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!livroMap.isEmpty()) {
            for (Livro l : livroMap.values()) {
                if(l.getPreco() < menorPreco) {
                    livroMaisBarato = l;
                    menorPreco = l.getPreco();
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://a.co/d/3g4Cjek","You Love Me?", "Carolina Kepnes", 50);
        livrariaOnline.adicionarLivro("https://a.co/d/5LJF542","For You And Only You", "Carolina Kepnes", 60);
        livrariaOnline.adicionarLivro("https://a.co/d/gy0XgSU","Hidden Bodies", "Carolina Kepnes", 300);
        livrariaOnline.adicionarLivro("https://a.co/d/3u0GnFX","Guerra Civil", "Stuart Moore", 30);
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());
        System.out.println("Pesquisar por autor: \n" + livrariaOnline.pesquisarLivrosPorAutor("Carolina Kepnes"));
        System.out.println("Livro ordenado por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());
    }
}
