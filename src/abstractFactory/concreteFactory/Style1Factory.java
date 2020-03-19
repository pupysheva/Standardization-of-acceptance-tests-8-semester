/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory.concreteFactory;

import abstractFactory.concreteClasses.*;
import abstractFactory.interfaces.*;

/**
 *
 * @author pupys
 */
public class Style1Factory implements IFactory{

    @Override
    public IA createA() {
        return new Style1A();
    }

    @Override
    public IB createB() {
        return new Style1B();
    }
    
}
