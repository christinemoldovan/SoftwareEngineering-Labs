package moldovan.christine.finalexam.CourseTest;

import moldovan.christine.finalexam.Course.Course;
import moldovan.christine.finalexam.Course.CourseEnums.CourseDate;
import moldovan.christine.finalexam.Course.CourseEnums.CourseLink;
import moldovan.christine.finalexam.Course.CourseEnums.CourseNames;
import moldovan.christine.finalexam.Persons.Admin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {
    @Test
    void testConstructor() {
        Admin admin = new Admin("username");
        var course1 = new Course.Builder(CourseNames.Java).withCourseDate(CourseDate.classOne).withCourseLink(CourseLink.LINKa).build();
        admin.addCourse(course1);

        assertEquals("Java 8 Course", course1.getCourseName().toString());


    }
}
