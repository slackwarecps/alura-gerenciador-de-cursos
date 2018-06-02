/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alura;

/**
 *
 * @author fabioalvaro
 */
public class Aula implements Comparable<Aula>{

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    private String titulo;
    private int tempo;
    
    public Aula(String titulo, int tempo){
        this.titulo = titulo;
        this.tempo = tempo;
    }
    
    public String getTitulo(){
     return titulo;
    }

    @Override
    public String toString() {
        return "[Aula:"+titulo+ ", "+ tempo +" minutos]";
    }

   @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }

   
    
    
    
}
