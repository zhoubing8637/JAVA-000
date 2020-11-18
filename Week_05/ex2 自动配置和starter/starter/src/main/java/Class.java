import java.util.ArrayList;
import java.util.List;

public class Class {
    private int id;
    private String name;

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "MyClass::" + students.toString();
    }
}
