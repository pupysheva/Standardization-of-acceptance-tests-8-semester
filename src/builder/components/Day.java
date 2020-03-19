/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.components;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Day{ ");
        String delimiter = " - ";
        if (date != null){
            result.append(date);
            result.append(delimiter);
        }
        if (hotel != null){
            result.append(hotel);
            result.append(delimiter);
        }
        if (events != null){
            result.append(String.join(", ", events.stream().map(Object::toString).collect(Collectors.toList())));
            result.append(delimiter);
        }
        if (listFood != null){
            result.append(String.join(", ", listFood.stream().map(Object::toString).collect(Collectors.toList())));
            result.append(delimiter);
        }
        result.setLength(result.length()-delimiter.length());
        result.append('}');
        return result.toString();
    }
    
}
