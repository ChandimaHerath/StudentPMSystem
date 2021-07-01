package model;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseName;
    private String courseID;
    private String courseFee;
    private String courseDuration;

    public Course(){

    }

    public Course(String courseName, String courseID, String courseFee, String courseDuration) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseFee = courseFee;
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
}
