package service;

import model.Course;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private static final List<Course> courseDB = new ArrayList<>();

    public CourseService() {
    }

    public void saveCourse(Course course){
        courseDB.add(course);
    }

    public void editCourse(Course course){

    }

    public void deleteCourse(Course course){

    }

}
