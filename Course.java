import java.util.List;
import java.util.ArrayList;


public class Course{
    // private variable for the CourseName
    private List<Student> enrollstudents = new ArrayList<>();
    private String courseName;
    private int courseid;
    private Instructor instructor;
    
    // Contructor
    public Course(String courseName, int courseid) {
        this.courseName = courseName;
        this.courseid = courseid;
    }
    public String courseName(){
        return courseName;
    }

    public int getcoursdeid(){
        return courseid;
    }
   
    void enrollStudent(Student i) {
        System.out.println(i.getname() + "is enrolled in coursename"  + courseName + "with courseid" + courseid);
        //List with our students 
        enrollstudents.add(i);
    }
    public void assignInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    public void  showstudent(){
        for (Student s: enrollstudents){
            System.out.println("studentname:" + s.getname() + "  studentid:" + s.getid() + " courseid:" + courseid + " courseName:" + courseName + " Termname:"  + s.gettermname() + "studentgpa:" + s.calculatestudentgpa() + "studentsInstructor" + instructor.getname());
        }
    }
} 