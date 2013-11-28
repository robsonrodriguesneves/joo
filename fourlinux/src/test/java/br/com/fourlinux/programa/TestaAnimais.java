/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.programa;
import br.com.fourlinux.modelo.aves.Papagaio;
import br.com.fourlinux.modelo.mamiferos.Cachorro;
import br.com.fourlinux.modelo.mamiferos.Ornitorrinco;
/**
 *
 * @author robson
 */
public class TestaAnimais {
    public static void main (String[] args) {
        Cachorro rex = new Cachorro();
        Papagaio pirata = new Papagaio();
        Ornitorrinco orni = new Ornitorrinco();
        
        // Métodos herdados de Animal:
        rex.dormir();
        pirata.comer();
        orni.mover();
        
        // Método herdado de Mamifero:
        rex.mamar();
        orni.mamar();
        
        // Método herdado de Ave:
        pirata.voar();

    }
}
