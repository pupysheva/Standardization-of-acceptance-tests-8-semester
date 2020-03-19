/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternstrategystandardizationpsi;

/**
 *
 * @author pupys
 */
public class ConcreteStrategyCar implements IStrategyNavigator{

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Маршрут для авто:"+shortestWay(a,b));
    }
    
    static String shortestWay (String a, String b){
        //код
        String result = "-> c -> w -> r -> m ->";
        return a + result + b;
    }
}
