package hei.rattrapage.app.entities;

public record class User{
    public User(String id){
        this.id = id;
    }
    public User(String id, String email, String name,String firstName){
        this.id = id;
        this.email = email;
        this.name = name;
        this.firstName = firstName;
    }
    public String toString(){
        if(email == null || name == null || firstName == null){
            return "User{
                id='" + id + '\'' +
                '}';
        }
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
