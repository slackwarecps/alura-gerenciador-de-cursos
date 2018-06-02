/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.List;

/**
 * Diferenca entre List e Array list?
 * 
 * 
 * ArrayList Descende de List
 * 
 * @author fabioalvaro
 */
public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
    
    
    
    public Curso(String nome,String instrutor){
        super();
        this.nome=nome;
        this.instrutor=instrutor;
    
    }
    
}
