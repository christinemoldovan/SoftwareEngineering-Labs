package moldovan.christine.finalexam.Persons;

import moldovan.christine.finalexam.Company.ITCompany;
import moldovan.christine.finalexam.Course.Course;

public class Admin implements Person {
    //composite that manages/controls the other classes
    private String username;
    //metode getInstance statica apeleaza direct prin numele clasei
    private ITCompany company = ITCompany.getInstance("IT Development Trainings");

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username + ", admin at the company: " + company.getCompanyName() + "\n";
    }


    @Override
    public void showPersonDetails() {
        showAllTrainers();
        showAllCoursants();
    }

    public void addTrainer(Trainer trainer) {
        company.getTrainers().add(trainer);
    }

    public void addCoursant(Coursant coursant) {
        company.getCoursants().add(coursant);
    }

    public void addCourse(Course course) {
        company.getCourses().add(course);
    }

    public void showAllCourses() {
        System.out.println("---------All company courses--------- ");
        company.getCourses().stream().forEach(course -> course.getCourseDetails());
    }

    public void showAllTrainers() {
        System.out.println("---------All company trainers--------- ");
        company.getTrainers().stream().forEach(trainer -> trainer.showPersonDetails());
    }

    public void showAllCoursants() {
        System.out.println("---------All company coursants--------- ");
        company.getCoursants().stream().forEach(coursant -> coursant.showPersonDetails());
    }


}
