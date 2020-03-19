/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternabstractfactory.concreteClasses;

import patternabstractfactory.interfaces.IA;

/**
 *
 * @author pupys
 */
public class Style2A implements IA{

    @Override
    public String toSting() {
        return "product A, style2";
    }
    
}
