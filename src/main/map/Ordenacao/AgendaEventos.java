package main.map.Ordenacao;

import jdk.jfr.Event;
import main.map.OperacoesBasicas.AgendaContatos;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, nome);  Mesma coisa que abaixo
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaEventosOrdenada = new TreeMap<>(eventosMap);
        System.out.println(agendaEventosOrdenada);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
                                                                                    // Lógica de negócio: Se a data do evento
        Map<LocalDate, Evento> agendaEventosOrdenada = new TreeMap<>(eventosMap);   // for igual a data atual, ou se a data
        for(Map.Entry<LocalDate, Evento> entry : agendaEventosOrdenada.entrySet()){            // do evento for maior que a data atual
            if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 30), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JANUARY, 24), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.APRIL, 13), "Evento 3", "Atração 3");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
