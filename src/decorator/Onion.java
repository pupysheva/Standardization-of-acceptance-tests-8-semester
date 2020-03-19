/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author pupys
 */
public class Onion extends AdditivestDecorator{
    Burger burger;
    public Onion(Burger burger) {
        this.burger = burger;
    }
    public String getDescription() {
        return burger.getDescription() + " + Onion";
    }
    public double cost() {
        return 20 + burger.cost();
    }
}
