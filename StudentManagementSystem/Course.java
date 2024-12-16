import java.util.ArrayList;
import java.util.List;

public class Course {

    private int id;
    private String name;
    private static int nbr;
    private List<Student> enrolledStudent;
    private int maxStudentPerCourse; 


    public Course(String name,int maxStudentPerCourse){
        this.id=++nbr;
        this.name = name;
        this.maxStudentPerCourse=maxStudentPerCourse;
        this.enrolledStudent = new ArrayList<>();
    }

    public boolean Addstudent(Student student) throws Exception {
        if (enrolledStudent.contains(student)) {
            throw new Exception("Student is already enrolled.");
        }
        if (enrolledStudent.size() >= maxStudentPerCourse) {
            throw new Exception("Course is full.");
        }
        enrolledStudent.add(student);
        return true;
    }
    

    public boolean removeStudent(Student s){
        if(enrolledStudent.contains(s)){
            enrolledStudent.remove(s);
            return true;
        }
        return false;
    }

@Override
public String toString() {
    return "Course{name='" + name + "', enrolledStudents=" + enrolledStudent.size() + "}";
}


    public String getName() {
       return name;
    }



}
