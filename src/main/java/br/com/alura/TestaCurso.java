/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.List;

/**
 *
 * @author fabioalvaro
 */
public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes Java","paulo Silveira");
        
        
        
       // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
        
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma aula",20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes",22));
        
        System.out.println(javaColecoes.getAulas());

        
        
    }
    
}
