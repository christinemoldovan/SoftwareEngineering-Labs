package moldovan.christine.finalexam.Persons;

public class Coursant implements Person {
    //composite
    private String coursantName;
    private int coursantAge;
    private String occupation;

    public Coursant(String coursantName, int coursantAge, String occupation) {
        this.coursantName = coursantName;
        this.coursantAge = coursantAge;
        this.occupation = occupation;
    }

    @Override
    public void showPersonDetails() {
        System.out.println(coursantName + ", " + coursantAge + ", " + occupation);
    }

    public String getCoursantName() {
        return coursantName;
    }

    public int getCoursantAge() {
        return coursantAge;
    }

    public String getOccupation() {
        return occupation;
    }
}
