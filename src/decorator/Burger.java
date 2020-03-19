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
public abstract class Burger {
    String description = "Some burger";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
