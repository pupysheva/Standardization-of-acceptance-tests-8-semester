/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import abstractFactory.interfaces.*;
import java.util.*;

/**
 *
 * @author pupys
 */
public abstract class Order {
    int id;
    List products = new ArrayList();
    IA a;
    IB b;
    
    @Override
    public String toString(){
        return "Order: " + this.id + "  " + this.a.toSting()+";  "+this.b.toSting();
    }
}
