package hf.dp.Factory.AbstractFactory;

public interface PizzaIngredientFactory
{
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperni();
    public Clams createClam();
}
