package moldovan.christine.lab3.Ex1;

public class Robot {
    int position;

    public Robot(int position) {
        this.position = 1;
    }

    void change(int k) {
        if (k >= 1) {
            this.position = this.position + k;
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                '}';
    }

    public int getPosition() {
        return position;
    }
}