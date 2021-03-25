package moldovan.christine.lab5.ex1;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        color = "red";
        filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor() + " and it's " + isFilled();
    }

    abstract double getArea();

    abstract double getPerimeter();

}
