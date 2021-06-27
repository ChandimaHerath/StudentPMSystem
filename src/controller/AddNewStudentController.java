package controller;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Student;
import service.StudentService;

import java.time.LocalDate;

public class AddNewStudentController {
    public Button btnAdd;
    public Button btnCancel;
    public TextField txtName;
    public TextField txtNIC;
    public TextField txtEmail;
    public TextField txtTelephone;
    public TextField txtReceiptDate;
    public TextField txtAddress;
    public ComboBox txtCourse;
    public TextField txtBatchNo;
    public ComboBox txtPaymentMethod;
    public TextField Amount;
    public TextField RecieptDate;

    private StudentService studentService = new StudentService();

    public void onClickAdd(ActionEvent actionEvent) {
        Student student = new Student(txtName.getText(),txtNIC.getText(),txtTelephone.getText(),txtAddress.getText(),txtEmail.getText(),txtCourse.getAccessibleText(),txtBatchNo.getText(),txtPaymentMethod.getAccessibleText(),txtReceiptDate.getText());
        studentService.saveStudent(student);

    }

    public void onClickCancel(ActionEvent actionEvent) {
        Stage stage = (Stage) btnAdd.getScene().getWindow();
        stage.close();
    }
}
