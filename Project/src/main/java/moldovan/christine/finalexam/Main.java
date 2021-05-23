package moldovan.christine.finalexam;

import moldovan.christine.finalexam.Company.ITCompany;
import moldovan.christine.finalexam.Course.Course;
import moldovan.christine.finalexam.Course.CourseEnums.CourseDate;
import moldovan.christine.finalexam.Course.CourseEnums.CourseLink;
import moldovan.christine.finalexam.Course.CourseEnums.CourseNames;
import moldovan.christine.finalexam.Persons.Admin;
import moldovan.christine.finalexam.Persons.Coursant;
import moldovan.christine.finalexam.Persons.Trainer;

import java.io.*;
import java.util.*;


public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    private static boolean IS_LOGGED = false;
    private static ITCompany company = ITCompany.getInstance("IT Development Trainings");   // Singleton Pattern
    private static Admin admin;

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to " + company.getCompanyName());

        login();

        if (IS_LOGGED) {
            //adding data

            //Trainers
            Trainer trainer1 = new Trainer("Christine Moldovan", 20, "Java");
            Trainer trainer2 = new Trainer("Cara Ozi", 29, "Python");
            Trainer trainer3 = new Trainer("Cepoi Horatiu", 21, "C#");
            Trainer trainer4 = new Trainer("Ionescu Noel", 29, "Ruby");
            admin.addTrainer(trainer1);
            admin.addTrainer(trainer2);
            admin.addTrainer(trainer3);
            admin.addTrainer(trainer4);

            //Coursants
            Coursant coursant1 = new Coursant("Timotei Munteanu", 20, "Student");
            Coursant coursant2 = new Coursant("Emanuel Freiu", 23, "Student");
            Coursant coursant3 = new Coursant("Codrin Ungur", 26, "Employee");
            Coursant coursant4 = new Coursant("Nicusor Tudor", 41, "Employee");
            Coursant coursant5 = new Coursant("Rares Ghidiu", 35, "Employee");
            Coursant coursant6 = new Coursant("Viorel Pop", 48, "Employee");
            Coursant coursant7 = new Coursant("Mihaela Radun", 35, "Unemployed");

            admin.addCoursant(coursant1);
            admin.addCoursant(coursant2);
            admin.addCoursant(coursant3);
            admin.addCoursant(coursant4);
            admin.addCoursant(coursant5);
            admin.addCoursant(coursant6);
            admin.addCoursant(coursant7);

            // Courses
            var course1 = new Course.Builder(CourseNames.Java).withCourseDate(CourseDate.classOne).withCourseLink(CourseLink.LINKa).build();
            var course2 = new Course.Builder(CourseNames.C).withCourseDate(CourseDate.classTwo).withCourseLink(CourseLink.LINKb).build();
            var course3 = new Course.Builder(CourseNames.Python).withCourseDate(CourseDate.classThree).build();
            var course4 = new Course.Builder(CourseNames.NET).withCourseLink(CourseLink.LINKc).build();
            var course5 = new Course.Builder(CourseNames.Ruby).build();

            admin.addCourse(course1);
            admin.addCourse(course2);
            admin.addCourse(course3);
            admin.addCourse(course4);
            admin.addCourse(course5);

            showMenu();
        }
    }

    private static void login() throws IOException {
        Map<String, String> usersData = new HashMap<>();
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "C:\\Users\\chris\\Desktop\\Facultate\\sem2\\SE Lab\\30323_2_moldovan_christine_se_labs\\Project\\src\\main\\java\\moldovan\\christine\\finalexam\\InputData\\users_data.txt"));
        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(":");
            usersData.put(words[0], words[1]);
        }

        int chancesLeft = 3;
        System.out.println("\nPlease Enter Your Credentials:");
        while (chancesLeft != 0) {
            System.out.print("username:");
            String username = scanner.nextLine();
            System.out.print("password:");
            String password = scanner.nextLine();

            String filePass = usersData.get(username);

            if (filePass != null && filePass.equals(password)) {
                IS_LOGGED = true;
                System.out.println("\nLogin Successfully");

                admin = new Admin(username);
                System.out.println("Logged in as: " + admin.getUsername());
                break;
            } else {
                chancesLeft--;
                if (chancesLeft == 0) {
                    System.out.println("IP Banned, please contact support");
                    break;
                }
                System.out.println("\nInvalid Credentials, please try again. You have " + chancesLeft + " chances left");
            }
        }
    }


    private static void showMenu() throws IOException {
        String name;
        int age;

        System.out.println("---------------Menu---------------\n");
        System.out.println("1. Print all courses");
        System.out.println("2. Print all trainers");
        System.out.println("3. Print all coursants");
        System.out.println("4. Add a new trainer");
        System.out.println("5. Add a new coursant");
        System.out.println("6. Show all persons from company ");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1": {
                admin.showAllCourses();
                break;
            }
            case "2": {
                admin.showAllTrainers();
                break;
            }
            case "3": {
                admin.showAllCoursants();
                break;
            }
            case "4": {
                PrintWriter out = new PrintWriter(new FileWriter("newtrainers.txt"));
                System.out.print("\n----------------Adding new Trainer to Company----------------");
                System.out.print("\nPlease enter Trainer name: ");
                name = scanner.nextLine();
                out.println(name + ", ");

                System.out.print("\nPlease enter Trainer age: ");

                try {
                    age = scanner.nextInt();
                } catch (InputMismatchException a) {
                    System.out.println("Error! You must enter a number!");
                    break;
                }


                scanner.nextLine();
                System.out.print("\nPlease enter Trainer proficient Language: ");
                String language = scanner.nextLine();

                admin.addTrainer(new Trainer(name, age, language));

                break;
            }
            case "5": {
                System.out.print("\n----------------Adding new Coursant to Company----------------");
                System.out.print("\nPlease enter Coursant name: ");
                name = scanner.nextLine();
                System.out.print("\nPlease enter Coursant age: ");

                try {
                    age = scanner.nextInt();
                } catch (InputMismatchException a) {
                    System.out.println("Error! You must enter a number!");
                    break;
                }

                scanner.nextLine();
                System.out.print("\nPlease enter Coursant occupation: ");
                String occupation = scanner.nextLine();

                admin.addCoursant(new Coursant(name, age, occupation));
                break;
            }

            case "6": {
                admin.showPersonDetails();
                break;
            }

            default:
                System.out.println("Invalid Input");
        }
        System.out.print("\nDo you want to do another operation? ( YES / NO )\nInput:");
        userInput = scanner.nextLine();
        if (userInput.toUpperCase().equals("YES"))
            showMenu();
        else
            System.exit(0);

    }


}
