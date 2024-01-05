package demo_MCV.view;

import demo_MCV.controller.StudentController;
import demo_MCV.model.Student;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng\n" +
                    "1. Danh sách\n" +
                    "2. Thêm mới\n " +
                    "3. Xóa\n " +
                    "4. Chỉnh sửa\n " +
                    "5. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Hiển thị danh sách");
                    Student[] students = studentController.getAll();
                    displayStudent(students);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Student newStudent = inputDataStudent();
                    studentController.add(newStudent);
                    break;
                case 3:
                    System.out.println("Chức năng xóa");
                    System.out.println("Nhập id cần xóa");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    String deleteMessage = studentController.delete(deleteId);
                    System.out.println(deleteMessage);
                case 4:
                    System.out.println("Chức năng chỉnh sửa");

                    break;
                default:
                    flag = false;
            }
        }while (flag);

        System.out.println("Kết thúc chương trình ");
    }

    public static void displayStudent(Student[] students){
        for (Student student: students){
            if(student != null){
                System.out.println(student);
            } else {
                break;
            }
        }
    }

    public static Student inputDataStudent(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        Student student = new Student(id,name);
        return student;
    }
}
