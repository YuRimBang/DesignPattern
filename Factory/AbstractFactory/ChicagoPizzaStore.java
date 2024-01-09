package hf.dp.Factory.AbstractFactory;

public class ChicagoPizzaStore extends PizzaStore
{
    protected Pizza createPizza(String item)
    {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese"))
        {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style cheese Pizza");
        }else if(item.equals("veggie"))
        {
            pizza = new VeggiePizza((ingredientFactory));
            pizza.setName("Chicago Style Veggie Pizza");
        }else if(item.equals("clam"))
        {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }else if(item.equals("pepperoni"))
        {
            pizza = new PepperoniPizza((ingredientFactory));
            pizza.setName("Chicago Style pepperoni Pizza");
        }

        return pizza;
    }
}
