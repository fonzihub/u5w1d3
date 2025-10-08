package alfo.u5w1d3.configs;

import alfo.u5w1d3.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {
    @Bean
    public Topping cheese(){
        return new Topping("cheese",92,0.69);
    }


    @Bean
    public Topping ham(){
        return new Topping("ham",22,1.69);
    }

    @Bean
    public Topping tomato(){
        return new Topping("tomato",22,1.69);
    }

    @Bean
    public Topping pineapple(){
        return new Topping("pineapple",12,2.69);
    }
    @Bean
    public Topping salami(){
        return new Topping("salami",52,3.69);
    }




}
