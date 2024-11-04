
package entities;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private static int geradorID = 10;
    private int id;
    private String nome;
    private String descricao;
    public static List<Tarefa> listaDeTarefas = new ArrayList<>();

    public Tarefa(String nome, String descricao) {
        this.id = geradorID++;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", descricao=" + descricao;
    }
            
    
    
}
