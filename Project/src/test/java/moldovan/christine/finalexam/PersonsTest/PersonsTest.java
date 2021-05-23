package moldovan.christine.finalexam.PersonsTest;

import moldovan.christine.finalexam.Persons.Admin;
import moldovan.christine.finalexam.Persons.Coursant;
import moldovan.christine.finalexam.Persons.Trainer;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonsTest {

    @Test
    void testConstructor() {

        Admin admin = new Admin("username");

        //Trainers
        Trainer trainer1 = new Trainer("Christine Moldovan", 20, "Java");
        admin.addTrainer(trainer1);
        assertEquals("Christine Moldovan", trainer1.getTrainerName());
        assertEquals(20, trainer1.getAge());
        assertEquals("Java", trainer1.getProficientLanguage());


        //Coursants
        Coursant coursant1 = new Coursant("Timotei Munteanu", 20, "Student");
        Coursant coursant2 = new Coursant("Emanuel Freiu", 23, "Student");
        admin.addCoursant(coursant1);
        admin.addCoursant(coursant2);

        assertEquals("Timotei Munteanu", coursant1.getCoursantName());
        assertEquals(23, coursant2.getCoursantAge());
        assertEquals("Student", coursant1.getOccupation());

    }
}
