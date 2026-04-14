import java.util.ArrayList;

    public class GerenciadorDeTarefas{
    GerenciadorDeTarefas(){

    }
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }   

    void listarTarefas(){
    tarefas.forEach(System.out::println);
    }

    void concluirTarefa(int id){
    for(Tarefa t : tarefas){
        if(t.getId() == id){
            t.setConcluida(true); 
            System.out.println("Tarefa concluída!");
            return;
        }
    }
    System.out.println("Tarefa não encontrada!");
}


   void removerTarefa(int id) {

    boolean removido = tarefas.removeIf(t -> t.getId() == id);

    if (removido) {
        System.out.println("Tarefa removida com sucesso!");
    } else {
        System.out.println("Tarefa não encontrada!");
    }
}

    void mostrarTarefasConcluidas(){
    tarefas.stream()
           .filter(t -> t.isConcluida())
           .forEach(System.out::println);
            }

    void mostrarTarefasPendentes(){
        tarefas.stream()   
               .filter(t -> !t.isConcluida())
               .forEach(System.out::println);
    }

  
    }
