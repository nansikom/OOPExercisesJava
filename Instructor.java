import java.util.ArrayList;
import java.util.List;

public class Instructor extends Users{
    private Integer gradingid;
    private List<Student> students = new ArrayList<>();
    public Instructor(String name, Integer id, String email, Integer gradingid){
        super(name, id, email);
        this.gradingid= gradingid;
    }
    public Integer getgradingd(){
        return gradingid;
    }
    public void setgradingid(int gradingid){
        this.gradingid = gradingid;
    }
    
    
}
