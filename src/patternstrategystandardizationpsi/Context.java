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
public class Context {
    // Класс контекста использующий интерфейс стратегии
    private IStrategyNavigator strategy;
 
    public Context() {
    }
    public void setStrategy(IStrategyNavigator strategy) {
        this.strategy = strategy;
    }

    void buildRoute(String a, String b) {
        strategy.buildRoute(a,b);
    }
}
