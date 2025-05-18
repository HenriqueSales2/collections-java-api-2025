package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefaParaRemover = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if(t.getDescricao().startsWith(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaSet.removeAll(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if(t.isTarefaConcluida() == true) {
                tarefaConcluida.add(t);
            }
        }
        return tarefaConcluida;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            if(t.isTarefaConcluida() == false) {
                tarefaPendente.add(t);
            }
        }
        return tarefaPendente;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaAtualizada = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(true);
                tarefaAtualizada  = t;
                break;
            }
        }
        return tarefaAtualizada ;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaConcluida(false);
                tarefaPendente  = t;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        Set<Tarefa> limparTudo = new HashSet<>();
        for(Tarefa t : tarefaSet) {
            limparTudo.add(t);
        }
        tarefaSet.removeAll(limparTudo);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        // testes funcionando!!

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 4");
        listaTarefa.adicionarTarefa("Tarefa 5");
        listaTarefa.adicionarTarefa("Tarefa 6");
        listaTarefa.adicionarTarefa("Tarefa 7");
        System.out.println("O numero total de tarefas eh: " + listaTarefa.contarTarefas());
        listaTarefa.marcarTarefaConcluida("Tarefa 1");
        System.out.println("Obtendo tarefas concluidas: " + listaTarefa.obterTarefasConcluidas());
        listaTarefa.marcarTarefaConcluida("Tarefa 2");
        listaTarefa.marcarTarefaConcluida("Tarefa 3");
        listaTarefa.marcarTarefaConcluida("Tarefa 4");
        System.out.println("Obtendo tarefas concluidas: " + listaTarefa.obterTarefasConcluidas());
//        listaTarefa.exibirTarefas();
        listaTarefa.marcarTarefaPendente("Tarefa 4");
        System.out.println("Obtendo tarefas concluidas: " + listaTarefa.obterTarefasConcluidas());
        System.out.println("Obtendo tarefas pendentes: " + listaTarefa.obterTarefasPendentes());
        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();

    }


}
