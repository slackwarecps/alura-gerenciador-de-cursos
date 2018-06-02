/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author fabioalvaro
 */
public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitanto as ArrayLists", 21);
        Aula a2 = new Aula("Lista de objetos", 7);
        Aula a3 = new Aula("Aumentando o Relacionamento de listas e objetos", 15);
        
        ArrayList<Aula> aulas = new ArrayList<>();
        
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);
        
        //ordenar
        Collections.sort(aulas);
        System.out.println(aulas);
        
        Collections.sort(aulas,Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
        
        
        aulas.sort(Comparator.comparing(Aula::getTempo));
        
    }
    
}
