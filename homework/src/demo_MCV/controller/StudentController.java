package demo_MCV.controller;

import demo_MCV.model.Student;
import demo_MCV.service.IStudentService;

public class StudentController {
    private final IStudentService studentService = new IStudentService() {
        @Override
        public Student[] findAll() {
            return new Student[0];
        }

        @Override
        public Student findById(int id) {
            return null;
        }

        @Override
        public void add(Student student) {

        }

        @Override
        public void delete(int id) {

        }
    };

    public Student[] getAll(){
        return studentService.findAll();
    }
    public void add(Student student){
        studentService.add(student);
    }

    public String delete(int id){
        Student student = studentService.findById(id);
        if (student != null){
            studentService.delete(id);
            return "Xóa thành công";
        } else {
            return "Id không tồn tại";
        }
    }
}
