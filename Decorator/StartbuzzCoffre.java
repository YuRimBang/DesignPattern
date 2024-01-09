package hf.dp.Decorator;

import hf.dp.Strategy.MyHWInfo;

public class StartbuzzCoffre {
    public static void main(String args[]) {
        MyHWInfo.printInfo();

        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + PriceFormatter.formatPrice(beverage.cost()));

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + PriceFormatter.formatPrice(beverage2.cost()));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "$" + PriceFormatter.formatPrice(beverage3.cost()));
    }
}
