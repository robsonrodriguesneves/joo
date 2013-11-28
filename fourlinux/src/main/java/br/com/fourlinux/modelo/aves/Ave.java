/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.modelo.aves;
import br.com.fourlinux.modelo.Animal;
/**
 *
 * @author robson
 */
public class Ave extends Animal {
    Ave() {
        super(2);
    }
    public void voar() {
        System.out.println("Voando como uma ave!!!");
    }

}
