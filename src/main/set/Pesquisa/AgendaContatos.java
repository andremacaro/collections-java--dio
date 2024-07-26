package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarCOntato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
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

        agendaContatos.adicionarCOntato("Andre", 41123456);
        agendaContatos.adicionarCOntato("Andre", 41123458);
        agendaContatos.adicionarCOntato("Andre Macaro", 41123457);
        agendaContatos.adicionarCOntato("Andre Luiz", 41123457);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisaPorNome("Andre Macaro"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Andre Macaro", 40028922));
    }
}
