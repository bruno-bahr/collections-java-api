package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List <Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasRemover);
	}
	
	public int numeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}
	
	
	@Override
	public String toString() {
		return "ListaTarefa [tarefaList=" + tarefaList + "]";
	}

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Estudar guitarra");
		listaTarefa.adicionarTarefa("Dar aula");
		System.out.println("O total de tarefas é " + listaTarefa.numeroTotalTarefas());
		System.out.println("----------------------------");
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("O total de tarefas é " + listaTarefa.numeroTotalTarefas());
		listaTarefa.obterDescricaoTarefas();
	}
	
}
