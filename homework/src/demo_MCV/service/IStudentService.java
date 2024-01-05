package demo_MCV.service;

import demo_MCV.model.Student;

public interface IStudentService {
    Student[] findAll();

    Student findById(int id);

    void add(Student student);

    void delete(int id);
}
