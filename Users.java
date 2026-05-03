public class Users {
    private String name;
    private String email;
    private Integer id;
    // is to make sure people who access a method go thru the rightful methods
    // constructor
    public Users(String name, Integer id, String email){
        this.name = name;
        this.id = id;
        this.email= email;

    }
    public  String getname(){
        return name;
    }
     public Integer getid(){
        return id;
    }
    public String getemail(){
        return email;
    }
    public void setname(String newName){
        this.name = newName;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setid(Integer id){
        this.id = id;
    }
    
}
