package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefalist;

    public ListaTarefas() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        //lista.adicionarTarefa("Lavar a louça");
        System.out.println("Numero de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Lavar a louça");
        listaTarefas.adicionarTarefa("Fazer café");
        listaTarefas.adicionarTarefa("Lavar a louça");
        System.out.println("Numero de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Lavar a louça");
        System.out.println("Numero de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
