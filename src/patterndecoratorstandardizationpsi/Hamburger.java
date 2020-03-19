/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterndecoratorstandardizationpsi;

/**
 *
 * @author pupys
 */
public class Hamburger extends Burger {
    public Hamburger() {
        description = "Hamburger";
    }

    public double cost() {
        return 170;
    }
}