package moldovan.christine.lab3.Ex3;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Ozzy", "ozzym@email.com", 'm');
        Author a2 = new Author("Lola", "lolase@email.com", 'f');
        a2.setEmail("newlola@mail.com");
        System.out.println(a1);
        System.out.println(a2);
    }

}