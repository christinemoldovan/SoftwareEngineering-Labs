package moldovan.christine.finalexam.PersonsTest;

import moldovan.christine.finalexam.Persons.Admin;
import moldovan.christine.finalexam.Persons.Coursant;
import moldovan.christine.finalexam.Persons.Trainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminTest {
    @Test
    void testConstructor() {
        Admin admin = new Admin("username");
        String expected = "username, admin at the company: IT Development Trainings\n";
        assertEquals(expected, admin.getUsername());


        //Trainers
        Trainer trainer1 = new Trainer("Christine Moldovan", 20, "Java");
        Trainer trainer2 = new Trainer("Cara Ozi", 20, "Python");
        admin.addTrainer(trainer1);
        admin.addTrainer(trainer2);

        //Coursants
        Coursant coursant1 = new Coursant("Timotei Munteanu", 20, "Student");
        Coursant coursant2 = new Coursant("Emanuel Freiu", 23, "Student");
        admin.addCoursant(coursant1);
        admin.addCoursant(coursant2);


    }
}
