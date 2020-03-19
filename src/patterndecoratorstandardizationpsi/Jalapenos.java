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
public class Jalapenos extends AdditivestDecorator{
    Burger burger;
    public Jalapenos(Burger burger) {
        this.burger = burger;
    }
    public String getDescription() {
        return burger.getDescription() + " + Jalapenos";
    }
    public double cost() {
        return 15 + burger.cost();
    }
}
