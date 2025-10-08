package alfo.u5w1d3.entities;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Getter
public class Pizza {
    private String pizzas;
    private int calories;
    private double price;
    private List<Topping> toppings;

    public Pizza(String pizzas, int calories, double price, List<Topping> toppings) {
        this.pizzas = pizzas;
        this.calories = calories;
        this.price = price;
        this.toppings = toppings;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "pizzas='" + pizzas + '\'' +

                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }
}
