package moldovan.christine.finalexam.Course.CourseEnums;

import java.util.concurrent.ThreadLocalRandom;


public enum CourseDate {
    classOne(ThreadLocalRandom.current().nextInt(8, 14 + 1) + ":00"),
    classTwo(ThreadLocalRandom.current().nextInt(8, 14 + 1) + ":00"),
    classThree(ThreadLocalRandom.current().nextInt(8, 14 + 1) + ":00");


    private final String date;

    CourseDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date;
    }
}
