/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterndecoratorstandardizationpsi;

/**
 *
 * @author pupys
 */
public class PatternDecoratorStandardizationPSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Burger b1 = new Hamburger();
        System.out.println(b1.getDescription()+ ": " + b1.cost() +"р");
        
        
        Burger b2 = new Cheeseburger();
        b2 = new Bacon(b2);
        b2 = new Bacon(b2);
        b2 = new Onion(b2);
        System.out.println(b2.getDescription()+ ": " + b2.cost()+"р");
        
        
        Burger b3 = new HotDog();
        b3 = new Jalapenos(b3);
        b3 = new Onion(b3);
        System.out.println(b3.getDescription()+ ": " + b3.cost()+"р");
    }
    
}
