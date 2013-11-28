/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.modelo;

/**
 *
 * @author robson
 */
public class Animal {
    private int numeroDePatas;
    protected Animal(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
    int getNumeroDePatas() {
        return numeroDePatas;
    }
    public void dormir() {
        System.out.println("Dormindo como um animal");
    }
    public void comer() {
        System.out.println("Comendo como um animal");
    }
    public void mover() {
        System.out.println("Movendo como um animal");
    }
    
}
