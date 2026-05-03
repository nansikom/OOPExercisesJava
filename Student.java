import java.util.ArrayList;
import java.util.List;

class Student extends Users {
    // declaring the private variables in Java u specify the types
    public int hoursstudied_perday;
    int x = 5;
    private  String termname;
    private List<Double> grades;
    // Constructor to initialise the variables has to have the same name as the class
    public Student(String name , int id, String email, int hoursstudied_perday, String termname){
        // Can pass in none if you dont want the email to be part of the property.
        //super keyword serving for inheritance purposes 
        super(name, id, email);
        this.hoursstudied_perday= hoursstudied_perday;
        this.termname = termname;
        this.grades = new ArrayList<>();

    }
    // get the name
    // the getter of the gpa
    public String gettermname(){
        return termname;
    }

    void displayInfo(){
        System.out.println("Name:" + getname());
        System.out.println("ID:" + getid());
        System.out.println("Email:" + getemail());
    }
    void hardworkingstudent(){
        if (hoursstudied_perday > 4 ){
            System.out.println("Such a hardworking student");
        }
        else  {
            System.out.println("Lockin girl");
        }
    }
    // function to add grade to the grades list
    public void addgrade(double grade){
        grades.add(grade);
    }
    // function to add to the sum and divide by the grade size
    public double calculatestudentgpa(){
        if (grades == null || grades.isEmpty()){
            return 0.0;
        }
        double summ =0;
        for (double grade: grades){
            summ += grade;
        }
        System.out.println("Students gpa is" + summ/grades.size());
        return summ / grades.size();
    }
}
