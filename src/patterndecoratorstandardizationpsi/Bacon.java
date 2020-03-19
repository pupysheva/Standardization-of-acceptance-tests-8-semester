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
public class Bacon extends AdditivestDecorator{
    Burger burger;
    public Bacon(Burger burger) {
        this.burger = burger;
    }
    public String getDescription() {
        return burger.getDescription() + " + Bacon";
    }
    public double cost() {
        return 30 + burger.cost();
    }
}