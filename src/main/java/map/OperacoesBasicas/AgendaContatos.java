package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        // o metodo put serve tanto para adicionar, quanto para atualizar o valor
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        // isEmpty significa que está vazio, e o ponto de exclamação significa o "não"
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Henrique", 999);
        agendaContatos.adicionarContato("Ana", 111);
        agendaContatos.adicionarContato("Gabriel", 222);
        agendaContatos.adicionarContato("Maria", 555);
        agendaContatos.adicionarContato("Cecilia", 777);
        agendaContatos.adicionarContato("Henrique", 666);
        agendaContatos.adicionarContato("Henrique", 777);
        agendaContatos.exibirContato();
        agendaContatos.removerContato("Ana");
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Ana"));
        System.out.println(agendaContatos.pesquisarPorNome("Henrique"));


    }

}
