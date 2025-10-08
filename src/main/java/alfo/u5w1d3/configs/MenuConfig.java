package alfo.u5w1d3.configs;

import alfo.u5w1d3.entities.Drink;
import alfo.u5w1d3.entities.Menu;
import alfo.u5w1d3.entities.Pizza;
import alfo.u5w1d3.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Menu menu(List<Pizza> pizzas, List<Drink> drinks, List<Topping> toppings) {
        return new Menu(pizzas, drinks, toppings);
    }
}