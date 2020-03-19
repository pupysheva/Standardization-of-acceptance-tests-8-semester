/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.components;

import java.util.Date;
import java.util.List;

/**
 *
 * @author pupys
 */
public class Day {
    private String date;
    private String hotel;
    private List<SpecialEvent> events;//Билеты в парк, музей, цирк
    private List<Food> listFood;


    public Day() {}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public List<SpecialEvent> getEvents() {
        return events;
    }

    public void setEvents(List<SpecialEvent> events) {
        this.events = events;
    }

    public List<Food> getListFood() {
        return listFood;
    }

    public void setListFood(List<Food> listFood) {
        this.listFood = listFood;
    }
    
}
