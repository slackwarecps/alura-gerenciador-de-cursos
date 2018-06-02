/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
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
    private List<Aula> aulas = new LinkedList<Aula>();

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
        //readonly
        return Collections.unmodifiableList(aulas);
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
    
    
    
    public Curso(String nome,String instrutor){
        super();
        this.nome=nome;
        this.instrutor=instrutor;
    
    }
    /**
     * Adiciona uma aula
     * @param aula 
     */
   public void adiciona(Aula aula){
       this.aulas.add(aula);
   }
    
}
