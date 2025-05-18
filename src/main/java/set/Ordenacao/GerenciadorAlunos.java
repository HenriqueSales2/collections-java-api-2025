package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Set<Aluno> alunoParaRemover = new HashSet<>();
        for(Aluno a : alunoSet) {
            if(a.getMatricula() == matricula) {
                alunoParaRemover.add(a);
            }
        }
        alunoSet.removeAll(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        return alunoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;

    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        // nao pode ter matricula repetida
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Henrique", 123456789, 9.7);
        gerenciadorAlunos.adicionarAluno("Jaime", 987654321, 5.8);
        gerenciadorAlunos.adicionarAluno("Maria Joaquina", 123456789, 8.4);
        gerenciadorAlunos.adicionarAluno("Cirilo", 12344321, 9.2);
        gerenciadorAlunos.adicionarAluno("Daniel", 98766789, 3.9);
        gerenciadorAlunos.adicionarAluno("Valeria", 192837465, 3.7);
        gerenciadorAlunos.adicionarAluno("Helena", 564738291, 10.0);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(12344321);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    }
}
