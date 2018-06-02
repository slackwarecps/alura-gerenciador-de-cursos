/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;

/**
 *
 * @author fabioalvaro
 */
public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";
        
        
        ArrayList<String> aulas = new ArrayList<>();
        
        
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        
        System.out.println("Listas "+ aulas);
        aulas.remove(0);
        System.out.println("Listas "+ aulas);
        
        
        for (String aula: aulas){
            System.out.println("Aula: "+aula);
        } 
        
        
        
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira Aula é: "+primeiraAula);
        
        
        for (int i=0;i<aulas.size();++i) {
            System.out.println("aula :"+aulas.get(i));            
        }
        System.out.println(aulas.size());
        
        
        //java 8
        aulas.forEach(aula->{
            System.out.println("percorrendo :");
            System.out.println("Aula "+aula);
        });
        
        
    }
}
