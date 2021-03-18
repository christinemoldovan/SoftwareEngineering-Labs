package moldovan.christine.lab4.ex6;

public class Shape {
    private String color;
    private Boolean filled;

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
}
