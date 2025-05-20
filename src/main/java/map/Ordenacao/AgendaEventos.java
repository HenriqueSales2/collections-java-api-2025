package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.*;

public class AgendaEventos {
    /* o LocalDate utiliza a interface Comparator, ou seja ele consegue ordernar em
     ordem crescente */
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        // usamos o TreeMap para ordenar os eventos em ordem crescente
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {

        // dateSet retorna só as datas dos eventos
         Set<LocalDate> dateSet = eventosMap.keySet();
         // values retorna todos os tudo dos eventos usando o ToString
        Collection<Evento> values = eventosMap.values();
        // eventosMap.get();


        // usamos esse metodo para saber a data atual
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {

            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }


    }




    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();


        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 20), "Evento 0", "Atracao 0");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 21), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 22), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 23), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 24), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 25), "Evento 5", "Atracao 5");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

        System.out.println(LocalDate.now());
    }
}
