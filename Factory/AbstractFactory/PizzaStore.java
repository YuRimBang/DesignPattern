package hf.dp.Factory.AbstractFactory;

public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String item);
}
