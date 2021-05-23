package moldovan.christine.finalexam.CompanyTest;

import moldovan.christine.finalexam.Company.ITCompany;
import moldovan.christine.finalexam.Course.Course;
import moldovan.christine.finalexam.Course.CourseEnums.CourseDate;
import moldovan.christine.finalexam.Course.CourseEnums.CourseLink;
import moldovan.christine.finalexam.Course.CourseEnums.CourseNames;
import moldovan.christine.finalexam.Persons.Admin;
import moldovan.christine.finalexam.Persons.Coursant;
import moldovan.christine.finalexam.Persons.Trainer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyTest {
    @Test
    void testConstructor() {
        ITCompany company = ITCompany.getInstance("IT");

        Admin admin = new Admin("username");

        assertEquals("IT", company.getCompanyName());

        //Trainers
        Trainer trainer1 = new Trainer("Christine Moldovan", 20, "Java");
        admin.addTrainer(trainer1);
        assertEquals(Arrays.toString(new Trainer[]{trainer1}), company.getTrainers().toString());

        //Coursants
        Coursant coursant1 = new Coursant("Timotei Munteanu", 20, "Student");
        Coursant coursant2 = new Coursant("Emanuel Freiu", 23, "Student");
        admin.addCoursant(coursant1);
        admin.addCoursant(coursant2);
        assertEquals(Arrays.toString(new Coursant[]{coursant1, coursant2}), company.getCoursants().toString());

        // Courses
        var course1 = new Course.Builder(CourseNames.Java).withCourseDate(CourseDate.classOne).withCourseLink(CourseLink.LINKa).build();
        admin.addCourse(course1);
        assertEquals(Arrays.toString(new Course[]{course1}), company.getCourses().toString());

    }


}
