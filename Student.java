import java.util.ArrayList;

public class Student {
    
    private String name;
    private String id;
    private ArrayList<Student> classmates;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.classmates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addClassmate(Student classmate) {
        this.classmates.add(classmate);
    }

    public static void main(String[] args) {
        Student me = new Student("Stephanie Becerra", "87654321");
        Student billyStudent = new Student("Billy Madison", "12345678");

        me.addClassmate(billyStudent);

        System.out.println("Student: " + me.getName());
        System.out.println("Student ID: " + me.getId());
        System.out.println(" ");
        System.out.println("Student: " + billyStudent.getName());
        System.out.println("Student ID: " + billyStudent.getId());
    }
}