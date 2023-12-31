package hf.dp.Decorator;

public class Soy extends CondimentDecorator
{
    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }

    public String getDescription()
    {
        return beverage.getDescription() + ", Soy ";
    }

    public double cost()
    {
        return .30 + beverage.cost();
    }
}
