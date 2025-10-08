package alfo.u5w1d3;

import alfo.u5w1d3.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5w1d3Application {

    public static void main(String[] args) {
        SpringApplication.run(U5w1d3Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d3Application.class);






        Menu menu = ctx.getBean(Menu.class);
        menu.menu();

        ctx.close();
    }


}
