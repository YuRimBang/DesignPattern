package hf.dp.Factory.AbstractFactory;

public abstract class Pizza
{
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;

    abstract public void prepare();

    public void bake(){ System.out.println("Bake for 25 minutes at 350"); }

    public void cut(){ System.out.println("Cuttring the pizza into diagonal slices");}
    public void box() { System.out.println("Place Pizza in official PizzaStore box");}

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return this.getName();
    }
}
