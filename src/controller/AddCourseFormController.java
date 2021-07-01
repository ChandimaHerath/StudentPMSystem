package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Course;
import service.CourseService;
import service.StudentService;

public class AddCourseFormController {
    public Button btnAdd;
    public Button btnCancel;
    public TextField txtCourseName;
    public TextField txtCourseID;
    public TextField txtCourseFee;
    public TextField txtCourseDuration;

    private CourseService courseService = new CourseService();

    public void onClickAdd(ActionEvent actionEvent) {
        Course course = new Course(txtCourseName.getText(),txtCourseID.getText(),txtCourseFee.getText(),txtCourseDuration.getText());
        courseService.saveCourse(course);
    }

    public void onClickCancel(ActionEvent actionEvent) {
        Stage stage = (Stage) btnCancel.getScene().getWindow();
        stage.close();

    }
}
