package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // atributo

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            // usamos um novo metodo para podermos procurar um nome e até pessoas com mesmo nome
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Henrique", 123456);
        // esse Henrique nao foi adicionado, pois colocamos uma regra de negocio onde nao podemos colocar o mesmo nome
        agendaContatos.adicionarContato("Henrique", 76543);
        agendaContatos.adicionarContato("Henrique Java", 1111111);
        agendaContatos.adicionarContato("Henrique Python", 654789);
        agendaContatos.adicionarContato("Dev Junior", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Henrique"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Henrique Java", 1234));
        agendaContatos.exibirContatos();
    }
}
