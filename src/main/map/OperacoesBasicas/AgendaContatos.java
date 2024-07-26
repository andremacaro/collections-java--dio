package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroRetornado = null;
        if(!agendaContatoMap.isEmpty()){
            numeroRetornado = agendaContatoMap.get(nome);
        }
        return numeroRetornado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Contato1", 41234);
        agendaContatos.adicionarContato("Contato2", 41235);
        agendaContatos.adicionarContato("Contato3", 41236);
        agendaContatos.adicionarContato("Contato4", 41237);
        agendaContatos.adicionarContato("Contato4", 41238);
        agendaContatos.adicionarContato("Contato5", 41237);
        agendaContatos.exibirContato();

        agendaContatos.removerContato("Contato3");
        agendaContatos.exibirContato();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Contato4"));
    }
}
