package builder.example;
import builder.builders.DayBuilder;
import builder.components.Day;
import builder.components.Food;
import builder.components.SpecialEvent;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Day newDay1 = new DayBuilder()
                .addDate("20 марта 2020")
                .addHotel("Hotel_1")
                .addSpecialEvents(new ArrayList() {{
                        add(SpecialEvent.MUSEUM);
                        add(SpecialEvent.THEATER);
                }})
                .getVacationPlanner();
        
        Day newDay2 = new DayBuilder()
                .addDate("21 марта 2020")
                .addHotel("Hotel_2")
                .addSpecialEvents(new ArrayList() {{
                        add(SpecialEvent.CINEMA);
                        add(SpecialEvent.CIRCUS);
                }})
                .addFoodList(new ArrayList() {{
                        add(Food.BREAKFAST);
                        add(Food.DINNER);
                }})
                .getVacationPlanner();
        
        List<Day> vacation = new ArrayList() {{
                        add(newDay1);
                        add(newDay2);
        }};
        
        
        //System.out.println("Day1: "+newDay1.getDate()+" - "+newDay1.getHotel()+" - "+newDay1.getEvents());
        //System.out.println("Day2: " + newDay2.getDate()+" - "+newDay2.getHotel()+" - "+newDay2.getEvents()+" - "+newDay2.getListFood());
        System.out.println("Day1: "+newDay1.toString());
        System.out.println("Day2: " + newDay2.toString());
    }
}
