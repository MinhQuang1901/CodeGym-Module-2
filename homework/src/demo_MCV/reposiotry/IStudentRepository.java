package demo_MCV.reposiotry;

import demo_MCV.model.Student;

public interface IStudentRepository {
    Student[] findAll();

    Student findById(int id);

    void add(Student student);

    void delete(int id);
}
