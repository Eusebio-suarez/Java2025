package people;

public class Person {
    //attributes
    String name;
    String gender;
    int ege;

    //constructor
    public Person (String name,String gender,int ege){
        this.name = name;
        this.gender = gender;
        this.ege = ege;
    }

    //getters and setters
    public  String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEge(){
        return this.ege;
    }

    public void setEge(int ege){
        this.ege = ege;
    }

    //show the information
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", ege=" + ege +
                '}';
    }
}
