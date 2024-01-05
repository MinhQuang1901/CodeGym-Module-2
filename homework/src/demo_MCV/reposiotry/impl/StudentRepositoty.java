package demo_MCV.reposiotry.impl;

import demo_MCV.model.Student;
import demo_MCV.reposiotry.IStudentRepository;

import java.util.Scanner;

public class StudentRepositoty implements IStudentRepository {
    public static final Student[] students = new Student[10];

    public static final Scanner scanner = new Scanner(System.in);

    static {
        students[0] = new Student(1, "Quang");
        students[1] = new Student(2, "Quang2");
        students[2] = new Student(3, "Quang3");
    }

    @Override
    public Student[] findAll(){
        return students;
    }

    @Override
    public Student findById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id){
                return students[i];
            }
        }
        return null;
    }

    @Override
    public void add(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete(int id){
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id){
                for (int j = 0; j < students.length; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
            }
        }
    }
}
