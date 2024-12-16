import java.util.ArrayList;
import java.util.List;

class Student extends Person{

    private List<Course> enrolledCourses; 

    public Student(String fname,String lname,int age){
        super(fname,lname,age);
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Student: ").append(super.toString()).append("\nEnrolled Courses: ");
    for (Course course : enrolledCourses) {
        sb.append(course.getName()).append(", ");
    }
    return sb.toString();
}


    public void addCours(Course course){
        if(!enrolledCourses.contains(course)){
            try {
                if(course.Addstudent(this)){
                    enrolledCourses.add(course);
                }else{
                    System.out.println("Course is full");
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }else{
            System.out.println("Student is already enrolled in this course" +course.getName());
        }
    }

    public void removeCours(Course course){
        if(enrolledCourses.contains(course)){
            if(course.removeStudent(this)){
                enrolledCourses.remove(course);
            }else{
                System.out.println("Student is not enrolled in this course");
            }
        }else{
            System.out.println("Student is not enrolled in this course");
        }

    }

    public void lisstCours(){
        if(enrolledCourses.isEmpty()){
            System.out.println("No courses enrolled");
        }else{
            for(Course course : enrolledCourses){
                System.out.println(course);
            }
        }
    }
}