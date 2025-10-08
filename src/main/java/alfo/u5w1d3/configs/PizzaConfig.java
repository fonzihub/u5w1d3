package alfo.u5w1d3.configs;

import alfo.u5w1d3.entities.Pizza;
import alfo.u5w1d3.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PizzaConfig {


    @Bean
    public Pizza margherita(Topping tomato, Topping cheese) {
        return new Pizza("margherita", 1104, 4.99, List.of(tomato,cheese));
    }

    @Bean
    public Pizza hawaiian(Topping tomato, Topping cheese, Topping ham, Topping pineapple) {
        return new Pizza("hawaiian", 2104, 4.99, List.of(tomato,cheese,ham,pineapple));
    }

    @Bean
    public Pizza PizzaSalami(Topping tomato, Topping cheese, Topping salami) {
        return new Pizza("salami", 2104, 5.99, List.of(tomato,cheese,salami));
    }


}
