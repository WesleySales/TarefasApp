
package entities;

public class TarefaDAO {
    
    public void cadastrarTarefa(String nome, String descricao){
        Tarefa novaTarefa = new Tarefa(nome, descricao);
        Tarefa.listaDeTarefas.add(novaTarefa);
    }
    
    public void editarTarefa(int id, String novoNome, String novaDescricao){
        Tarefa t = buscarPorId(id);
        if(t!=null){
            t.setNome(novoNome);
            t.setDescricao(novaDescricao);
        }
    }
    
    public Tarefa buscarPorId(int id){
        if(!Tarefa.listaDeTarefas.isEmpty()){
            for(Tarefa t: Tarefa.listaDeTarefas){
                if(t.getId()==id){
                    return t;
                }
            }
        }
        return null;
    }
    
    public String listarTarefas(){
        StringBuilder sb = new StringBuilder();
        for(Tarefa t: Tarefa.listaDeTarefas){
            sb.append(t).append("\n");
        }  
        return sb.toString();
    }
    
    public Tarefa buscarPorNome(String nome){
        if(!Tarefa.listaDeTarefas.isEmpty()){
            for(Tarefa t: Tarefa.listaDeTarefas){
                if(t.getNome().equalsIgnoreCase(nome)){
                    return t;
                }
            }
        }
        return null;
    }
    
    public void deletarTarefa(int id){
        Tarefa t = buscarPorId(id);
        Tarefa.listaDeTarefas.remove(t);
    }
    
    
    
}
