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
public class ConcreteStrategyPeople implements IStrategyNavigator{

    @Override
    public void buildRoute(String a, String b) {
        System.out.println("Маршрут для человека:"+shortestWay(a,b));
    }
    
     static String shortestWay (String a, String b){
        //код
        String result = "-> e -> v -> x -> y ->";
        return a + result + b;
    }
}
