package moldovan.christine.lab3.Ex4;

public class MyPoint {
    public int x;
    public int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        double equation = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return equation;
    }

    public double getDistance(MyPoint anotherPoint) {
        return getDistance(anotherPoint.getX(), anotherPoint.getY());

    }


}