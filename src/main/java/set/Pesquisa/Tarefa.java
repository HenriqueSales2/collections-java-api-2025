package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean tarefaConcluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
//        this.tarefaConcluida = tarefaConcluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isTarefaConcluida() {
        return tarefaConcluida;
    }

    public void setTarefaConcluida(boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }

    @Override
    public String toString() {
        return "Descricao: " + descricao + " | Tarefa Concluida: " + tarefaConcluida;
    }
}
