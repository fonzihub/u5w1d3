package alfo.u5w1d3.configs;

import alfo.u5w1d3.entities.Tavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("Application.properties")
public class TavoloConfig {


    @Bean(name = "tavolo_1")
    public Tavolo tavolo1Bean(@Value("${tavolo.coperto}")double coperto) {
        return new Tavolo(1, 4, true,coperto);
    }

    @Bean(name = "tavolo_2")
    public Tavolo tavolo2Bean(@Value("${tavolo.coperto}")double coperto) {
        return new Tavolo(2, 2, true,coperto);
    }


}
