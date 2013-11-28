/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.modelo.mamiferos;
import br.com.fourlinux.modelo.Animal;
/**
 *
 * @author robson
 */
public class Mamifero extends Animal {
    Mamifero (int numeroDePatas) {
        super(numeroDePatas);
    }
    public void mamar() {
        System.out.println("Mamando como um mamífero");
    }
}
