package moldovan.christine.lab7.ex1;

public class CoffeeMaker {
    Coffee makeCoffee() {
        System.out.println("Make a coffee");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int nr = (int) (Math.random() * 100);
        Coffee coffee = new Coffee(t, c, nr);
        return coffee;
    }
}
