package moldovan.christine.lab10.ex4;

public class Robot {
    int x, y;
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setXY(int a, int b) {
        x = a;
        y = b;
    }


}
