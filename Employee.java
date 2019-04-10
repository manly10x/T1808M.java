package assignment2;

public class Employee {
    public String ID;
    public String Name;
    public Integer Salary;

    public Employee(String ID, String name, Integer salary) {
        this.ID = ID;
        Name = name;
        Salary = salary;
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

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String toString(){
        return this.ID + " " + this.Name + " " + this.Salary;
    }
}