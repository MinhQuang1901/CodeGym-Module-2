package student_managament;

import java.util.Scanner;

public class StudentManager {
    public static Student[] students = new Student[10];

    static Scanner scanner = new Scanner(System.in);

    static {
        students[0] = new Student(1, "Quang");
        students[1] = new Student(2, "Hậu");
        students[2] = new Student(3, "Huy");
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        boolean flag = true;
        do{
            System.out.println("Chọn chức năng\n" +
                    "1.Danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Xóa\n" +
                    "4.Chỉnh sửa\n" +
                    "5.Thoát");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    System.out.println("Hiển thị danh sách");
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    studentManager.add();
                    break;
                case 3:
                    System.out.println("Xóa");
                    break;
                case 4:
                    System.out.println("Chỉnh sửa");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
        System.out.println("Kết thúc chương trình");
    }

    public void showList(){
        for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                System.out.println(students[i]);
            }
        }
    }

    public void add(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        Student newStudent = new Student(id,name);
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = newStudent;
                break;
            }
        }
    }
}
