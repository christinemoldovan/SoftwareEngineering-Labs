package moldovan.christine.lab7.ex1;

public class CoffeeDrinker {
    void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException, NrOfCoffeesException {
        if (c.getTemp() > 60)
            throw new TemperatureException(c.getTemp(), "Coffee is too hot!");
        if (c.getConc() > 50)
            throw new ConcentrationException(c.getConc(), "Coffee concentration too high!");
        if (c.getNumber() > 3)
            throw new NrOfCoffeesException(c.getNumber(), "Too many coffees!");
        System.out.println("Drink coffee:" + c);
    }
}
