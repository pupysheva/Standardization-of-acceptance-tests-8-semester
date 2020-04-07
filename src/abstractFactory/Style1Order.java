/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import abstractFactory.interfaces.IFactory;

/**
 *
 * @author pupys
 */
public class Style1Order extends Order{
    public Style1Order(IFactory factory){
        id = 2;
        a = (factory.createA());
        b = (factory.createB());
    }
}
