package moldovan.christine.finalexam.Course;

import moldovan.christine.finalexam.Course.CourseEnums.CourseDate;
import moldovan.christine.finalexam.Course.CourseEnums.CourseLink;
import moldovan.christine.finalexam.Course.CourseEnums.CourseNames;

public class Course {
    //builder design pattern
    private CourseNames courseName;
    private CourseDate courseDate;
    private CourseLink courseLink;

    public Course(Builder builder) {
        this.courseName = builder.courseName;
        this.courseDate = builder.courseDate;
        this.courseLink = builder.courseLink;

    }

    public CourseNames getCourseName() {
        return courseName;
    }

    public CourseDate getCourseDate() {
        return courseDate;
    }

    public CourseLink getCourseLink() {
        return courseLink;
    }


    public void getCourseDetails() {
        if (courseDate == null && courseLink == null) {
            System.out.print("\n" + courseName + " details to be announced.\n");
        } else if (courseDate == null) {
            System.out.print("\n" + courseName + " will be" + " on Zoom (link -> " + courseLink + ")" + " with start time to be announced.\n");
        } else if (courseLink == null) {
            System.out.print("\n" + courseName + " starts at " + courseDate + " with Zoom link to be announced.\n");
        } else {
            System.out.print("\n" + courseName + " starts at " + courseDate + " on Zoom (link -> " + courseLink + ")." + "\n");
        }
    }


    public static class Builder {
        private CourseNames courseName;
        private CourseDate courseDate;
        private CourseLink courseLink;

        public Builder(CourseNames courseName) {
            if (courseName == null) {
                throw new IllegalArgumentException("Class name cannot be null");
            }
            this.courseName = courseName;
        }

        public Builder withCourseDate(CourseDate courseDate) {
            this.courseDate = courseDate;
            return this;
        }

        public Builder withCourseLink(CourseLink courseLink) {
            this.courseLink = courseLink;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }


}
