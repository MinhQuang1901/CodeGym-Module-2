package ss5;

public class Student {
    private String name = "Baybe";
    private String classes = "CO2";

    public Student(){
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setClasses("Lop diu");

        System.out.println("Name: " + student.getName());
        System.out.println("Name: " + student.getClasses());
    }


}
