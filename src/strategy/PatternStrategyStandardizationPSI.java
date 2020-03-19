/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author pupys
 */
public class PatternStrategyStandardizationPSI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context();
 
        context.setStrategy(new ConcreteStrategyPeople());
        context.buildRoute("A","B");
 
        context.setStrategy(new ConcreteStrategyCar());
        context.buildRoute("C","D");
    }
    
}
