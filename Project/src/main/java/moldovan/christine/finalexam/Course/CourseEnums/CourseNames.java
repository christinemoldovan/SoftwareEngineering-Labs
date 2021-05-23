package moldovan.christine.finalexam.Course.CourseEnums;

public enum CourseNames {
    Java("Java 8 Course"),
    Python("Python Machine Learning Course"),
    C("C# Course"),
    NET(".NET Course"),
    Ruby("Ruby Course");

    private final String title;

    CourseNames(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
