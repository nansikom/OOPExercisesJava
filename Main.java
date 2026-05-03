 
public class  Main {
    public static void main(String[] args){
        // Passing in the variables of the student class 
        Student s = new Student("Mary", 101,"nansikom", 8, "Spring");
        Student d  = new Student("Fifi", 102,"fifi@osu" ,7, "Winter");
        Student x = new Student("JLand",258,"jland@osu", 10, "Fall");
        s.addgrade(88);
        s.addgrade(22);
        s.addgrade(33);
        d.addgrade(22);
        d.addgrade(57);
        x.addgrade(45);
        x.addgrade(88);
        x.calculatestudentgpa();
        d.calculatestudentgpa();
        s.calculatestudentgpa();
        // Passing in the variable, 258s of the course class 
        Course c = new Course("Data Structures", 3467);
        Course r = new Course("Mathematics", 3463);
        Course t = new Course("English", 2368);
        s.displayInfo();
        d.displayInfo();
        x.displayInfo();
        s.hardworkingstudent();
        d.hardworkingstudent();
        x.hardworkingstudent();
        c.enrollStudent(s);
        r.enrollStudent(d);
        t.enrollStudent(x);
        Instructor w = new Instructor("Miatta", 303, "miatta@oregonstate.edu", 45);
        c.assignInstructor(w);
        t.assignInstructor(w);
        r.assignInstructor(w);
        c.showstudent();
        t.showstudent();
        r.showstudent();
       


        
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 