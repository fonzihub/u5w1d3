package alfo.u5w1d3.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Menu {

    private List<Pizza> pizzas;

    private List<Drink> drinks;

    private List<Topping> toppings;

    public Menu(List<Pizza> pizzas, List<Drink> drinks, List<Topping> toppings) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    public void menu(){
    System.out.println("-----MENU-----");
    System.out.println("-----PIZZAS------");
    for(Pizza pizza : pizzas){
        System.out.println(pizza);
    }
    System.out.println("-----TOPPINGS-----");
    for(Topping t : toppings){
        System.out.println(t);
    }
    System.out.println("-----DRINKS---------");
    for (Drink drink : drinks){
        System.out.println(drink);
    }
}

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                ", drinks=" + drinks +
                ", toppings=" + toppings +
                '}';
    }
}
