package alfo.u5w1d3.configs;

import alfo.u5w1d3.entities.Drink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {
    @Bean
    public Drink water() {
        return new Drink("Water", 0, 1.00);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade", 120, 2.50);
    }

    @Bean
    public Drink beer() {
        return new Drink("Beer", 180, 3.50);
    }
}
