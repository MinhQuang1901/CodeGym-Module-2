package homework;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "John";
        this.classes = "CO2";
    }

    public Student(String name, String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Quang");
        student.setClasses("Lớp diu");

        System.out.println("Name: " + student.getName());
        System.out.println("Name: " + student.getClasses());
    }
}
