package moldovan.christine.finalexam.Company;

import moldovan.christine.finalexam.Course.Course;
import moldovan.christine.finalexam.Persons.Coursant;
import moldovan.christine.finalexam.Persons.Trainer;

import java.util.ArrayList;
import java.util.List;

public class ITCompany {
    //singleton design pattern
    private static ITCompany single_instance = null;
    //accesam cu numele clasei . numele metodei
    private String companyName;
    private List<Course> courses;
    private List<Trainer> trainers;
    private List<Coursant> coursants;


    private ITCompany(String companyName) {
        this.companyName = companyName;
        this.courses = new ArrayList<>();
        this.trainers = new ArrayList<>();
        this.coursants = new ArrayList<>();
    }

    public static ITCompany getInstance(String companyName) {
        if (single_instance == null)
            single_instance = new ITCompany(companyName);
        return single_instance;
    }

    public String getCompanyName() {
        return companyName;
    }


    public List<Course> getCourses() {
        return courses;
    }

    public List<Trainer> getTrainers() {
        return trainers;
    }

    public List<Coursant> getCoursants() {
        return coursants;
    }
}
