package alfo.u5w1d3.entities;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;


@Getter
public class Topping {
    private String toppings;
    private int calories;
    private double price;


    public Topping(String toppings, int calories, double price) {
        this.toppings = toppings;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return   toppings ;


    }
}
