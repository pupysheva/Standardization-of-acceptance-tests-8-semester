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
public class Cheese extends AdditivestDecorator{
    Burger burger;
    public Cheese(Burger burger) {
        this.burger = burger;
    }
    public String getDescription() {
        return burger.getDescription() + " + Cheese";
    }
    public double cost() {
        return 15 + burger.cost();
    }
}