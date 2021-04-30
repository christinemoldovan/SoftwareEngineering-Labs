package moldovan.christine.lab10.ex4;

import java.util.ArrayList;

public class Space {
    public static void main(String[] args) {
        ArrayList<Robot> robots = new ArrayList<>();
        //Robot r = new Robot("robot");

        for (int i = 0; i < 3; i++) {
            robots.add(new Robot("Robot " + i));
            WritePosition wp = new WritePosition(robots.get(i));
            wp.start();
        }
        for (int i = 0; i < robots.size(); i++) {
            new ReadPosition(robots.get(i));
        }
        for (int i = 0; i < robots.size(); i++) {
            for (int j = i + 1; j < robots.size(); j++) {
                if (robots.get(i).getX() == robots.get(j).getX() && robots.get(i).getY() == robots.get(j).getY()) {
                    System.out.println("Robot " + i + " collided with robot " + j);
                    robots.remove(robots.get(i));
                    robots.remove(robots.get(j));

                }

            }

        }
    }

}
