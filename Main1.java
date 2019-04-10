package assignment2;

public class Main1 {
    public static void main(String[] args) {
        Student s1 = new Student("TH1808M", "Tran Khac Tiep",19);
        Student s2 = new Student("TH1808M","Vu Tien Chien",19);

        System.out.println(s1);
        System.out.println(s2);

        Employee e1 = new Employee("TH1808M", "Nguyen Thanh Tung", 19);
        Employee e2 = new Employee("TH1808M", "Le Thien Long", 19);

        System.out.println(e1);
        System.out.println(e2);

        PersonModel<Student> lists1 = new PersonModel<>();
        lists1.addInfo(s1);
        lists1.addInfo(s2);
        lists1.showInfo();

        PersonModel<Employee> lists2 = new PersonModel<>();
        lists2.addInfo(e1);
        lists2.addInfo(e2);
        lists2.showInfo();

        Student hocsinh1 = new Student("TH1808M","Tiep",19);
        Student hocsinh2 = new Student("TH1808M","Chien",19);

        PersonModel<Student> lists3 = new PersonModel<>();
        lists1.addInfo(hocsinh1);
        lists1.addInfo(hocsinh2);
        lists1.showInfo();

        Employee nhanvien1 = new Employee("T1808M","Tung",3000);
        Employee nhanvien2 = new Employee("T1808M","Long",5000);

        PersonModel<Employee> lists4 = new PersonModel<>();
        lists2.addInfo(nhanvien1);
        lists2.addInfo(nhanvien2);
        lists2.showInfo();
    }
}