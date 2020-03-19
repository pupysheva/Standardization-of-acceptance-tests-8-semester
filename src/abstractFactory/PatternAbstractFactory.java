/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractFactory;

import abstractFactory.concreteFactory.*;
import abstractFactory.interfaces.*;

/**
 *
 * @author pupys
 */
public class PatternAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1
        System.out.println("Test1");
        IFactory f1 = new Style1Factory();
        System.out.println(f1.createA().toSting());
        System.out.println(f1.createB().toSting());
        
        IFactory f2 = new Style2Factory();
        System.out.println(f2.createA().toSting());
        System.out.println(f2.createB().toSting());
        
        
        //2
        System.out.println("Test2");
        Order o1 = new Style1Order(new Style1Factory());
        Order o2 = new Style2Order(new Style2Factory());
        System.out.println(o1);
        System.out.println(o2);
    }
    
}
