package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        // criei uma lista vazia dentro dessa variavel tarefasParaRemover
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        // laço de repetição(for) para remover as tarefas desta lista
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        // remove tudo que está nessa variavel tarefasParaRemover
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        // metodo size retorna a quantidade de elementos (int) que tem dentro dessa lista
    return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("tarefa 1");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}
