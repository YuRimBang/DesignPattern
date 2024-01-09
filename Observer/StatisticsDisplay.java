package hf.dp.Observer;

public class StatisticsDisplay implements Observer, DisplayElement
{
    private Subject weatherData;

    private float max, min, sum;
    private int cnt;

    public StatisticsDisplay (Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        max = 0;
        min = 100;
        sum = 0;
        cnt = 0;

    }

    public void update(float temperature, float humidity, float pressure)
    {
        sum += temperature;
        cnt++;

        if(temperature > max)
        {
            max = temperature;
        }

        if(temperature < min)
        {
            min = temperature;
        }

        display();
    }

    public void display()
    {
        System.out.println("Avg/Max/Min temperature =  "+(sum/cnt)+"/"+max+"/"+min);
    }
}
