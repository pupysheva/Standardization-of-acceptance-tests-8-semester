/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternabstractfactory;

import java.util.*;

/**
 *
 * @author pupys
 */
public abstract class Order {
    int id;
    List products = new ArrayList();
    
    @Override
    public String toString(){
        return "Order: " + this.id + "  " + this.products;
    }
}
