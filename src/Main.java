import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        while(true){
            
        System.out.println("=====================");
        System.out.println("         MENU       ");
        System.out.println("=====================");
        
        System.out.println("1 - Adicionar Tarefa" +
                           "  2 - Listar Tarefas  "  +
                           "  3 - Concluir Tarefa  " + 
                           "  4 - Remover Tarefa  " + 
                           "  5 - Sair"
        );

        int resp = sc.nextInt();
        sc.nextLine();

         switch(resp){
            case 1:
                System.out.println("Digite o nome da tarefa: ");
                    String nome = sc.nextLine();
                System.out.println("Digite a descrição da tarefa: ");
                    String desc = sc.nextLine();

                Tarefa tarefa = new Tarefa(nome, desc);
                gerenciador.adicionarTarefa(tarefa);
                System.out.println("Tarefa criada com sucesso!");
                break;
            case 2:
                gerenciador.listarTarefas();
                break;
            case 3:
                System.out.println("Digite o id da tarefa que voce deseja concluir: ");
                int id = sc.nextInt();
                gerenciador.concluirTarefa(id);
                break;
            case 4:
                System.out.print("Digite o ID da tarefa: ");
                int idRemover = sc.nextInt();
                gerenciador.removerTarefa(idRemover);
                break;

            case 5:
                System.out.println("Saindo...");
                sc.close();
                return;
            
            default:
                System.out.println("Opção inválida.");
         }

        }

       
    }

}
