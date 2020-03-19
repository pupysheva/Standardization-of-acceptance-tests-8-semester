/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.builders;

import builder.components.Day;
import builder.components.SpecialEvent;
import builder.components.Food;
import java.util.List;

/**
 *
 * @author pupys
 */
public class DayBuilder {
    private Day newDay;

    public DayBuilder() {
        newDay = new Day();
    }
    
    
    public DayBuilder addDate(String d) {
        newDay.setDate(d);
        return this;
    }
    
    public DayBuilder addSpecialEvents(List<SpecialEvent> events) {
        newDay.setEvents(events);
        return this;
    }
   
    public DayBuilder addHotel(String h) {
        newDay.setHotel(h);
        return this;
    }
    
    public DayBuilder addFoodList(List<Food> listFood){
        newDay.setListFood(listFood);
        return this;
    }
    
    public Day getVacationPlanner() {
        return newDay;
    }
}