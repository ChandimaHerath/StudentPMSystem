package controller;

import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.StudentTM;
import service.StudentService;

public class SearchStudentController {
    public TextField txtQuery;
    public TableView<StudentTM> tblResults;

    private StudentService studentService = new StudentService();

    public void Initialize(){
        loadAllStudents();
    }

    private void loadAllStudents(){

    }
}
