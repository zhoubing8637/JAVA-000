import java.util.List;


public class School {

    private List<Class> myClasses;

    public School(List<Class> myClasses) {
        this.myClasses = myClasses;
    }

    @Override
    public String toString() {
        return "MyClass::" + myClasses.toString();
    }
}