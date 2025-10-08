package alfo.u5w1d3.entities;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;


@Getter
public class Drink {
    private String drinks;
    private int calories;
    private double price;

    public Drink(String drinks, int calories, double price) {
        this.drinks = drinks;
        this.calories = calories;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Drink{" +
                "drinks='" + drinks + '\'' +

                ", price=" + price +
                '}';
    }
}
