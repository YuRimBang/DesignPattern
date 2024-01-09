package hf.dp.Singleton;

public class ChcolateBoiler
{
    private boolean empty;
    private  boolean  boiled;
    private volatile static ChcolateBoiler uniqueInstance;

    private ChcolateBoiler()
    {
        empty = true;
        boiled = false;
    }

    public static ChcolateBoiler getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (ChcolateBoiler.class)
            {
                if(uniqueInstance == null)
                {
                    System.out.println("Creating unique instance of Chocolate Boiler");
                    uniqueInstance = new ChcolateBoiler();
                }
            }
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill()
    {
        if(isEmpty())
        {
            empty = false;
            boiled = false;
        }
    }

    public void drain()
    {
        if(!isEmpty() && isBoiled())
        {
            empty  = true;
        }
    }

    public void boil()
    {
        if(!isEmpty() && !isBoiled())
        {
            boiled  = true;
        }
    }

    public void reportBoilerState()
    {
        System.out.println("State: empty[" + empty + "]" + " boiled["+ boiled +"]");
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
