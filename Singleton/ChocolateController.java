package hf.dp.Singleton;

import hf.dp.Observer.*;

public class ChocolateController
{
    public static void main(String[] args)
    {
        MyHWInfo.printInfo();

        ChcolateBoiler boiler = ChcolateBoiler.getInstance();
        ChcolateBoiler boiler2 = ChcolateBoiler.getInstance();

        boiler.fill();
        boiler2.reportBoilerState();
        boiler.boil();
        boiler2.reportBoilerState();
        boiler.drain();
        boiler2.reportBoilerState();
    }
}
