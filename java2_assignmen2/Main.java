package java2_assignmen2;

import  java.lang.String;
public class Main {
    public static void main(String[] args) {
        Student hocsinh1 = new Student("TH101","Thao",20);
        Student hocsinh2 = new Student("TH102","Quan",19);

        PersonModel<Student> lists1 = new PersonModel<>();
        lists1.addInfo(hocsinh1);
        lists1.addInfo(hocsinh2);
        lists1.showInfo();

        Employee nhanvien1 = new Employee("MD296","Ngoc",2500.01);
        Employee nhanvien2 = new Employee("MD410","Truong",3000.0);


        PersonModel<Employee> lists2 = new PersonModel<>();
        lists2.addInfo(nhanvien1);
        lists2.addInfo(nhanvien2);
        lists2.showInfo();
    }
}
