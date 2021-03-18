package moldovan.christine.lab4.ex6;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.getLength();
    }


    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }


    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "A square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
