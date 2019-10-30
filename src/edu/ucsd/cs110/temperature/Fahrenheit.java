package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float c = (this.getValue() -32) * 5/9;
        Celsius temp = new Celsius(c);
        return temp;
    }

    @Override
    public Temperature toFahrenheit() {
        Fahrenheit temp = new Fahrenheit(this.getValue());
        return temp;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+this.getValue()+" F";
    }
}
