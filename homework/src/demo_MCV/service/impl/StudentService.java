package demo_MCV.service.impl;

import demo_MCV.model.Student;
import demo_MCV.reposiotry.IStudentRepository;
import demo_MCV.reposiotry.impl.StudentRepositoty;
import demo_MCV.service.IStudentService;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepositoty();

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }
}
