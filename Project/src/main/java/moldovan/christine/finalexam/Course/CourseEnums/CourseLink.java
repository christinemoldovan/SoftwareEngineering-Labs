package moldovan.christine.finalexam.Course.CourseEnums;

import org.apache.commons.lang3.RandomStringUtils;

public enum CourseLink {
    LINKa("https://zoom.us/" + RandomStringUtils.randomAlphabetic(1) + "/" + RandomStringUtils.random(11, false, true) + "?pwd=" + RandomStringUtils.randomAlphanumeric(33)),
    LINKb("https://zoom.us/" + RandomStringUtils.randomAlphabetic(1) + "/" + RandomStringUtils.random(11, false, true) + "?pwd=" + RandomStringUtils.randomAlphanumeric(33)),
    LINKc("https://zoom.us/" + RandomStringUtils.randomAlphabetic(1) + "/" + RandomStringUtils.random(11, false, true) + "?pwd=" + RandomStringUtils.randomAlphanumeric(33));

    private final String name;

    CourseLink(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
