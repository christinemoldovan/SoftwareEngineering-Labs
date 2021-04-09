package moldovan.christine.lab7.ex1;

public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeMaker mk = new CoffeeMaker();
        CoffeeDrinker d = new CoffeeDrinker();

        for (int i = 0; i < 15; i++) {
            Coffee c = mk.makeCoffee();
            try {
                d.drinkCoffee(c);
            } catch (TemperatureException e) {
                System.out.println("Exception:" + e.getMessage() + " temp=" + e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:" + e.getMessage() + " conc=" + e.getConc());
            } catch (NrOfCoffeesException e) {
                System.out.println("Exception:" + e.getMessage() + " nr. of coffees=" + e.getNr());
            } finally {
                System.out.println("Throw the coffee cup.\n");
            }
        }
    }
}
