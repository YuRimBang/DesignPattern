package hf.dp.Observer;

public class ForecastDisplay implements Observer, DisplayElement
{
    private float currentPressure;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay (Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        currentPressure = 0.0f;
        lastPressure = 0.0f;
    }

    public void update(float temperature, float humidity, float pressure)
    {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display()
    {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
