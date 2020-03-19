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
public class Style2Factory implements IFactory{

    @Override
    public IA createA() {
        return new Style2A();
    }

    @Override
    public IB createB() {
        return new Style2B();
    }
    
}
