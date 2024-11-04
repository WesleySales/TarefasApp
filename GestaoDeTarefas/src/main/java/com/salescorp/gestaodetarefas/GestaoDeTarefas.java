/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.salescorp.gestaodetarefas;

import entities.Tarefa;
import entities.TarefaDAO;

/**
 *
 * @author wesle
 */
public class GestaoDeTarefas {

    public static void main(String[] args) {
        
        TarefaDAO tDAO = new TarefaDAO();
        
        tDAO.cadastrarTarefa("Teste 1", "Tada");
        tDAO.cadastrarTarefa("Teste 2", "Tesa asde1");
        tDAO.cadastrarTarefa("Teste 3", "Tesa sadate1");
        
        System.out.println(tDAO.listarTarefas());
        
        tDAO.editarTarefa(10, "Teste de Alteracao", "Alterei esta tarefa");
        
        System.out.println(tDAO.listarTarefas());
       
    }
}
