/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternabstractfactory.concreteClasses;

import patternabstractfactory.interfaces.IB;

/**
 *
 * @author pupys
 */
public class Style1B implements IB{

    @Override
    public String toSting() {
        return "product B, style1";
    }
    
}
