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
public class Cheeseburger extends Burger {
    public Cheeseburger() {
        description = "Cheeseburger";
    }

    public double cost() {
        return 150;
    }
}
