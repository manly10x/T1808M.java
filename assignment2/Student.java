package assignment2;

public class Student {
    public String ID;
    public String Name;
    public Integer Age;

    public Student(String ID, String name, Integer age) {
        this.ID = ID;
        this.Name = name;
        this.Age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        this.Age = age;
    }
    public String toString(){
        return this.ID + " " + this.Name + " " + this.Age;
    }


}