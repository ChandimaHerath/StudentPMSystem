package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

        private static final List<Student> studentDB = new ArrayList<>();
    public StudentService(){
        Student s1 = new Student("aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","456");
        Student s2 = new Student("bbb","ccc","ddd","eee","fff","ggg","hh","ii","789");
        saveStudent(s1);
        saveStudent(s2);
    }

    public void saveStudent(Student student){
        studentDB.add(student);


    }

    public void editStudent(Student student){
//        Student student = findStudent(s)

    }

    public void deleteStudent(String nic)
    {

    }

    public Student findStudent(String nic){
        for(Student student : studentDB){
            if(student.getNic().equals(nic)){
                return student;
            }
        }
        return null;
    }

    public List<Student> findAllStudents(String query){
    List<Student> result = new ArrayList<>();

    for(Student student : studentDB){
        if(student.getNic().contains(query)||student.getAddress().contains(query)||student.getEmail().contains(query)||student.getBatch().contains(query)||student.getTelephone().contains(query)){
            result.add(student);
        }
    }
     return result;
    }


}
