public class Tarefa {
    
    private static int contador = 1;

    private int ID;
    private String nome;
    private String descricao;
    private boolean concluida ;

    public Tarefa(String nome, String descricao) {
        this.ID = contador++;  
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false;   
    }

    @Override
    public String toString() {
    String statusTexto = concluida ? "CONCLUIDO" : "PENDENTE";
    return ID+ " - " + nome + " [" + statusTexto + "]";
}

int getId(){
    return ID;
}

String getNome(){
    return nome;
}
    
public boolean isConcluida(){
    return concluida;
}

public void setConcluida(boolean concluida) {
    this.concluida = concluida;
}

String getDescricao(){
    return descricao;
}


}
